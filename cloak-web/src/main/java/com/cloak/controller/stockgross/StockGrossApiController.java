package com.cloak.controller.stockgross;

import com.cloak.serivce.stock.stockgross.GrossCPIService;
import com.cloak.stockgross.GrossCPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PackageName: com.cloak.controller.stockgross
 * @ClassName: StockGrossApiController
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/26
 */
@Controller
@RequestMapping(value = "/gross")
public class StockGrossApiController {
    @Autowired
    GrossCPIService service;

    @RequestMapping(value = "/cpi")
    @ResponseBody
    public List<GrossCPI> cpi(){
        return service.findAll();
    }

}
