package com.cloak.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloak.serivce.stock.BaseHistoryService;
import com.cloak.stock.base.BaseStockHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
/**
 * @PackageName: com.cloak.controller
 * @ClassName: HistoryController
 * @Author: wangpeng
 * @Description: (这里用一句话描述这个类)
 * @Date: 2018/5/21 下午7:33
 */
@Controller
@RequestMapping(value = "history")
public class HistoryController {

    @Autowired
    BaseHistoryService baseHistoryService;

    @RequestMapping(value = "names")
    @ResponseBody
    public JSONObject index(){
        JSONObject object = new JSONObject();
        object.put("name","wangpeng");
//        System.out.print(history000002Service.findAll());
        return object;
    }

    @RequestMapping(value = "lists/{stockno}",method = RequestMethod.GET)
    @ResponseBody
    public List<BaseStockHistory> lists(@PathVariable(value = "stockno") String stockNo){
        return baseHistoryService.findAll(stockNo);
    }
}
