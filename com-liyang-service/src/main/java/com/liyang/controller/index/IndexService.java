package com.liyang.controller.index;

import com.liyang.model.Article;

/**
 * Created by liyang21 on 2017/9/24.
 */
public interface IndexService {
    public Article getOrder(int id);
    public  int insertOrder(Article article);
}
