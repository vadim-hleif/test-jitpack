package covalent.sdk.quarkus.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class CovalentResponseData<T>(
    val items: List<T>
)
