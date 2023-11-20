package com.deepfine.network.service

import com.deepfine.network.entity.FactsEntity
import com.skydoves.sandwich.ApiResponse
import com.skydoves.sandwich.ktor.getApiResponse
import io.ktor.client.HttpClient
import javax.inject.Inject

/**
 * @Description
 * @author yc.park (DEEP.FINE)
 * @since 2023-08-08
 * @version 1.0.0
 */
interface FactApiService {
  suspend fun getFacts(): ApiResponse<FactsEntity>
}

class FactApiServiceImpl @Inject constructor(
  private val client: HttpClient
) : FactApiService {
  override suspend fun getFacts(): ApiResponse<FactsEntity> =
    client.getApiResponse(urlString = "/facts")
}
