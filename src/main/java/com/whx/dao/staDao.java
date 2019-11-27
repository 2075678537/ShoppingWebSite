package com.whx.dao;

import com.whx.po.Product;
import com.whx.po.Status;

import java.util.List;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-15:16
 */
public interface staDao {
    /**
     * @return
     */
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
