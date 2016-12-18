package com.sevenlist.difreeno.domain

import org.springframework.data.repository.CrudRepository

interface NoteRepository extends CrudRepository<Note, Long> {
}