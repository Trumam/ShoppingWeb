package com.shoppingweb.service;

import com.shoppingweb.dao.CusDao;
import com.shoppingweb.entity.Params;
import com.shoppingweb.entity.customer;
import com.shoppingweb.exception.CustomException;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service//用于标记这个类是Spring框架中的一个服务层组件，表明该类主要负责业务逻辑处理
public class CusService {

    @Resource//用于进行依赖注入，在这里它会从Spring容器中查找并注入类型匹配的CusDao实例
    private CusDao cusDao;
    public List<customer> findBySearch(Params params) {
        return cusDao.findBySearch(params);
    }

    public List<customer> getCus() {
        return cusDao.getCus();
    }

    public void add(customer cus) {
        if(cus.getName() == null || "".equals(cus.getName())){
            throw new CustomException("用户名不能为空");
        }

        customer user = cusDao.findByAccount(cus.getAccount());
        System.out.println("666");
        if(user != null){
            throw new CustomException("该账号已存在，请勿重复添加");
        }

        //cusDao.insertSelective(customer);
        cusDao.addCus(cus);
    }

    public void edit(customer cus) {
        cusDao.editCus(cus);
    }

    public void delete(Integer id) {
        cusDao.delCus(id);
    }

    public customer login(customer cus) {
        customer user=cusDao.findByAccountAndPassword(cus.getAccount(),cus.getPassword());
        if(user == null){
            throw new CustomException("用户名或密码输入错误");
        }
        return user;
    }

    public customer searchByAccount(String account) {
        return cusDao.findByAccount(account);
    }
}





















