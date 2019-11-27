package com.whx.cervice;

import com.whx.dao.staDao;
import com.whx.po.Product;
import com.whx.po.Status;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-15:16
 */
@Service

public class staServiceimpl implements staservice {
    @Resource
    staDao sd;
    public List<Status> celectAll() {
        return sd.celectAll();
    }

    public Product selectByid(int status_id) {
        return sd.selectByid(status_id);
    }

    public int insert(Status sta) {
        return sd.insert(sta);
    }

    public int update(Status sta) {
        return sd.update(sta);
    }
}
