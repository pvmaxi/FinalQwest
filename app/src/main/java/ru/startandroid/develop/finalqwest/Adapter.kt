package ru.startandroid.develop.finalqwest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.develop.finalqwest.databinding.RecyclerviewItemBinding
import java.util.*

class EventAdapter(private var events: List<Event>) : RecyclerView.Adapter<EventAdapter.Holder>() {

    class Holder(var binding: RecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(events: Event) {
            binding.textViewLarge.text = events.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(RecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(events[position])
    }

    override fun getItemCount(): Int {
        return events.size
    }

    class Event(
        var name: String = "Max",
        var date: Date = Date(),
        var type: String = "Birthday"
    )
}