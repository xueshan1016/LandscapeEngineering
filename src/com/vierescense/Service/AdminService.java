package com.vierescense.Service;

import com.vierescense.pojo.Trash;

import java.util.Date;
import java.util.List;

/**
 * @author
 * 管理
 */
public interface AdminService {

    int addAdmin(String name,String password); //管理员添加

    List<Trash> findTraAll();  //查询所有垃圾

    List<Trash> findTraByType(String trashType);   //按垃圾类型搜索

    List<Trash> findTraByTime(Date trashDate);    //按垃圾上交时间进行查询

    int delTrash(int trashId);  //删除垃圾

    Trash updateTrash(int trashId); //根据id修改垃圾
}
