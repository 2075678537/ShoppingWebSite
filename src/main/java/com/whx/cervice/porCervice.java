package com.whx.cervice;

import com.whx.po.Product;

import java.util.List;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-15:06
 */
public interface porCervice {
    /**
     * @return
     */
    List<Product> celectAll();

    Product selectByid(int product_id);
    /**
     * 添加
     *
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
