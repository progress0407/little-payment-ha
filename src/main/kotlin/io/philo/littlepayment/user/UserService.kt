package io.philo.littlepayment.user

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class UserService {

    fun createUser() {
        TODO("Not yet implemented")
    }
}