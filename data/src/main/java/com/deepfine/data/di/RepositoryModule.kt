package com.deepfine.data.di

import com.deepfine.data.repository.MainRepositoryImpl
import com.deepfine.domain.repository.MainRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

/**
 * @Description
 * @author yc.park (DEEP.FINE)
 * @since 2023-08-08
 * @version 1.0.0
 */

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

  @Binds
  abstract fun bindSampleRepository(
    splashRepositoryImpl: MainRepositoryImpl,
  ): MainRepository
}
