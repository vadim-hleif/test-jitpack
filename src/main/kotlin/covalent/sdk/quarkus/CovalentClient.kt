package covalent.sdk.quarkus

import covalent.sdk.quarkus.dto.Block
import covalent.sdk.quarkus.dto.ContractEvent
import covalent.sdk.quarkus.dto.CovalentResponse
import org.eclipse.microprofile.rest.client.annotation.RegisterProvider
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient
import javax.enterprise.context.ApplicationScoped
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.QueryParam

@RegisterRestClient(configKey = "covalent")
@Path("/v1")
@ApplicationScoped
@RegisterProvider(CovalentExceptionMapper::class)
interface CovalentClient {
    @GET
    @Path("/{chainId}/block_v2/latest/")
    fun getLatestBlock(
        @PathParam("chainId") chainId: Int,
        @QueryParam("key") apiKey: String
    ): CovalentResponse<Block>

    @GET
    @Path("/{chainId}/events/address/{address}/")
    fun getContractEvents(
        @PathParam("chainId") chainId: Int,
        @PathParam("address") contractAddress: String,
        @QueryParam("starting-block") startingBlockInclusive: Long,
        @QueryParam("ending-block") endingBlockExclusive: Long,
        @QueryParam("key") apiKey: String
    ): CovalentResponse<ContractEvent>
}
