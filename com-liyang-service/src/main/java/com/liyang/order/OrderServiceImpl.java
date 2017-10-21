package com.liyang.order;

import com.liyang.dao.ArticleMapper;
import com.liyang.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liyang21 on 2017/10/20.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private ArticleMapper articleMapper;

    public Article queryOrderById(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }
}
