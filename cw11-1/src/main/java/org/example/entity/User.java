package org.example.entity;

import org.example.base.entity.BaseEntity;

public class User extends BaseEntity<Integer> {

    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public User(Integer integer, String name, String userName, String passWord) {
        super(integer);
        this.name = name;
        this.username = userName;
        this.password = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userName='" + username + '\'' +
                ", passWord='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
