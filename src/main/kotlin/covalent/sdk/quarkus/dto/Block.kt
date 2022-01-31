package covalent.sdk.quarkus.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class Block(
    @field:JsonProperty("height")
    val height: Long
)
