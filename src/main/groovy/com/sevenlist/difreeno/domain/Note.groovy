package com.sevenlist.difreeno.domain

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field

@Document(indexName = 'difreeno')
class Note {

    @Id
    Long id

    @Field
    String title
}
