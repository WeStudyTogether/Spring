package com.fhlxc.services;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.fhlxc.mapper.UserMapper;
import com.fhlxc.demo.User;

/**
* @author Xingchao Long
* @date 2020年3月12日 上午10:07:22
* @ClassName UserService
* @Description 
*/

@MapperScan(value = "com.fhlxc.mapper")
@Service
@CacheConfig(cacheNames = "user")
public class UserService {
    
    @Autowired
    private UserMapper userMapper;
    
    public List<User> getAll() {
        return userMapper.getAll();
    }
    
    @Cacheable(value = "ttt", key = "#p0")
    public User getOne(int id) {
        return userMapper.getOne(id);
    }
    
    public void insert(User user) {
       userMapper.insert(user);
    }
    
    @CachePut(value = "user", key = "#p0.id")
    public User update(User user) {
        userMapper.update(user);
        return user;
    }
    
    @CacheEvict(value = "user", key = "#p0", allEntries = true)
    public void delete(int id) {
        userMapper.delete(id);
    }
    
}
