package com.example.newsappandroid.di

import android.app.Application
import com.example.newsappandroid.data.manager.LocalUserMangerImpl
import com.example.newsappandroid.domain.manager.LocalUserManger
import com.example.newsappandroid.domain.usecases.AppEntryUseCases
import com.example.newsappandroid.domain.usecases.appEntry.ReadAppEntry
import com.example.newsappandroid.domain.usecases.appEntry.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManager: LocalUserManger
    ) = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManager),
        saveAppEntry = SaveAppEntry(localUserManager)
    )

}
