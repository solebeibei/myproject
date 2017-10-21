package com.liyang.web.controller;

import com.liyang.model.Article;
import com.liyang.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyang21 on 2017/9/17.
 */
@Controller
public class IndexController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/aaa")
    public String index() {
        return "index";
    }

    @RequestMapping("/queryById")
    public String queryById() {
        Article article = orderService.queryOrderById(1);
        return "";
    }
}
