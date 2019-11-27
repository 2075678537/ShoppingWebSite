package com.whx.dao;

import com.whx.po.Product;

import java.util.List;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-14:25
 */
public interface proDao {
     List<Product> celectAll();
    Product selectByid(int product_id);
    /**
     * 添加
     *是2121
     * @return
     */
    int insert( Product pro);

    /**
     * 修改
     *
     * @param pro
     * @return
     */
    int update( Product pro);
}
