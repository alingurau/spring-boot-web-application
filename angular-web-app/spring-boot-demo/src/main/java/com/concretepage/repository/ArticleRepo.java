package com.concretepage.repository;

import com.concretepage.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepo extends CrudRepository<Article, Long> {

    }