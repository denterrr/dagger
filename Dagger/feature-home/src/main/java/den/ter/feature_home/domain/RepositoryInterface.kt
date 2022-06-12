package den.ter.feature_home.domain

import den.ter.feature_home.domain.models.Morty
import den.ter.feature_home.domain.models.resp2.two
import retrofit2.Response

interface RepositoryInterface {

    suspend fun getData(): Response<Morty>

    suspend fun getSecondData(): Response<two>
}