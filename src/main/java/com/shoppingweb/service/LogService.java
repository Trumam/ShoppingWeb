package com.shoppingweb.service;


import com.shoppingweb.dao.LogDao;
import com.shoppingweb.dao.OrderDao;
import com.shoppingweb.entity.Log;
import com.shoppingweb.entity.Order;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    @Resource
    private LogDao logDao ;


    public List<Order> findAll() {
        return logDao.findAll();
    }

    public void add(Log log) {
        logDao.add(log);
    }

    public List<Log> selectByAccount(String cusaccount) {
        return logDao.selectByAccount(cusaccount);
    }
}
