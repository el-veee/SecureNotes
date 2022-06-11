package com.lachlanvass.securenotes.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    val title:String?,
    val content:String?,
    val createdTimestamp: Long,
    val modifiedTimestap:Long,

    @PrimaryKey val id: Int? = null

) {
}