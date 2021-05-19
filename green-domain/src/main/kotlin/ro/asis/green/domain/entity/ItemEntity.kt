package ro.asis.green.domain.entity

data class ItemEntity(
    var name: String,
    var description: String? = "",
    var quantity: Int,
    var price: Double
)
