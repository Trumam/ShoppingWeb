package com.shoppingweb.service;

import com.shoppingweb.dao.RepDao;
import com.shoppingweb.entity.SalesReport;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;


@Service
public class ReportService {

    @Resource
    private RepDao repDao ;
//    public List<SalesReport> getMonthlySalesByYear(@RequestParam("year") int year) {
//        return repDao.getMonthlySalesByYear(year);
//    }

    public List<SalesReport> getSalesMoneyByRange(LocalDate begin, LocalDate end) {
        return repDao.getSalesMoneyByRange(begin,end);
    }

    public List<SalesReport> getSalesNumByRange(LocalDate begin, LocalDate end) {
        return repDao.getSalesNumByRange(begin,end);
    }

    public List<SalesReport> getTopByRange(LocalDate begin, LocalDate end) {
        return repDao.getTopByRange(begin,end);
    }


}
