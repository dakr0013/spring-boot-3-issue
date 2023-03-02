package com.example.demo.user

import com.example.demo.common.UuidIdentifiable
import java.util.*
import javax.persistence.Embeddable

@Embeddable data class UserId(override val identifier: UUID) : UuidIdentifiable
