package ro.asis.green.api.dto

import ro.asis.green.domain.enumeration.AccountRole
import ro.asis.green.domain.enumeration.AccountStatus
import ro.asis.green.domain.enumeration.AccountType

data class AccountDto(
    var id: String,
    var username: String,
    var password: String,
    var email: String? = null,
    var phone: String? = null,
    var type: AccountType? = null,
    var role: AccountRole? = null,
    var status: AccountStatus? = null
)
