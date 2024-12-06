package com.shoppingweb.dao;

import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.Params;
import com.shoppingweb.entity.ParamsGoods;
import com.shoppingweb.entity.customer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodDao {

    @Select("select * from goods")
    List<Goods> getGoods();

    List<Goods> findBySearch(@Param("params") ParamsGoods params);

    void addGoods(Goods goods);

    void editGoods(Goods goods);


    void delGoods(Integer id);

    @Select("select * from goods where name = #{name} limit 1")
    Goods findByName(@Param("name") String name);

    @Select("select * from goods where id = #{id} limit 1")
    Goods selectById(@Param("id") Integer id);

}
