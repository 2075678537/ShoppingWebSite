package com.whx.cervice;

import com.whx.po.Status;
import com.whx.po.Product;

import java.util.List;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-15:15
 */
public interface staservice {
    List<Status> celectAll();
    Product selectByid(int status_id);
    /**
     * 添加
     *
     * @return
     */
    int insert( Status sta);

    /**
     * 修改
     *
     * @param sta
     * @return
     */
    int update(Status sta);
}
