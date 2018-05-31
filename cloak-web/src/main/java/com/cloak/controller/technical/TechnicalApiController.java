package com.cloak.controller.technical;

import com.alibaba.fastjson.JSONObject;
import com.cloak.convert.ValTo100;
import com.cloak.enums.AIndex;
import com.cloak.math.JSONObjectMath;
import com.cloak.serivce.stock.technical.BaseHistoryService;
import com.cloak.technical.base.BaseStockHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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


    /**
     * 根据代码查询百分图
     * @param stockNo
     * @return
     */
    @RequestMapping(value = "to100/{stockno}",method = RequestMethod.GET)
    @ResponseBody
    public List<JSONObject> lists(@PathVariable(value = "stockno") String stockNo,
                                  @RequestParam Optional<String> field){
        String param = "close";
        String date_field = "date";
        if(field.isPresent()) param = field.get();
        List<JSONObject> ret = new ArrayList<>();
        List<BaseStockHistory> list = baseHistoryService.findAll(stockNo);
        //遍历所有指数
        for(AIndex aIndex:AIndex.values()){
            JSONObject temp = new JSONObject();
            temp.put("name",aIndex.getName());
            temp.put("data",val100(aIndex.getCode(),param,date_field));
            ret.add(temp);
        }

        List<JSONObject> thisStock = ValTo100.valTo100(list,param,date_field);
        List<JSONObject> handled = JSONObjectMath.fullDate(val100(AIndex.SH.getCode(),param,date_field),thisStock);

        JSONObject object = new JSONObject();
        object.put("name",stockNo);
        object.put("data",handled);
        ret.add(object);
        return ret;
    }

    private List<JSONObject> val100(String stockNo,String param,String date_field){
        return ValTo100.valTo100(baseHistoryService.findAll(stockNo),param,date_field);
    }
}
