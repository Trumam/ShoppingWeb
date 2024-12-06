package com.shoppingweb.controller;


import com.shoppingweb.common.Result;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.GoodsInCart;
import com.shoppingweb.entity.customer;
import com.shoppingweb.exception.CustomException;
import com.shoppingweb.service.CartService;
import com.shoppingweb.service.CusService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cart")
public class CartController {

    @Resource
    private CartService cartService;

    @GetMapping("/selectById/{cusaccount}")
    public Result selectByAccount(@PathVariable String cusaccount){
        List<GoodsInCart> goodsInCart = cartService.selectByAccount(cusaccount);
        return Result.success(goodsInCart);
    }


    @PostMapping("/add")
    public Result add(@RequestBody GoodsInCart goodsInCart){
        cartService.add(goodsInCart);
        return Result.success();
    }

    @PostMapping("/updateNumberInCart")
    public Result updateNumberInCart(@RequestBody GoodsInCart goodsInCart){
        cartService.updateNumberInCart(goodsInCart);
        return Result.success();
    }

    @DeleteMapping("/del/{id}")
    public Result delete(@PathVariable("id") Integer id){
        cartService.delete(id);
        return Result.success();
    }




}
