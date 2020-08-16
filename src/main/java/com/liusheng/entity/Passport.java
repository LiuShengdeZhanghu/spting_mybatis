package com.liusheng.entity;

import java.util.Date;

public class Passport {
    private Integer id;
    private String nationality;
    private Date expire;
    private int user_id;

    // 存储用户信息 ：关系属性
    private User user;

    public Passport() {
    }

    public Passport(Integer id, String nationality, Date expire, int user_id) {
        this.id = id;
        this.nationality = nationality;
        this.expire = expire;
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", nationality='" + nationality + '\'' +
                ", expire=" + expire +
                ", user_id=" + user_id +
                '}';
    }
}
