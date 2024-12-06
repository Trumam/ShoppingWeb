package com.shoppingweb.service;


import com.shoppingweb.dao.AddDao;
import com.shoppingweb.dao.CartDao;
import com.shoppingweb.entity.Address;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.exception.CustomException;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddService {

    @Resource
    private AddDao addDao;

    public List<Address> selectByAccount(String cusaccount) {
        return addDao.selectByAccount(cusaccount);
    }

    public void add(Address address) {
//        if(goods.getName() == null || "".equals(goods.getName())){
//            throw new CustomException("用户名不能为空");
//        }


        addDao.add(address);
    }

    public void edit(Address address) {
        addDao.edit(address);
    }

    public void delete(Integer address_id) {
        addDao.del(address_id);
    }
}
