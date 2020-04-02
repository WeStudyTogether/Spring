package com.fhlxc.chapter01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
    
    @RequestMapping("book1")
    public Book book1() {
        Book book = new Book();
        book.setId(1);
        book.setAuthor("罗贯中");
        book.setName("三国演义");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
    
    @RequestMapping("books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<Book>();
        Book b1 = new Book();
        b1.setId(1);
        b1.setAuthor("罗贯中");
        b1.setName("三国演义");
        Book b2 = new Book();
        b2.setId(2);
        b2.setAuthor("曹雪芹");
        b2.setName("红楼梦");
        books.add(b1);
        books.add(b2);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books", books);
        mv.setViewName("books");
        return mv;
    }
    
}
