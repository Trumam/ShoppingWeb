package com.shoppingweb.dao;


import com.shoppingweb.entity.Address;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.Order;
import com.shoppingweb.entity.ParamsOrder;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface OrderDao {
    void add(Order order);

    void edit(Order order);

    @Select("select * from cusorder where cus_account = #{cusaccount}")
    List<Order> selectByAccount(String cusaccount);

    void update(Order order);

    void delete(Integer order_id);

    @Select("select * from cusorder")
    List<Order> findAll();

    List<Order> findBySearch(@Param("params") ParamsOrder params);

    List<Order> selectAllInfo(String cusaccount);

    void updatepaid(Order order);

    void updateship(Order order);

    void updatereceived(Order order);

    void updatecompleted(Order order);

//    static void add(Order order) {
//        System.out.println("ADD");
//    }
//
//    static void edit(Order order) {
//    }
}
