package ro.asis.green.domain.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.LocalDate

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "provider_accounts")
data class ProviderAccountEntity(
    @Id
    var id: String = ObjectId.get().toHexString(),

    val accountId: String,
    var name: String,
    var since: LocalDate? = LocalDate.now(),
    var description: String? = "",

    val dashboard: DashboardEntity,
    val inventory: Set<ItemEntity>
)
