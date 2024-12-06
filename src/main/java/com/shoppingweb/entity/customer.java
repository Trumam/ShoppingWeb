package com.shoppingweb.entity;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="customer")
public class customer {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String sex;
    private String account;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public customer(int id,String name, String sex, String account, String password) {
        this.id=id;
        this.name = name;
        this.sex = sex;
        this.account = account;
        this.password = password;
    }
    public customer(String name, String sex, String account, String password) {
        this.name = name;
        this.sex = sex;
        this.account = account;
        this.password = password;
    }
//    public customer(){
//        this.name = "伍六七";
//        this.sex = "男";
//        this.account = "12345";
//        this.password = "12345";
//    }
    @JsonCreator
    public customer(@JsonProperty("account") String account,@JsonProperty("password") String password) {
        this.account=account;
        this.password = password;
    }
//    public customer(String account, String password){
//        this.account = account;
//        this.password = password;
//    }

}
