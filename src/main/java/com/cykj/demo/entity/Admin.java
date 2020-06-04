package com.cykj.demo.entity;

//import com.alibaba.fastjson.JSON;

public class Admin {

  private int adminId;
  private String account;
  private String name;
  private String password;

  public int getAdminId() {
    return adminId;
  }

  public void setAdminId(int adminId) {
    this.adminId = adminId;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(String account) {
    this.account = account;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

//  @Override
//  public String toString() {
//    return JSON.toJSONString(this);
//  }
}
