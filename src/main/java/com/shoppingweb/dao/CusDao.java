package com.shoppingweb.dao;

import com.shoppingweb.entity.Params;
import com.shoppingweb.entity.customer;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository//用于标记这个接口是Spring框架中的数据访问层组件（通常用于持久化操作，比如与数据库交互）
public interface CusDao extends Mapper<customer> {
    //这里的Mapper通常是MyBatis框架提供的一个接口，用于简化数据库操作的映射关系定义。

    List<customer> findBySearch(@Param("params") Params params);

    //使用了@Select注解来定义SQL语句
    @Select("select * from customer")
    List<customer> getCus();

    void addCus(customer cus);

    void editCus(customer cus);


    void delCus(Integer id);

    @Select("select * from customer where account = #{account} limit 1")
    customer findByAccount(@Param("account") String account);

    @Select("select * from customer where account = #{account} and password= #{password}")
    customer findByAccountAndPassword(@Param("account")String account, @Param("password")String password);

}
