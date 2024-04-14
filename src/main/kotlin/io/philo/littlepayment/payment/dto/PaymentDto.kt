package io.philo.littlepayment.payment.dto

class PaymentDto

// payment_id
data class PaymentRequest(val paymentId: String)

data class PaymentResponse(val id: String,
                           val status: String,
                           val amount: String,
                           val method: String)
