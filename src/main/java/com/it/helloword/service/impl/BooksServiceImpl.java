package com.it.helloword.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.it.helloword.dao.BooksDao;
import com.it.helloword.pojo.Books;
import com.it.helloword.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 黑马程序员
 * @since 2022-11-11
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksDao, Books> implements BooksService {
    @Autowired
    private BooksDao booksDao;


    @Override
    public List<Books> getBooksList() {
        return booksDao.getBooksList();
    }
}
