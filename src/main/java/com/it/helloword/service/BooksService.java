package com.it.helloword.service;

import com.it.helloword.pojo.Books;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 黑马程序员
 * @since 2022-11-11
 */
public interface BooksService extends IService<Books> {
    List<Books> getBooksList();
}
