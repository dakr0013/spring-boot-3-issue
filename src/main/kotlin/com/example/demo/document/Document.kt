package com.example.demo.document

import com.example.demo.common.AbstractEntity
import javax.persistence.Entity

@Entity
class Document : AbstractEntity<Long, DocumentId>() {
  lateinit var title: String
}
