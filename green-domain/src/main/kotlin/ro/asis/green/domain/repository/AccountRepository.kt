package ro.asis.green.domain.repository

import org.springframework.data.mongodb.repository.MongoRepository
import ro.asis.green.domain.entity.AccountEntity

interface AccountRepository : MongoRepository<AccountEntity, String>
