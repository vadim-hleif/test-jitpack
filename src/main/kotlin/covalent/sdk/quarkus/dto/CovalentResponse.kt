package covalent.sdk.quarkus.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
data class CovalentResponse<T>(
    val data: CovalentResponseData<T>?,
)
