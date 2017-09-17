package com.liyang.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liyang21 on 2017/9/17.
 */
@Controller
public class IndexController {
    @RequestMapping("/aaa")
    public String index() {
        return "index";
    }
}
