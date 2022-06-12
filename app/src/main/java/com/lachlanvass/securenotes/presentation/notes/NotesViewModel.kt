package com.lachlanvass.securenotes.presentation.notes

import androidx.lifecycle.ViewModel
import com.lachlanvass.securenotes.framework.interactors.NoteInteractors

class NotesViewModel(private val noteInteractors: NoteInteractors) : ViewModel() {

    var notes = noteInteractors.getNotes()

}