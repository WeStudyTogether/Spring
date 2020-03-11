package com.fhlxc.mapper;

import java.util.List;

import com.fhlxc.demo.User;

/**
* @author Xingchao Long
* @date 2020年3月11日 上午8:33:23
* @ClassName UserMapper1
* @Description
*/

public interface UserMapper1 {
    
    List<User> getAll();
    User getOne(int id);
    void insert(User user);
    void update(User user);
    void delete(int id);
}
