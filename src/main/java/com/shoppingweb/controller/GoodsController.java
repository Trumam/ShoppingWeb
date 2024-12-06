package com.shoppingweb.controller;


import com.shoppingweb.common.Result;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.Params;
import com.shoppingweb.entity.ParamsGoods;
import com.shoppingweb.entity.customer;
import com.shoppingweb.service.CusService;
import com.shoppingweb.service.GoodService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodService goodService;

    @PostMapping
    public Result save(@RequestBody Goods goods){
        System.out.println(goods.getId());
        if(goods.getId()== null){
            System.out.println("add");
            goodService.add(goods);
        }else {
            System.out.println(goods.getId());
            System.out.println("edit");
            goodService.edit(goods);
        }
        return Result.success();
    }



    @DeleteMapping("/del/{id}")
    public Result delete(@PathVariable("id") Integer id){
        System.out.println("delete");
        goodService.delete(id);
        return Result.success();
    }

    @GetMapping("/get")
    public Result getGoods(){

        List<Goods> list = goodService.getGoods();
        return Result.success(list);
    }

    @GetMapping("/search")
    public Result findBySearch(ParamsGoods params){
        List<Goods>list = goodService.findBySearch(params);
        return Result.success(list);
    }

    @GetMapping("/selectById/{id}")
    public Result selectById(@PathVariable Integer id){
        Goods goods = goodService.selectById(id);
        return Result.success(goods);
    }





}






