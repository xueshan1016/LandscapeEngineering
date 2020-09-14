package com.vierescense.Dao;

import com.vierescense.pojo.People;

import java.util.List;

/**
 * @author
 * 与用户表交互
 */
public interface PeopleDao {

    int addPeople(People people); //人员添加

    int delPeople(int peopleId); //删除人员

    List<People> findAll();  //显示所有的人员

    People findPeoByName(String peopleName);//根据名字查询人员

    People updatePeople(int peopleId); //修改人员信息

}
