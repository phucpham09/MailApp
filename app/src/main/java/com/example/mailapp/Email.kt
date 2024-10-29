package com.example.mailapp

data class Email(
    val senderName: String,
    val emailTime: String,
    val emailSubject: String,
    val emailPreview: String,
    val initials: String
)
