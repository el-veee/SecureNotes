package com.lachlanvass.securenotes

data class Note(
    val title:String?,
    val content:String?,
    val createdTimestamp: Long,
    val modifiedTimestap:Long,

) {
}