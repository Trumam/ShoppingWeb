package com.shoppingweb.entity;

import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name="monthlySalesDTO")
public class SalesReport {

    private String month;

    private BigDecimal totalSales;

    private BigDecimal totalNum;

    private String goodsName;

    private BigDecimal goodsNum;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public BigDecimal getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(BigDecimal totalSales) {
        this.totalSales = totalSales;
    }

    public BigDecimal getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(BigDecimal totalNum) {
        this.totalNum = totalNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(BigDecimal goodsNum) {
        this.goodsNum = goodsNum;
    }
}
