package den.ter.feature_home.domain.usecases

import den.ter.feature_home.domain.models.Morty
import retrofit2.Response

interface FirstUseCaseInterface {
    suspend fun execute(): Response<Morty>
}