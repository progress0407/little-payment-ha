package io.philo.littlepayment.payment.dto

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * 자사 서버와 포트원과의 통신을 담당하는 DTO
 */
class PortonePaymentDto

data class PortonePaymentRequest(@JsonProperty("payment_id") val paymentId: String)

data class PortonePaymentResponse(val id: String,
                                  val status: String,
                                  val amount: String,
                                  val method: String)

data class PaymentPrepareResponse(val storeId: String,
                                  val channelKey: String)
