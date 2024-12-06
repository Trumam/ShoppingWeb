package com.shoppingweb.controller;


import com.shoppingweb.common.Result;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.Params;
import com.shoppingweb.entity.customer;
import com.shoppingweb.service.CusService;
import com.shoppingweb.service.GoodService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin//用于解决跨域问题
@RestController//是一个组合注解，等同于同时添加了@Controller和@ResponseBody注解
@RequestMapping("/cus")//用于将HTTP请求映射到对应的控制器类或者方法上，
public class CusController {

    @Resource
    private CusService cusService;
    @PostMapping("/login")
    public Result login(@RequestBody customer cus){
        customer loginUser = cusService.login(cus);
        return Result.success(loginUser);
    }

    @PostMapping
    public Result save(@RequestBody customer cus){
        System.out.println(cus.getId());
        if(cus.getId()== null){
            System.out.println("add");
            cusService.add(cus);
        }else {
            System.out.println(cus.getId());
            System.out.println("edit");
            cusService.edit(cus);
        }
        return Result.success();
    }

    @DeleteMapping("/del/{id}")
    public Result delete(@PathVariable("id") Integer id){
        cusService.delete(id);
        return Result.success();
    }

    @GetMapping("/get")
    public Result getCustomer(){
        List<customer> list = cusService.getCus();
        return Result.success(list);
    }

    @GetMapping("/search")
    public Result findBySearch(Params params){
        List<customer>list = cusService.findBySearch(params);
        return Result.success(list);
    }

    @GetMapping("/searchByAccount/{account}")
    public Result searchByAccount(@PathVariable("account") String account){
        customer customer = cusService.searchByAccount(account);
        return Result.success(customer);
    }





}






