package com.fhlxc.spring.mybatis;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.apache.ibatis.cache.Cache;

/**
* @author Xingchao Long
* @date 2020年2月13日 下午3:53:06
* @ClassName CusCache
* @Description 
*/

public class CusCache implements Cache {

    private ReadWriteLock lock = new ReentrantReadWriteLock();
    private ConcurrentHashMap<Object, Object> cache = new ConcurrentHashMap<>();
    private String id;
    
    public CusCache() {
        System.out.println("初始化-1！");
    }
    
    public CusCache(String id) {
        System.out.println("初始化-2！");
        this.id = id;
    }
    
    @Override
    public String getId() {
        System.out.println("得到ID：" + id);
        return id;
    }

    @Override
    public void putObject(Object key, Object value) {
        System.out.println("往缓存中添加元素：key=" + key + "，value=" + value);
        cache.put(key, value);
    }

    @Override
    public Object getObject(Object key) {
        System.out.println("通过key获取值：" + key);
        System.out.println("OVER");
        System.out.println("=======================================");
        System.out.println("值为：" + cache.get(key));
        System.out.println("=======================================");
        return cache.get(key);
    }

    @Override
    public Object removeObject(Object key) {
        System.out.println("移除缓存对象：" + key);
        return null;
    }

    @Override
    public void clear() {
        System.out.println("清除缓存！");
        cache.clear();
    }

    @Override
    public int getSize() {
        System.out.println("获取缓存大小！");
        return 0;
    }
    
    public ReadWriteLock getReadWriteLock() {
        System.out.println("获取锁对象！！！");
        return lock;
    }

}
