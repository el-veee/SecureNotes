package com.lachlanvass.securenotes.domain.interactors

import com.lachlanvass.securenotes.domain.model.Note
import com.lachlanvass.securenotes.domain.repository.NoteRepository

class DeleteNote(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {

        repository.deleteNote(note)
    }
}