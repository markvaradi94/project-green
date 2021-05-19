package ro.asis.green.domain.entity

data class AddressEntity(
    var city: String,
    var zipCode: String? = "",
    var streetName: String,
    var streetNumber: String,
    var building: String? = "",
    var staircase: String? = "",
    var floor: String? = "",
    var flat: String? = ""
)
