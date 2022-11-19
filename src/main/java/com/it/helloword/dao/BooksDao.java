package com.it.helloword.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.it.helloword.pojo.Books;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 黑马程序员
 * @since 2022-11-11
 */
@Mapper
public interface BooksDao extends BaseMapper<Books> {


    List<Books> getBooksList();
}
