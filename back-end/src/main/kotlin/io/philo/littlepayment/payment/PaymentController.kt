package io.philo.littlepayment.payment

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/payments")
class PaymentController {

    @GetMapping("/prepare")
    fun prepare() {
        // TODO: 공식문서 확인하기
    }
}