package com.cloak.controller.technical;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName: com.cloak.controller
 * @ClassName: TechnicalController
 * @Author: wangpeng
 * @Description: (技术面分析页面控制器)
 * @Date: 2018/5/23 下午4:48
 */
@Controller
@RequestMapping(value = "/technical")
public class TechnicalController {
    //历史行情
    @RequestMapping(value = "/trend")
    public String history(){
        return "/technical/trend";
    }

    @RequestMapping(value = "/to100")
    public String to100(){
        return "/technical/to100";
    }

    //复权数据
    //实时行情
    //历史分笔
    //实时分笔
    //当日历史分笔
    //大盘指数行情列表
    //大单交易数据
}
