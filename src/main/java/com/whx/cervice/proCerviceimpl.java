package com.whx.cervice;

import com.whx.dao.proDao;
import com.whx.po.Product;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-15:09
 */
@Service
public class proCerviceimpl implements porCervice {
    @Resource
     proDao pd;

    public List<Product> celectAll() {
        return pd.celectAll();
    }

    public Product selectByid(int product_id) {
        return pd.selectByid(product_id);
    }

    public int insert(Product pro) {
        return pd.insert(pro);
    }

    public int update(Product pro) {
        return pd.update(pro);
    }
}
