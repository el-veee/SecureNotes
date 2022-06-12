package com.lachlanvass.securenotes.framework.interactors

import com.lachlanvass.securenotes.domain.interactors.AddNote
import com.lachlanvass.securenotes.domain.interactors.DeleteNote
import com.lachlanvass.securenotes.domain.interactors.GetNotes

data class NoteInteractors(
    val getNotes: GetNotes,
    val addNote: AddNote,
    val deleteNote: DeleteNote
)