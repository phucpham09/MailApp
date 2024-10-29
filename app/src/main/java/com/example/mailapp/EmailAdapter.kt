package com.example.mailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: List<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val initials: TextView = itemView.findViewById(R.id.initials)
        val senderName: TextView = itemView.findViewById(R.id.senderName)
        val emailTime: TextView = itemView.findViewById(R.id.emailTime)
        val emailSubject: TextView = itemView.findViewById(R.id.emailSubject)
        val emailPreview: TextView = itemView.findViewById(R.id.emailPreview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.initials.text = email.initials
        holder.senderName.text = email.senderName
        holder.emailTime.text = email.emailTime
        holder.emailSubject.text = email.emailSubject
        holder.emailPreview.text = email.emailPreview
    }

    override fun getItemCount() = emailList.size
}
