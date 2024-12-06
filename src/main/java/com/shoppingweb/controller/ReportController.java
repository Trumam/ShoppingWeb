package com.shoppingweb.controller;

import com.shoppingweb.common.Result;
import com.shoppingweb.entity.SalesReport;
import com.shoppingweb.service.ReportService;
import jakarta.annotation.Resource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/report")
public class ReportController {

    @Resource
    private ReportService reportService;

//    @GetMapping("/monthly")
//    public Result getMonthlySalesByYear(@RequestParam("year") int year) {
//        System.out.println(year);
//        List<SalesReport> salesReport = reportService.getMonthlySalesByYear(year);
//        return Result.success(salesReport);
//    }

    @GetMapping("/salesMoney")
    public Result getSalesMoneyByRange(@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                                        @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate end)  {
        List<SalesReport> salesReport = reportService.getSalesMoneyByRange(begin, end);
        return Result.success(salesReport);
    }
    @GetMapping("/salesNum")
    public Result getSalesNumByRange(@DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate begin,
                                        @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate end)  {
        List<SalesReport> salesReport = reportService.getSalesNumByRange(begin, end);
        return Result.success(salesReport);
    }

    @GetMapping("/salesTop")
    public Result top(
            @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate begin,
            @DateTimeFormat(pattern="yyyy-MM-dd") LocalDate end){
        List<SalesReport> salesReport = reportService.getTopByRange(begin, end);
        return Result.success(salesReport);
    }




}
