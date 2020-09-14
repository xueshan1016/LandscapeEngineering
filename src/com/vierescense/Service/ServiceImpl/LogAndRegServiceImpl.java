package com.vierescense.Service.ServiceImpl;

import com.vierescense.Service.LogAndRegService;
import com.vierescense.pojo.People;

/**
 * @author
 * 登陆注册
 */
public class LogAndRegServiceImpl implements LogAndRegService {
    @Override
    public boolean register(People people) {
        return false;
    }

    @Override
    public boolean adminLogin(String adminNmae, String adminPassword) {
        return false;
    }

    @Override
    public boolean firmLogin(String firmName, String firmPassword) {
        return false;
    }

    @Override
    public boolean peoLogin(String peopleName, String peoplePassword) {
        return false;
    }
}
