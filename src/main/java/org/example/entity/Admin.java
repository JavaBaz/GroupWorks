package org.example.entity;

import org.example.base.entity.BaseEntity;

public class Admin extends BaseEntity<Integer> {
    private String username;

    private String password;

    public Admin(String userName, String passWord) {
        this.username = userName;
        this.password = passWord;
    }

    public Admin(Integer integer, String username, String password) {
        super(integer);
        this.username = username;
        this.password = password;
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
        return "Admin{" +
                "userName='" + username + '\'' +
                ", passWord='" + password + '\'' +
                ", id=" + id +
                '}';
    }
}
