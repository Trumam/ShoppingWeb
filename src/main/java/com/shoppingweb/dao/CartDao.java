package com.shoppingweb.dao;


import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.GoodsInCart;
import com.shoppingweb.entity.ParamsGoods;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao {

//    @Select("select * from shopcart where cusaccount = #{cusaccount}")
    List<GoodsInCart> selectByAccount(@Param("cusaccount") String cusaccount);


    void add(GoodsInCart goodsInCart);


    @Select("select * from shopcart where goodsid = #{goodsid} and cusaccount = #{cusaccount}")
    GoodsInCart findByIdAndAccount(String goodsid, String cusaccount);

    void updataNumber(GoodsInCart goodsInCart);

    void updateNumberInCart(GoodsInCart goodsInCart);

    void delete(Integer id);
}
