package io.philo.littlepayment.user.dto

class UserDto

data class UserCreateRequest(val email: String, val name:String, val password:String)