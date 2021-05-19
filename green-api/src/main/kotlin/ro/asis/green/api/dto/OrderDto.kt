package ro.asis.green.api.dto

import ro.asis.green.domain.enumeration.OrderStatus

data class OrderDto(
    var id: String,
    var clientId: String,
    var providerId: String,
    var items: Set<ItemDto>,
    var status: OrderStatus
)
