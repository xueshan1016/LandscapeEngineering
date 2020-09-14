package com.vierescense.pojo;

/**
 * @author
 * 个人用户
 */
public class People {
    private int peopleId;   //用户id
    private String peopleName;  //用户姓名
    private String peoplePwd;   //用户密码
    private String peoplePhone; //用户电话
    private String peopleAddress;   //用户地址

    public People() {
    }

    public People(int peopleId, String peopleName, String peoplePwd, String peoplePhone, String peopleAddress) {
        this.peopleId = peopleId;
        this.peopleName = peopleName;
        this.peoplePwd = peoplePwd;
        this.peoplePhone = peoplePhone;
        this.peopleAddress = peopleAddress;
    }

    public int getPeopleId() {
        return peopleId;
    }

    public void setPeopleId(int peopleId) {
        this.peopleId = peopleId;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public String getPeoplePwd() {
        return peoplePwd;
    }

    public void setPeoplePwd(String peoplePwd) {
        this.peoplePwd = peoplePwd;
    }

    public String getPeoplePhone() {
        return peoplePhone;
    }

    public void setPeoplePhone(String peoplePhone) {
        this.peoplePhone = peoplePhone;
    }

    public String getPeopleAddress() {
        return peopleAddress;
    }

    public void setPeopleAddress(String peopleAddress) {
        this.peopleAddress = peopleAddress;
    }

    @Override
    public String toString() {
        return "People{" +
                "peopleId=" + peopleId +
                ", peopleName='" + peopleName + '\'' +
                ", peoplePwd='" + peoplePwd + '\'' +
                ", peoplePhone='" + peoplePhone + '\'' +
                ", peopleAddress='" + peopleAddress + '\'' +
                '}';
    }
}
