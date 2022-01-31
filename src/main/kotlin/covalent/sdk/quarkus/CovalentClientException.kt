package covalent.sdk.quarkus

import covalent.sdk.quarkus.dto.CovalentErrorData


class CovalentClientException(val errorData: CovalentErrorData) : RuntimeException(errorData.errorMessage)