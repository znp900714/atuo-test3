package com.guoyasoft.testcase;
import com.alibaba.fastjson.JSON;
import com.guoyasoft.bean.login.LoginRequ;
import com.guoyasoft.bean.login.LoginResp;
import com.guoyasoft.tools.HttpTools;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: auto-test3
 * @description:
 * @author: Administrator
 * @create: 2018-11-10 15:14
 **/
public class AccountTest {
  @Test
  public void TestLogin() {
    LoginRequ loginRequ = new LoginRequ();
    loginRequ.setUserName("xuepl");
    loginRequ.setPwd("aaaaaa");

    String reqJson = JSON.toJSONString(loginRequ, true);
    System.out.println("------------登录请求报文-----------------");
    System.out.println(reqJson);
    String url = "http://qa.guoyasoft.com:8080/user/login";
    String resJson = HttpTools.doPostByJson(url,reqJson,"UTF-8");
    System.out.println("------------登录响应报文-----------------");
    System.out.println(resJson);
    LoginResp loginResp = JSON.parseObject(resJson,LoginResp.class);
    Assert.assertEquals(loginResp.getRespCode(), "9999");
  }
}
