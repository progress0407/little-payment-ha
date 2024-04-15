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
import java.time.ZonedDateTime.now

@MappedSuperclass
abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private var _id: Long? = null
    val id: Long
        get() = _id!!

    @CreatedDate
    @Column(updatable = false)
    var createdAt: ZonedDateTime = now()

    @LastModifiedDate
    @Column
    var updatedAt: ZonedDateTime = now()
}