package com.vierescense.Dao;

import com.vierescense.pojo.*;

import java.util.List;

/**
 * @author
 * 与企业数据表交互
 */
public interface FirmDao {

    int addFirm(Firm firm); //企业添加

    int delFirm(int firmId); //删除企业

    List<Firm> findAll();  //显示所有的企业

    Firm findFirmByName(String firmName); //根据公司名字查找

    Firm updateFirm(int firmId); //修改企业信息


}
