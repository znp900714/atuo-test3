package com.guoyasoft.bean.login;

/**
 * @program: auto-test3
 * @description:
 * @author: Administrator
 * @create: 2018-11-10 15:11
 **/
public class LoginRequ {

  private String pwd;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  private String userName;

  public String getPwd() {
    return pwd;
  }

  public void setPwd(String pwd) {
    this.pwd = pwd;
  }

  @Override
  public String toString() {
    return "LoginRequ{" +
        "pwd='" + pwd + '\'' +
        ", userName='" + userName + '\'' +
        '}';
  }
}
