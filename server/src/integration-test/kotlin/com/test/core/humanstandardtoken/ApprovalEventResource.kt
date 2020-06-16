/*
 * Copyright 2020 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.test.core.humanstandardtoken

import com.test.core.humanstandardtoken.model.ApprovalEventResponse
import io.swagger.v3.oas.annotations.Operation
import org.web3j.openapi.core.EventResource
import java.util.concurrent.CompletableFuture
import javax.annotation.processing.Generated
import javax.ws.rs.POST
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Generated
interface ApprovalEventResource : EventResource<ApprovalEventResponse> {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(
        tags = ["HumanStandardToken"],
        summary = "Get the Approval event"
    )
    override fun findBy(transactionReceiptModel: org.web3j.openapi.core.models.TransactionReceiptModel):
            List<ApprovalEventResponse>

    override fun onEvent(onEvent: (ApprovalEventResponse) -> Unit): CompletableFuture<Void> =
            CompletableFuture.completedFuture(null)
}
