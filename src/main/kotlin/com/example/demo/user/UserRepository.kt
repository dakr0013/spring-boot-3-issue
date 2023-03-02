package com.example.demo.user

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long> {
  fun findOneByIdentifier(identifier: UserId): UserEntity?
}
