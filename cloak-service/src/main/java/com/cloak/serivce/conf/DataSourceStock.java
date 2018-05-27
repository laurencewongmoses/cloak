package com.cloak.serivce.conf;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * @PackageName: com.cloak.serivce.conf
 * @ClassName: DataSourceStock
 * @Author: wangpeng
 * @Description: (个股分析数据源配置类)
 * @Date: 2018/5/24 上午11:03
 */
@Configuration
@MapperScan(basePackages = "com.cloak.stock.dao", sqlSessionTemplateRef = "stockSqlSessionTemplate")
public class DataSourceStock {
    @Bean(name = "stockDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.stock")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }
    @Bean(name = "stockSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("stockDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        //分页插件
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("reasonable", "true"); // 输入页数为负或者超出最大页时候使页数为最小值或最大值
        properties.setProperty("supportMethodsArguments", "true"); // 支持通过Mapper接口参数来传递分页参数
        properties.setProperty("returnPageInfo", "check"); // 总是返回PageInfo类型,check检查返回类型是否为PageInfo,none返回Page
        properties.setProperty("params", "count=countSql");
        pageHelper.setProperties(properties);
        //添加插件
        bean.setPlugins(new Interceptor[]{pageHelper});

        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/cloak/stock/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "stockTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("stockDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "stockSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("stockSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
