package io.philo.littlepayment.payment

import io.philo.littlepayment.share.BaseEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity

@Entity
class Payment(name: String): BaseEntity() {

    @Column
    var name: String = name
        protected set

    protected constructor() : this("")
}