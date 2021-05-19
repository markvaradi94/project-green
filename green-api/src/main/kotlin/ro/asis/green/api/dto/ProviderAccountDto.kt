package ro.asis.green.api.dto

import java.time.LocalDate

data class ProviderAccountDto(
    var id: String,
    var accountId: String,
    var name: String? = null,
    var since: LocalDate? = null,
    var description: String? = null,
    var dashboard: DashboardDto,
    var inventory: Set<ItemDto>
)
