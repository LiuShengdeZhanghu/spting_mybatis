package com.liusheng.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private Integer id=null;
    private String password;
    private Date last_login;
    private String username;
    private String email;
    private Integer is_staff;
    private Integer is_active;
    private Date date_joined;
    private String gender;
    private String avatar;

    // 存储护照信息 ：关系属性
    private Passport passport;

    // 用户关注的话题，多对多
    private List<Topic> topics;

    public User() {
    }

    public User(Integer id, String password, Date last_login, String username, String email, Integer is_staff, Integer is_active, Date date_joined, String gender, String avatar) {
        this.id = id;
        this.password = password;
        this.last_login = last_login;
        this.username = username;
        this.email = email;
        this.is_staff = is_staff;
        this.is_active = is_active;
        this.date_joined = date_joined;
        this.gender = gender;
        this.avatar = avatar;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getLast_login() {
        return last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIs_staff() {
        return is_staff;
    }

    public void setIs_staff(Integer is_staff) {
        this.is_staff = is_staff;
    }

    public Integer getIs_active() {
        return is_active;
    }

    public void setIs_active(Integer is_active) {
        this.is_active = is_active;
    }

    public Date getDate_joined() {
        return date_joined;
    }

    public void setDate_joined(Date date_joined) {
        this.date_joined = date_joined;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", last_login=" + last_login +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", is_staff=" + is_staff +
                ", is_active=" + is_active +
                ", date_joined=" + date_joined +
                ", gender='" + gender + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
