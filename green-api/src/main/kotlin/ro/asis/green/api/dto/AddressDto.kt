package ro.asis.green.api.dto

data class AddressDto(
    var city: String? = null,
    var zipCode: String? = null,
    var streetName: String? = null,
    var streetNumber: String? = null,
    var building: String? = null,
    var staircase: String? = null,
    var floor: String? = null,
    var flat: String? = null
)
