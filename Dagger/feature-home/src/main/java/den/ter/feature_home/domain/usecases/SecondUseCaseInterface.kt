package den.ter.feature_home.domain.usecases

import den.ter.feature_home.domain.models.resp2.two
import retrofit2.Response

interface SecondUseCaseInterface {
    suspend fun execute(): Response<two>
}