package com.example.demo.user

import com.example.demo.common.AbstractEntity
import javax.persistence.Entity

@Entity
class UserEntity : AbstractEntity<Long, UserId>() {
  lateinit var lastname: String
}
