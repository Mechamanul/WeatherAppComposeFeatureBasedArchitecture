package com.mechamanul.avitointernshipweatherapp.di

import com.mechamanul.avitointernshipweatherapp.data.AppRepositoryImpl
import com.mechamanul.avitointernshipweatherapp.domain.AppRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindRepositoryImpl(repositoryImpl: AppRepositoryImpl): AppRepository
}
