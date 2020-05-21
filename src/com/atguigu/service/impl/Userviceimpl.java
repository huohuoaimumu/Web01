package com.atguigu.service.impl;

import com.atguigu.service.userservice;

/**
 * @author Administrator
 * @create 2020-05-20 14:19
 */
public class Userviceimpl implements userservice {
    @Override
    public void insert(String username, Integer age) {
        System.out.println(username);
        System.out.println(age);
    }
}
