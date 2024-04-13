package io.philo.littlepayment.share

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.time.ZonedDateTime

@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = TODO("initialize me")
        private set

    @CreatedDate
    @Column(nullable = false, updatable = false)
    var createdAt: ZonedDateTime

    @LastModifiedDate
    @Column(nullable = false)
    var updatedAt: ZonedDateTime
}