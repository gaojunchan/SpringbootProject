package com.it.helloword.controller;


import com.it.helloword.pojo.Books;
import com.it.helloword.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 黑马程序员
 * @since 2022-11-11
 */
@RestController
@RequestMapping("/books")
public class BooksController {
    @Autowired
    private BooksService booksService;

    @GetMapping("/se/{id}")
    @Cacheable(value = "booksCache")
    public Books get(@PathVariable int id){
        Books byId = booksService.getById(id);
        System.out.println("book = " + byId);
        return byId;
    }

    @GetMapping
    @Cacheable(value = "booksCache",key = "'lini'")
    public List<Books> getbooks(){
        return booksService.getBooksList();
    }

    @GetMapping("/del")
    @CacheEvict(value = "booksCache",allEntries = true)
    public void del(){
        System.out.println("删成功");
    }
}

