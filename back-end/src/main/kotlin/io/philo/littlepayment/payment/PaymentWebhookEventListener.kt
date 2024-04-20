package io.philo.littlepayment.payment

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class PaymentWebhookEventListener {

    @GetMapping("/webhook-event-listen")
    fun webhookEventListen() {

    }
}