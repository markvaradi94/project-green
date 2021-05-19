package ro.asis.green.api.dto

data class ClientAccountDto(
    var id: String,
    var accountId: String? = null,
    var firstName: String? = null,
    var lastName: String? = null,
    var addresses: List<AddressDto>,
    var cart: CartDto
)
