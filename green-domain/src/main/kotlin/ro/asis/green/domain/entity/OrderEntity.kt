package ro.asis.green.domain.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import ro.asis.green.domain.enumeration.OrderStatus

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "order")
class OrderEntity(
    @Id
    var id: String = ObjectId.get().toHexString(),
    val clientId: String,
    val providerId: String,
    val items: Set<ItemEntity>,
    var status: OrderStatus
)
