package io.philo.littlepayment.user

import io.philo.littlepayment.share.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.persistence.UniqueConstraint

@Entity
@Table(
    uniqueConstraints = [
        UniqueConstraint(name = "user__email__uk", columnNames = ["email"])
    ]
)
class User(email: String, name: String) : BaseEntity() {

    @Column(nullable = false)
    val email: String = email

    @Column(nullable = false)
    val name: String = name
}