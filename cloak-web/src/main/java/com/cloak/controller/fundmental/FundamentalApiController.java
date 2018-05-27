package com.cloak.controller.fundmental;

import com.cloak.fundmental.*;
import com.cloak.serivce.stock.fundmental.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @PackageName: com.cloak.controller.fundmental
 * @ClassName: FundamentalApiController
 * @Author: wangpeng
 * @Description: (基本面分析接口控制器)
 * @Date: 2018/5/24 下午2:17
 */
@Controller
@RequestMapping(value = "/fundApi")
public class FundamentalApiController {

    @Autowired
    StockDebtpayingService stockDebtpayingService;

    @Autowired
    StockCashFlowService cashFlowService;

    @Autowired
    StockGrowthService stockGrowthService;

    @Autowired
    StockInfoService stockInfoService;

    @Autowired
    StockOperationService stockOperationService;

    @Autowired
    StockProfitService stockProfitService;

    @Autowired
    StockReportService stockReportService;

    /**
     * 根据代码,年份,季度查询偿债能力
     * @param stockno
     * @param year
     * @param quarter
     * @return
     */
    @RequestMapping(value = "/debt/{stockno}/{year}/{quarter}",method = RequestMethod.GET)
    @ResponseBody
    public List<StockDebtpaying> debtpayList(@PathVariable(value = "stockno")
          String stockno,@PathVariable(value = "year") int year,@PathVariable(value = "quarter") int quarter){
        return stockDebtpayingService.findAll(stockno,year,quarter);
    }

    @RequestMapping(value = "/cash/{stockno}/{year}/{quarter}",method = RequestMethod.GET)
    @ResponseBody
    public List<StockCashFlow> cashFlowList(@PathVariable(value = "stockno")
           String stockno, @PathVariable(value = "year") int year, @PathVariable(value = "quarter") int quarter){
        return cashFlowService.findAll(stockno,year,quarter);
    }


    @RequestMapping(value = "/growth/{stockno}/{year}/{quarter}",method = RequestMethod.GET)
    @ResponseBody
    public List<StockGrowth> growthList(@PathVariable(value = "stockno")
           String stockno, @PathVariable(value = "year") int year, @PathVariable(value = "quarter") int quarter){
        return stockGrowthService.findAll(stockno,year,quarter);
    }


    @RequestMapping(value = "/operation/{stockno}/{year}/{quarter}",method = RequestMethod.GET)
    @ResponseBody
    public List<StockOperation> operationList(@PathVariable(value = "stockno")
           String stockno, @PathVariable(value = "year") int year, @PathVariable(value = "quarter") int quarter){
        return stockOperationService.findAll(stockno,year,quarter);
    }

    @RequestMapping(value = "/profit/{stockno}/{year}/{quarter}",method = RequestMethod.GET)
    @ResponseBody
    public List<StockProfit> profitList(@PathVariable(value = "stockno")
            String stockno, @PathVariable(value = "year") int year, @PathVariable(value = "quarter") int quarter){
        return stockProfitService.findAll(stockno,year,quarter);
    }

    @RequestMapping(value = "/report/{stockno}/{year}/{quarter}",method = RequestMethod.GET)
    @ResponseBody
    public List<StockReport> reportList(@PathVariable(value = "stockno")
            String stockno, @PathVariable(value = "year") int year, @PathVariable(value = "quarter") int quarter){
        return stockReportService.findAll(stockno,year,quarter);
    }

    @RequestMapping(value = "/stockinfo/{stockno}",method = RequestMethod.GET)
    @ResponseBody
    public List<StockInfo> stockInfoList(@PathVariable(value = "stockno") String stockno){
        return stockInfoService.findStock(stockno);
    }

    @RequestMapping(value = "/stockinfo",method = RequestMethod.GET)
    @ResponseBody
    public List<StockInfo> stockInfoList(){
        return stockInfoService.findAll();
    }

}
