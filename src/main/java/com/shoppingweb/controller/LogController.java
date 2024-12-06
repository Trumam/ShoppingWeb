package com.shoppingweb.controller;


import com.shoppingweb.common.Result;
import com.shoppingweb.entity.Log;
import com.shoppingweb.entity.Order;
import com.shoppingweb.service.LogService;
import com.shoppingweb.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/log")
public class LogController {

    @Resource
    private LogService logService;

    @GetMapping("/findAll")
    public Result findAll(){
        List<Order> order = logService.findAll();
        return Result.success(order);
    }

    @PostMapping("/add")
    public Result submit(@RequestBody Log log){

        logService.add(log);
        return Result.success();
    }

    @GetMapping("/selectByAccount/{cusaccount}")
    public Result selectByAccount(@PathVariable String cusaccount){
        List<Log> logs = logService.selectByAccount(cusaccount);
        System.out.println("LOG");
        return Result.success(logs);
    }


}
