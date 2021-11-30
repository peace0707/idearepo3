package com.zeng.pojo;

/**
 * @description:
 * @author: Administrator
 * @date: 2021/12/1 0:00
 */
public class Account {
    private String username;
    private int password;
    private double money;

    public Account(String username, int password, double money) {
        this.username = username;
        this.password = password;
        this.money = money;
    }

    public Account() {
    }
}
