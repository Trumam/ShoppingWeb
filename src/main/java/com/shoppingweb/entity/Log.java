package com.shoppingweb.entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="log")
public class Log {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer log_id;

    private String cus_account;
    private String goods_id;
    private String log_date;
    private String behavior_type;
    private String goods_num;

    public String getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(String goods_num) {
        this.goods_num = goods_num;
    }



    public Integer getLog_id() {
        return log_id;
    }

    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
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

    public String getLog_date() {
        return log_date;
    }

    public void setLog_date(String log_date) {
        this.log_date = log_date;
    }

    public String getBehavior_type() {
        return behavior_type;
    }

    public void setBehavior_type(String behavior_type) {
        this.behavior_type = behavior_type;
    }

}
