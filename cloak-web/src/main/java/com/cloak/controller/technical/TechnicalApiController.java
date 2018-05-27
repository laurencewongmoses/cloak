package com.cloak.controller.technical;

import com.cloak.serivce.stock.technical.BaseHistoryService;
import com.cloak.technical.base.BaseStockHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PackageName: com.cloak.controller.technical
 * @ClassName: TechnicalApiController
 * @Author: wangpeng
 * @Description: (技术分析数据接口控制器)
 * @Date: 2018/5/24 下午2:14
 */
@Controller
@RequestMapping(value = "techApi")
public class TechnicalApiController {
    @Autowired
    BaseHistoryService baseHistoryService;

    /**
     * 根据代码查询历史日交易数据
     * @param stockNo
     * @return
     */
    @RequestMapping(value = "lists/{stockno}",method = RequestMethod.GET)
    @ResponseBody
    public List<BaseStockHistory> lists(@PathVariable(value = "stockno") String stockNo){
        return baseHistoryService.findAll(stockNo);
    }
}
