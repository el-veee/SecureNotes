package com.lachlanvass.securenotes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.lachlanvass.securenotes.presentation.notes.NotesViewModel
import com.lachlanvass.securenotes.ui.theme.SecureNotesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val notesViewModel: NotesViewModel by viewModels()
        val notes = notesViewModel.notes

        setContent {
            SecureNotesTheme {

            }
        }
    }
}