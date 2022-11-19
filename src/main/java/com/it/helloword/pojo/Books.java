package com.it.helloword.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 黑马程序员
 * @since 2022-11-11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Books implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 书id
     */
    @TableId("bookID")
    private Integer bookid;

    /**
     * 书名
     */
    @TableField("bookName")
    private String bookname;

    /**
     * 数量
     */
    @TableField("bookCounts")
    private Integer bookcounts;

    /**
     * 描述
     */
    private String detail;


}
