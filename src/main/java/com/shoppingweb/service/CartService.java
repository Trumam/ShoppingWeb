package com.shoppingweb.service;


import com.shoppingweb.dao.CartDao;
import com.shoppingweb.dao.GoodDao;
import com.shoppingweb.entity.GoodsInCart;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Resource
    private CartDao cartDao;


    public List<GoodsInCart> selectByAccount(String cusaccount) {
        return cartDao.selectByAccount(cusaccount);
    }

    public void add(GoodsInCart goodsInCart) {

        GoodsInCart goods = cartDao.findByIdAndAccount(goodsInCart.getGoodsid(),goodsInCart.getCusaccount());
        if(goods != null){
            cartDao.updataNumber(goodsInCart);
        }else{
            cartDao.add(goodsInCart);
        }
    }

    public void updateNumberInCart(GoodsInCart goodsInCart) {
        cartDao.updateNumberInCart(goodsInCart);
    }

    public void delete(Integer id) {
        cartDao.delete(id);
    }
}
