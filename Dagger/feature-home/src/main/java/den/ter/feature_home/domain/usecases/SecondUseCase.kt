package den.ter.feature_home.domain.usecases

import den.ter.feature_home.domain.RepositoryInterface
import javax.inject.Inject

class SecondUseCase @Inject constructor(private val repo: RepositoryInterface): SecondUseCaseInterface {

    override suspend fun execute() = repo.getSecondData()
}