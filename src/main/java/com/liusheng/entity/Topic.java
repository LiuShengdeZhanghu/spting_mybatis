package com.liusheng.entity;

import java.util.List;

public class Topic {

    private Integer id;
    private String name;
    private String site_url;

    // 话题被哪些用户关注
    private List<User> users;

    public Topic() {
    }

    public Topic(Integer id, String name, String site_url) {
        this.id = id;
        this.name = name;
        this.site_url = site_url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSite_url() {
        return site_url;
    }

    public void setSite_url(String site_url) {
        this.site_url = site_url;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", site_url='" + site_url + '\'' +
                '}';
    }
}
