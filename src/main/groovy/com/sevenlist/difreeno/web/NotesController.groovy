package com.sevenlist.difreeno.web

import com.sevenlist.difreeno.domain.Note
import com.sevenlist.difreeno.service.NoteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import static org.springframework.web.bind.annotation.RequestMethod.GET
import static org.springframework.web.bind.annotation.RequestMethod.POST

@RestController
@RequestMapping('/notes')
class NotesController {

    private final NoteService noteService

    @Autowired
    NotesController(NoteService noteService) {
        this.noteService = noteService
    }

    @RequestMapping(method = POST)
    String createNode(@RequestBody Note note) {
        noteService.createNode(note).id
    }

    @RequestMapping(value = '/{id}', method = GET)
    Note getNote(@PathVariable Long id) {
        noteService.getNote(id)
    }
}
