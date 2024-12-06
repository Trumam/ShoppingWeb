package com.shoppingweb.dao;


import com.shoppingweb.entity.Log;
import com.shoppingweb.entity.Order;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogDao {

    @Select("select * from log")
    List<Order> findAll();

    void add(Log log);

    @Select("select * from log where cus_account = #{cusaccount}")
    List<Log> selectByAccount(String cusaccount);
}
