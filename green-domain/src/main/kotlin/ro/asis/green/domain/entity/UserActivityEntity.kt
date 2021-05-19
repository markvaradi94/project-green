package ro.asis.green.domain.entity

import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import javax.validation.constraints.NotNull

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_activities")
class UserActivityEntity(
    @Id
    var id: String = ObjectId.get().toHexString(),

    @NotNull
    val userId: String
)
