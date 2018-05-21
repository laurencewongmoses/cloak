package com.ben.controller;

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
