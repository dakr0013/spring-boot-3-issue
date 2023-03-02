package com.example.demo

import com.example.demo.document.DocumentId
import com.example.demo.document.DocumentRepository
import com.example.demo.user.UserId
import com.example.demo.user.UserRepository
import java.util.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class DemoApplicationTests {

  @Autowired lateinit var documentRepository: DocumentRepository
  @Autowired lateinit var userRepository: UserRepository

  @Test
  fun `Document findOneByIdentifier`() {
    documentRepository.findOneByIdentifier(
        DocumentId(UUID.fromString("d03806a0-2e41-49df-9cb5-c0613c7e188e")))
  }

  @Test
  fun `UserEntity findOneByIdentifier`() {
    userRepository.findOneByIdentifier(
        UserId(UUID.fromString("7cb70f8c-c3cd-48d4-a99f-71985efca8d6")))
  }
}
