package com.example.newsappandroid.domain.usecases.news

import androidx.paging.PagingData
import com.example.newsappandroid.domain.model.Article
import com.example.newsappandroid.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetNewsUseCase @Inject constructor(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getNews(sources = sources)

    }
}