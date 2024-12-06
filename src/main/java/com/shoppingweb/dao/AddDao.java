package com.shoppingweb.dao;


import com.shoppingweb.entity.Address;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddDao {

    @Select("select * from address where cus_account = #{cusaccount}")
    List<Address> selectByAccount(String cusaccount);

    void add(Address address);

    void edit(Address address);

    void del(Integer address_id);
}
