package com.lachlanvass.securenotes.domain.repository

import com.lachlanvass.securenotes.domain.model.Note

interface NoteRepository {

    fun getNotekj78uoiljks(): List<Note?>

    suspend fun insertNote(note: Note)

    suspend fun deleteNote(note: Note)
}