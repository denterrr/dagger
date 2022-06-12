package den.ter.feature_home.data


import den.ter.feature_home.data.ApiService
import den.ter.feature_home.domain.RepositoryInterface
import den.ter.feature_home.domain.models.Morty
import den.ter.feature_home.domain.models.resp2.two
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(val apiService: ApiService, val secondApiService: SecondApiService):
    RepositoryInterface {
    override suspend fun getData(): Response<Morty> {
        return apiService.getUsers()
    }

    override suspend fun getSecondData(): Response<two> {
        return secondApiService.getSecond()
    }
}