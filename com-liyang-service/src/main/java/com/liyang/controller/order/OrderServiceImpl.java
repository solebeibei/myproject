package com.liyang.controller.order;

import com.liyang.dao.ArticleMapper;
import com.liyang.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liyang21 on 2017/10/19.
 */
@Service(value = "orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ArticleMapper articleMapper;

    public int insertOrder(Article article) {
       return  articleMapper.insert(article);
    }
}
