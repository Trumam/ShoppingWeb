package com.shoppingweb.controller;


import com.shoppingweb.common.Result;
import com.shoppingweb.entity.*;
import com.shoppingweb.service.GoodService;
import com.shoppingweb.service.OrderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/findAll")
    public Result findAll(){
        List<Order> order = orderService.findAll();
        return Result.success(order);
    }

    @GetMapping("/selectByAccount/{cusaccount}")
    public Result selectByAccount(@PathVariable String cusaccount){
        List<Order> order = orderService.selectByAccount(cusaccount);
        return Result.success(order);
    }
    @GetMapping("/selectAllInfo/{cusaccount}")
    public Result selectAllInfo(@PathVariable String cusaccount){
        List<Order> order = orderService.selectAllInfo(cusaccount);
        return Result.success(order);
    }


    @GetMapping("/search")
    public Result findBySearch(ParamsOrder params){
        List<Order>list = orderService.findBySearch(params);
        return Result.success(list);
    }




    @PostMapping("/submit")
    public Result submit(@RequestBody Order order){
        if(order.getOrder_id()== null){
            System.out.println("ADD");
            orderService.add(order);
        }else {
            orderService.edit(order);
        }
        return Result.success();
    }


    @PostMapping("/updatepaid")
    public Result updatepaid(@RequestBody Order order){
        orderService.updatepaid(order);
        return Result.success();
    }
    @PostMapping("/updateship")
    public Result updateship(@RequestBody Order order){
        orderService.updateship(order);
        return Result.success();
    }
    @PostMapping("/updatereceived")
    public Result updatereceived(@RequestBody Order order){
        orderService.updatereceived(order);
        return Result.success();
    }
    @PostMapping("/updatecompleted")
    public Result updatecompleted(@RequestBody Order order){
        orderService.updatecompleted(order);
        return Result.success();
    }

    @DeleteMapping("/del/{order_id}")
    public Result delete(@PathVariable("order_id") Integer order_id){
        orderService.delete(order_id);
        return Result.success();
    }



}
