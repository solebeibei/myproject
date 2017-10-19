package com.liyang.controller.index;


import com.liyang.dao.ArticleMapper;
import com.liyang.model.Article;
import com.liyang.model.ArticleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liyang21 on 2017/9/24.
 */
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    private ArticleMapper articleMapper;

    public Article getOrder(int id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    public int insertOrder(Article article) {
        return articleMapper.insert(article);
    }
}
