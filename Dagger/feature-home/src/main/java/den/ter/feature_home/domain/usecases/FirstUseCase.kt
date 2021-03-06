package den.ter.feature_home.domain.usecases

import den.ter.feature_home.domain.RepositoryInterface
import javax.inject.Inject

class FirstUseCase @Inject constructor(private val repo: RepositoryInterface): FirstUseCaseInterface {

    override suspend fun execute() = repo.getData()
}