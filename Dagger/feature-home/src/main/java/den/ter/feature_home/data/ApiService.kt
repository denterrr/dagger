package den.ter.feature_home.data

import den.ter.feature_home.domain.models.Morty
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("api/character")
    suspend fun getUsers(): Response<Morty>

}