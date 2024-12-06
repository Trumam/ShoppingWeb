package com.shoppingweb.service;
import com.shoppingweb.dao.CusDao;
import com.shoppingweb.dao.GoodDao;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.Params;
import com.shoppingweb.entity.ParamsGoods;
import com.shoppingweb.entity.customer;
import com.shoppingweb.exception.CustomException;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodService {

    @Resource
    private GoodDao goodDao;

//    public List<Goods> getGoods() {
//        return goodDao.getGoods();
//    }

    public List<Goods> findBySearch(ParamsGoods params) {
        return goodDao.findBySearch(params);
    }

    public List<Goods> getGoods() {
        return goodDao.getGoods();
    }

    public void add(Goods goods) {
        if(goods.getName() == null || "".equals(goods.getName())){
            throw new CustomException("用户名不能为空");
        }

        Goods user = goodDao.findByName(goods.getName());
        if(user != null){
            throw new CustomException("该商品已存在，请勿重复添加");
        }

        goodDao.addGoods(goods);
    }

    public void edit(Goods goods) {
        goodDao.editGoods(goods);
    }

    public void delete(Integer id) {
        goodDao.delGoods(id);
    }

    public Goods selectById(Integer id) {
        return goodDao.selectById(id);
    }
}
