package ro.asis.green.domain.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ro.asis.green.domain.enumeration.AccountRole
import ro.asis.green.domain.enumeration.AccountStatus
import ro.asis.green.domain.enumeration.AccountType
import javax.validation.constraints.NotNull

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "accounts")
class AccountEntity(
    @Id
    var id: String = ObjectId.get().toHexString(),

    @NotNull
    var username: String,

    @NotNull
    var password: String,

    @NotNull
    var email: String,

    @NotNull
    var phone: String,

    @NotNull
    var type: AccountType,

    @NotNull
    var role: AccountRole,

    @NotNull
    var status: AccountStatus
)
