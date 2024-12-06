package com.shoppingweb.dao;


import com.shoppingweb.entity.SalesReport;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RepDao {

//    List<SalesReport> getMonthlySalesByYear(@RequestParam("year") int year);

    List<SalesReport> getSalesMoneyByRange(LocalDate begin, LocalDate end);

    List<SalesReport> getSalesNumByRange(LocalDate begin, LocalDate end);

    List<SalesReport> getTopByRange(LocalDate begin, LocalDate end);


}
