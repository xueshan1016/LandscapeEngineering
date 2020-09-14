package com.vierescense.Service.ServiceImpl;

import com.vierescense.Service.AdminService;
import com.vierescense.pojo.Trash;

import java.util.Date;
import java.util.List;

/**
 * @author
 * 管理
 */
public class AdminServiceImpl implements AdminService {
    @Override
    public int addAdmin(String name, String password) {
        return 0;
    }

    @Override
    public List<Trash> findTraAll() {
        return null;
    }

    @Override
    public List<Trash> findTraByType(String trashType) {
        return null;
    }

    @Override
    public List<Trash> findTraByTime(Date trashDate) {
        return null;
    }


    @Override
    public int delTrash(int trashId) {
        return 0;
    }

    @Override
    public Trash updateTrash(int trashId) {
        return null;
    }

}
