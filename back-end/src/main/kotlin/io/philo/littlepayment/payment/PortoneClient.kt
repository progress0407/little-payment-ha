package io.philo.littlepayment.payment

import io.philo.littlepayment.payment.dto.PortonePaymentRequest
import io.philo.littlepayment.payment.dto.PortonePaymentResponse
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.client.RestClient

@Component
class PortoneClient {

    val restClient =  RestClient.builder()
        .baseUrl("https://some-portone-url/payments")
        .build();

    val PORTONE_API_SECRET: String = ""

    /**
     * 결제 내역 단건 조회
     */
    fun handleWebhook(@RequestBody request: PortonePaymentRequest): PortonePaymentResponse {
        val body: PortonePaymentResponse = restClient.get()
            .uri("https://api.portone.io/payments/${request.paymentId}")
            .headers { headers -> headers.setBearerAuth("PortOne $PORTONE_API_SECRET") }
            .retrieve()
            .body(PortonePaymentResponse::class.java)!!

        return body
    }
}