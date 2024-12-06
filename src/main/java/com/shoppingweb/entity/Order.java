package com.shoppingweb.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer order_id;

    private String cus_account;
    private String goods_id;
    private String address_id;
    private String order_date;
    private String goods_number;
    private String is_paid;
    private String is_shipped;
    private String is_received;
    private String is_completed;


    //查询所得
    private String recipient_name;
    private String phone_number;
    private String detailed_address;
    private String goods_name;
    private String goods_price;

    public String getRecipient_name() {
        return recipient_name;
    }

    public void setRecipient_name(String recipient_name) {
        this.recipient_name = recipient_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getDetailed_address() {
        return detailed_address;
    }

    public void setDetailed_address(String detailed_address) {
        this.detailed_address = detailed_address;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public String getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(String goods_price) {
        this.goods_price = goods_price;
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public String getCus_account() {
        return cus_account;
    }

    public void setCus_account(String cus_account) {
        this.cus_account = cus_account;
    }

    public String getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(String goods_id) {
        this.goods_id = goods_id;
    }

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(String goods_number) {
        this.goods_number = goods_number;
    }

    public String getIs_paid() {
        return is_paid;
    }

    public void setIs_paid(String is_paid) {
        this.is_paid = is_paid;
    }

    public String getIs_shipped() {
        return is_shipped;
    }

    public void setIs_shipped(String is_shipped) {
        this.is_shipped = is_shipped;
    }

    public String getIs_received() {
        return is_received;
    }

    public void setIs_received(String is_received) {
        this.is_received = is_received;
    }

    public String getIs_completed() {
        return is_completed;
    }

    public void setIs_completed(String is_completed) {
        this.is_completed = is_completed;
    }
}
