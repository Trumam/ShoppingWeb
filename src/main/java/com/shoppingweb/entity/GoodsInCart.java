package com.shoppingweb.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="goodsInCart")
public class GoodsInCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cusaccount;
    private String goodsid;
    private Integer goodsnumber;

    private String goodsPicture;
    private String goodsName;
    private String price;

    public String getGoodsPicture() {
        return goodsPicture;
    }

    public void setGoodsPicture(String goodsPicture) {
        this.goodsPicture = goodsPicture;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusaccount() {
        return cusaccount;
    }

    public void setCusaccount(String cusaccount) {
        this.cusaccount = cusaccount;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public Integer getGoodsnumber() {
        return goodsnumber;
    }

    public void setGoodsnumber(Integer goodsnumber) {
        this.goodsnumber = goodsnumber;
    }
}
