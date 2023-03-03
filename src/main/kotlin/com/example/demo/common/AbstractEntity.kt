package com.example.demo.common

import java.io.Serializable
import jakarta.persistence.Embedded
import jakarta.persistence.MappedSuperclass
import org.springframework.data.jpa.domain.AbstractPersistable

@MappedSuperclass
abstract class AbstractEntity<ID : Serializable, ID2 : UuidIdentifiable> :
    AbstractPersistable<ID>() {

  @Embedded lateinit var identifier: ID2
}
