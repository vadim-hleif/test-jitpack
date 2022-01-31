package covalent.sdk.quarkus.dto

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
class CovalentErrorData(
    val error: Boolean,

    @field:JsonProperty("error_message")
    val errorMessage: String,

    @field:JsonProperty("error_code")
    val errorCode: String,
)