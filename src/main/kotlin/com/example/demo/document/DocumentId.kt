package com.example.demo.document

import com.example.demo.common.UuidIdentifiable
import java.util.UUID
import javax.persistence.Embeddable

@Embeddable data class DocumentId(override val identifier: UUID) : UuidIdentifiable
