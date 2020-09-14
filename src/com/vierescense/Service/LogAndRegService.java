package com.vierescense.Service;

import com.vierescense.pojo.People;

/**
 * @author
 * 登录注册
 */
public interface LogAndRegService {
    boolean register(People people);   //人员注册

    boolean adminLogin(String adminNmae,String adminPassword);  //管理员登录功能

    boolean firmLogin(String firmName,String firmPassword); //企业人员登录

    boolean peoLogin(String peopleName,String peoplePassword); //人员登录
}
