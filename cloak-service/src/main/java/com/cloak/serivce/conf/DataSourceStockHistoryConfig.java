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

@Configuration
@MapperScan(basePackages = "com.cloak.history.dao", sqlSessionTemplateRef = "stockHistorySqlSessionTemplate")
public class DataSourceStockHistoryConfig {

    @Bean(name = "stockHistoryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.stockhistory")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "stockHistorySqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("stockHistoryDataSource") DataSource dataSource) throws Exception {
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
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:com/cloak/dao/stockhistory/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "stockHistoryTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("stockHistoryDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "stockHistorySqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("stockHistorySqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

}