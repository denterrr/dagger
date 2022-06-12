package den.ter.feature_home.data

import den.ter.feature_home.domain.models.resp2.two
import retrofit2.Response
import retrofit2.http.GET

interface SecondApiService {

    @GET("v3/6c14c560-15c6-4248-b9d2-b4508df7d4f5")
    suspend fun getSecond() : Response<two>
}