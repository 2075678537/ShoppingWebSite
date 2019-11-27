package com.whx.handler;

import com.whx.cervice.porCervice;
import com.whx.cervice.staservice;
import com.whx.po.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author o浩Y旭o
 * @create 2019-11-21-15:19
 */
@Controller
@RequestMapping("pro")
public class proHandler {
    @Resource
    staservice ss;
    @Resource
    porCervice ps;

    @RequestMapping("/selectAll")
    public String selectAll(Model model) {
        model.addAttribute("list", ps.celectAll());
        return "select";
    }
    @RequestMapping("/selectOne")
    public String selectOne(int product_id, Model model) {
        model.addAttribute("pro", ps.selectByid(product_id));
        model.addAttribute("sta", ss.celectAll());
        return "update";
    }
    @RequestMapping("/update")
    public String update(Product pro){
        ps.update(pro);
        return "redirect:/pro/selectAll";
    }
    @RequestMapping("/toInsert")
    public String toInsert(Model model){
        model.addAttribute("sta", ss.celectAll());
        return "insert";
    }
    @RequestMapping("/insert")
    public String insert(Product pro){
        ps.insert(pro);
        return "redirect:/pro/selectAll";
    }

}
