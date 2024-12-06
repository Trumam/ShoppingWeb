package com.shoppingweb.controller;

import com.shoppingweb.common.Result;
import com.shoppingweb.entity.Address;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.GoodsInCart;
import com.shoppingweb.service.AddService;
import com.shoppingweb.service.CartService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/address")
public class AddController {

    @Resource
    private AddService addService;

    @GetMapping("/selectByAccount/{cusaccount}")
    public Result selectByAccount(@PathVariable String cusaccount){
        List<Address> address = addService.selectByAccount(cusaccount);
        return Result.success(address);
    }

    @PostMapping("/submit")
    public Result submit(@RequestBody Address address){
        if(address.getAddress_id()== null){
            addService.add(address);
        }else {
            addService.edit(address);
        }
        return Result.success();
    }

    @DeleteMapping("/del/{address_id}")
    public Result delete(@PathVariable("address_id") Integer address_id){
        addService.delete(address_id);
        return Result.success();
    }



}
