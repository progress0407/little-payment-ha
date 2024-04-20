package io.philo.littlepayment

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableJpaAuditing
class LittlePaymentApplication

fun main(args: Array<String>) {
	runApplication<LittlePaymentApplication>(*args)
}
