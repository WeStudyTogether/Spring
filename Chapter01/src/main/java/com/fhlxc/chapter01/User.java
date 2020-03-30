package com.fhlxc.chapter01;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020年3月30日 下午2:24:20
* @classname User
* @description 
*/

@Component
@ConfigurationProperties(prefix = "my")
public class User {
    
    private String name;
    private String address;
    private List<String> favorites;
    
    public String getName() {
        return name;
    }
    
    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name + " " + address;
    }

}
