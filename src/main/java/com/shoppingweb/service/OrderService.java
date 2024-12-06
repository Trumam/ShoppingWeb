package com.shoppingweb.service;


import com.shoppingweb.dao.GoodDao;
import com.shoppingweb.dao.OrderDao;
import com.shoppingweb.entity.Address;
import com.shoppingweb.entity.Goods;
import com.shoppingweb.entity.Order;
import com.shoppingweb.entity.ParamsOrder;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Resource
    private OrderDao orderDao ;

    public void add(Order order) {
        orderDao.add(order);
        //orderDao.insertSelective(order);

    }

    public void edit(Order order) {
        orderDao.edit(order);
    }

    public List<Order> selectByAccount(String cusaccount) {
        return orderDao.selectByAccount(cusaccount);
    }

    public void update(Order order) {
        orderDao.update(order);
    }

    public void delete(Integer order_id) {
        orderDao.delete(order_id);
    }

    public List<Order> findAll() {
        return orderDao.findAll();
    }

    public List<Order> findBySearch(ParamsOrder params) {
        return orderDao.findBySearch(params);
    }

    public List<Order> selectAllInfo(String cusaccount) {
        return orderDao.selectAllInfo(cusaccount);
    }

    public void updatepaid(Order order) {
        orderDao.updatepaid(order);
    }

    public void updateship(Order order) {
        orderDao.updateship(order);
    }

    public void updatereceived(Order order) {
        orderDao.updatereceived(order);
    }

    public void updatecompleted(Order order) {
        orderDao.updatecompleted(order);
    }
}
