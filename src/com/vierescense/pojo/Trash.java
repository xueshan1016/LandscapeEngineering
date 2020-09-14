package com.vierescense.pojo;

import java.util.Date;

/**
 * @author
 * 废物信息
 */
public class Trash {
    private int trashId;        //废物id
    private String trashName;   //废物名称
    private String trashDes;    //废物描述
    private String trashType;   //废物分类
    private Date trashDate;     //废物上架时间

    public Trash() {
    }

    public Trash(int trashId, String trashName, String trashDes, String trashType, Date trashDate) {
        this.trashId = trashId;
        this.trashName = trashName;
        this.trashDes = trashDes;
        this.trashType = trashType;
        this.trashDate = trashDate;
    }

    public int getTrashId() {
        return trashId;
    }

    public void setTrashId(int trashId) {
        this.trashId = trashId;
    }

    public String getTrashName() {
        return trashName;
    }

    public void setTrashName(String trashName) {
        this.trashName = trashName;
    }

    public String getTrashDes() {
        return trashDes;
    }

    public void setTrashDes(String trashDes) {
        this.trashDes = trashDes;
    }

    public String getTrashType() {
        return trashType;
    }

    public void setTrashType(String trashType) {
        this.trashType = trashType;
    }

    public Date getTrashDate() {
        return trashDate;
    }

    public void setTrashDate(Date trashDate) {
        this.trashDate = trashDate;
    }

    @Override
    public String toString() {
        return "Trash{" +
                "trashId=" + trashId +
                ", trashName='" + trashName + '\'' +
                ", trashDes='" + trashDes + '\'' +
                ", trashType='" + trashType + '\'' +
                ", trashDate=" + trashDate +
                '}';
    }
}
