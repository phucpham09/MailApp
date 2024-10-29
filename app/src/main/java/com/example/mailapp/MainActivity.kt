package com.example.mailapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        val emailList = listOf(
            Email("Edurila.com", "12:34 PM", "Learn Web Designing", "Are you looking to Learn Web Designing?", "E"),
            Email("Chris Abad", "11:22 AM", "Campaign Monitor", "Let us know your thoughts! No images", "C"),
            Email("Tuto.com", "11:04 AM", "Free tutorials", "Photoshop, SEO, WordPress, and more", "T"),
            Email("Support", "10:26 AM", "OVH Support", "Your services are due for renewal", "S"),
            Email("Matt from Ionic", "9:45 AM", "Ionic Creator is here!", "Announcing the all-new Creator!", "M")
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = EmailAdapter(emailList)
    }
}