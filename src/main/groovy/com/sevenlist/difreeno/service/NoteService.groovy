package com.sevenlist.difreeno.service

import com.sevenlist.difreeno.domain.Note
import com.sevenlist.difreeno.domain.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoteService {

    private final NoteRepository noteRepository

    @Autowired
    NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository
    }

    Note createNode(Note note) {
        noteRepository.save(note)
    }

    Note getNote(Long id) {
        noteRepository.findOne(id)
    }
}
