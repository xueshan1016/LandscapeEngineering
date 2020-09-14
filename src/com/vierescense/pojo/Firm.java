package com.vierescense.pojo;

/**
 * @author
 * 企业信息
 */
public class Firm {
    private int firmId;    //企业编号
    private String firmName;  //企业名字
    private String firmPwd;   //企业登入密码

    public Firm() {
    }

    public Firm(int firmId, String firmName, String firmPwd) {
        this.firmId = firmId;
        this.firmName = firmName;
        this.firmPwd = firmPwd;
    }

    public int getFirmId() {
        return firmId;
    }

    public void setFirmId(int firmId) {
        this.firmId = firmId;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
    }

    public String getFirmPwd() {
        return firmPwd;
    }

    public void setFirmPwd(String firmPwd) {
        this.firmPwd = firmPwd;
    }

    @Override
    public String toString() {
        return "Firm{" +
                "firmId=" + firmId +
                ", firmName='" + firmName + '\'' +
                ", firmPwd='" + firmPwd + '\'' +
                '}';
    }
}
