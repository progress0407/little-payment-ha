package io.philo.littlepayment.payment

import io.philo.littlepayment.payment.dto.PaymentPrepareResponse
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
@CrossOrigin(origins = ["http://localhost:3000"])
class PaymentController(
    @Value("\${port-one.store-id}") val storeId: String,
    @Value("\${port-one.channel-key}") val channelKey: String,
) {

    @GetMapping("/prepare")
    fun prepare(): PaymentPrepareResponse {
        return PaymentPrepareResponse(storeId, channelKey)
    }
}