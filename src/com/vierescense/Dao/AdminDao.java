package com.vierescense.Dao;

import com.vierescense.pojo.Admin;
import com.vierescense.pojo.Trash;

import java.util.Date;
import java.util.List;

/**
 * @author
 * 与管理员数据表交互
 */
public interface AdminDao {

    int addAdmin(String name,String password); //管理员添加

    int delAdmin(int adminId); //删除管理员

    List<Admin> findAll();  //显示所有的管理员


}
