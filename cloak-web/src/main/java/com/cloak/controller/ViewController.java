package com.cloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @PackageName: com.cloak.controller
 * @ClassName: ViewController
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/21 下午7:33
 */
@Controller
@RequestMapping(value = "/view")
public class ViewController {

    @RequestMapping(value = "/technical")
    public String history(){
        return "/technical/trend";
    }

    @RequestMapping(value = "/index")
    public String index(){
        return "/index";
    }

    @RequestMapping(value = "/blank")
    public String blank(){
        return "/blank";
    }


}
