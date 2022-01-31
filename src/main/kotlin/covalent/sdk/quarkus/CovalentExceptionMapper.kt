package covalent.sdk.quarkus

import covalent.sdk.quarkus.dto.CovalentErrorData
import org.eclipse.microprofile.rest.client.ext.ResponseExceptionMapper
import javax.ws.rs.core.Response

/**
 * In case of errors covalent returns the same fields, which should be mapped to [CovalentErrorData] and wrapped in [CovalentClientException]
 */
class CovalentExceptionMapper : ResponseExceptionMapper<CovalentClientException> {

    override fun toThrowable(response: Response): CovalentClientException? {
        return if (response.statusInfo.family != Response.Status.Family.SUCCESSFUL)
            CovalentClientException(errorData = response.readEntity(CovalentErrorData::class.java)) else null
    }

}