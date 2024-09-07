package com.example.newsappandroid.domain.usecases.news

import androidx.paging.PagingData
import com.example.newsappandroid.domain.model.Article
import com.example.newsappandroid.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetNewsUseCase(
    private val newsRepository: NewsRepository
) {

    suspend operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)

    }
}