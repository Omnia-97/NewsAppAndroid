package com.example.newsappandroid.di

import android.app.Application
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import com.example.newsappandroid.data.local.NewsDao
import com.example.newsappandroid.data.local.NewsDataBase
import com.example.newsappandroid.data.local.NewsTypeConverter
import com.example.newsappandroid.data.manager.LocalUserMangerImpl
import com.example.newsappandroid.data.remote.NewsApi
import com.example.newsappandroid.domain.manager.LocalUserManger
import com.example.newsappandroid.domain.usecases.appEntry.ReadAppEntry
import com.example.newsappandroid.domain.usecases.appEntry.SaveAppEntry
import com.example.newsappandroid.utils.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApiInstance(): NewsApi {
        return Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NewsApi::class.java)
    }

    @Provides
    @Singleton
    fun provideNewsDatabase(
        application: Application
    ): NewsDataBase {
        return databaseBuilder(
            context = application,
            klass = NewsDataBase::class.java,
            name = "news_db"
        ).addTypeConverter(NewsTypeConverter())
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideNewsDao(
        newsDatabase: NewsDataBase
    ): NewsDao = newsDatabase.newsDao

}
