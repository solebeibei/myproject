package com.liyang.web;

import com.liyang.controller.index.IndexService;
import com.liyang.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by liyang21 on 2017/9/17.
 */
@Controller
public class IndexController {

    @Autowired
    private IndexService indexService;

    @RequestMapping("/aaa")
    public String index() {
        return "index";
    }

    @RequestMapping("/getOrder")
    public ModelAndView getOrders() {
        Article article = indexService.getOrder(1);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("order");
        modelAndView.addObject("article", article);
        return  modelAndView;
    }
}
