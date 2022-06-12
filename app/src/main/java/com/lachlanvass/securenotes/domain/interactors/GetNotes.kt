package com.lachlanvass.securenotes.domain.interactors

import com.lachlanvass.securenotes.domain.model.Note
import com.lachlanvass.securenotes.domain.repository.NoteRepository

class GetNotes(private val repository: NoteRepository) {

    suspend operator fun invoke(note: Note) {

        repository.getNotes()
    }
}