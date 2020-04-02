package com.fhlxc.chapter01;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
* @author Xingchao Long
* @date 2020年3月30日 下午2:07:26
* @classname Book
* @description 
*/

@Component
@ConfigurationProperties(prefix = "book")
public class Book {
    
    private Integer id;
    private String name;
    private String author;
    private Float price;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public Float getPrice() {
        return price;
    }
    
    public void setPrice(Float price) {
        this.price = price;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return name + " " + author + " " + price;
    }
    
}
