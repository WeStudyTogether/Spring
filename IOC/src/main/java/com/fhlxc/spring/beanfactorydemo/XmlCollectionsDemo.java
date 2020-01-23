package com.fhlxc.spring.beanfactorydemo;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
* @author Xingchao Long
* @date 2020/55/23 20:55:27
* @ClassName XmlCollectionsDemo
* @Description
*/

public class XmlCollectionsDemo {
    
    private List<Object> list;
    private Properties pros;
    private Set<Object> sets;
    private Map<String, Object> maps;
    private Date date;
    
    public List<Object> getList() {
        return list;
    }
    
    public void setList(List<Object> list) {
        this.list = list;
    }
    
    public Properties getPros() {
        return pros;
    }
    
    public void setPros(Properties pros) {
        this.pros = pros;
    }
    
    public Set<Object> getSets() {
        return sets;
    }
    
    public void setSets(Set<Object> sets) {
        this.sets = sets;
    }
    
    public Map<String, Object> getMaps() {
        return maps;
    }
    
    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    
}
