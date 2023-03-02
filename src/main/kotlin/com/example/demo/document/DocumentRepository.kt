package com.example.demo.document

import org.springframework.data.jpa.repository.JpaRepository

interface DocumentRepository : JpaRepository<Document, Long> {
  fun findOneByIdentifier(identifier: DocumentId): Document?
}
