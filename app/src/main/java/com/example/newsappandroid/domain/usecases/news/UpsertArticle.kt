package com.example.newsappandroid.domain.usecases.news

import com.example.newsappandroid.data.local.NewsDao
import com.example.newsappandroid.domain.model.Article
import javax.inject.Inject

class UpsertArticle @Inject constructor(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article) {
        newsDao.upsert(article = article)
    }

}