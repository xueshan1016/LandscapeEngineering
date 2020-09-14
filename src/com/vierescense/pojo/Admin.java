package com.vierescense.pojo;

/**
 * @author
 * 管理员
 */

public class Admin {
    private int admId;    //管理员id
    private String admName; //管理员名字
    private String admPwd;  //管理员密码

    public Admin() {
    }

    public Admin(int admId, String admName, String admPwd) {
        this.admId = admId;
        this.admName = admName;
        this.admPwd = admPwd;
    }

    public int getAdmId() {
        return admId;
    }

    public void setAdmId(int admId) {
        this.admId = admId;
    }

    public String getAdmName() {
        return admName;
    }

    public void setAdmName(String admName) {
        this.admName = admName;
    }

    public String getAdmPwd() {
        return admPwd;
    }

    public void setAdmPwd(String admPwd) {
        this.admPwd = admPwd;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admId=" + admId +
                ", admName='" + admName + '\'' +
                ", admPwd='" + admPwd + '\'' +
                '}';
    }
}
