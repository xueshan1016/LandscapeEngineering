package com.vierescense.Dao;

import com.vierescense.pojo.Goods;
import com.vierescense.pojo.Order;
import com.vierescense.pojo.Trash;

import java.util.List;

/**
 * @author
 * 废物表
 */
public interface TrashDao {
    int addTrash(Trash trash);  //添加

    int delTrash(int trashsId);  //根据id删除

    Trash updateTrash(int trashsId); //根据id进行修改货物信息

    List<Trash> findAllTrash(); //查询所有的货物

    Trash findTrashById(int trashsId); //根据id查找
}
