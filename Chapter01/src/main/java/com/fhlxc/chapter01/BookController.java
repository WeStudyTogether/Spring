package com.fhlxc.chapter01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* @author Xingchao Long
* @date 2020年3月30日 下午2:10:44
* @classname BookController
* @description 
*/

@RestController
public class BookController {

    @Autowired
    Book book;
    
    @RequestMapping("book")
    public String book() {
        return book.toString();
    }
    
}
