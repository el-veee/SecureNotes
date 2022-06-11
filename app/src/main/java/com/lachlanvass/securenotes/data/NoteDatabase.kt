package com.lachlanvass.securenotes.data

import androidx.room.Database
import com.lachlanvass.securenotes.domain.model.Note

@Database(
    entities = [Note::class],
    version = 1
)
abstract class NoteDatabase {

    abstract val noteDao: NoteDao

    companion object {
        const val DATABASE_NAME = "notes_db"
    }
}