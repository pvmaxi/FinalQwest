package ru.startandroid.develop.finalqwest

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.startandroid.develop.finalqwest.databinding.RecyclerviewItemBinding
import ru.startandroid.develop.finalqwest.databinding.RecyclerviewItemOpenedBinding
import java.util.*

class EventAdapter(private var events: List<Event>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var openedItemPos: Int? = null

    inner class Closed(var binding: RecyclerviewItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(events: Event) {
            binding.textViewLarge.text = events.name
            binding.textTitle.text = events.type
            binding.openClick.setOnClickListener {
                val standartPos = openedItemPos
                openedItemPos = adapterPosition
                standartPos?.let { i -> notifyItemChanged(i) }
                notifyItemChanged(adapterPosition)
            }
        }
    }

    inner class Opened(var binding: RecyclerviewItemOpenedBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(events: Event) {
            binding.textViewLarge.text = events.name
            binding.textTitle.text = events.type
            binding.allText.text = events.allText
            binding.closeClick.setOnClickListener {
                openedItemPos = null
                notifyItemChanged(adapterPosition)
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (position == openedItemPos) 1
        else 2
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == 1)
            Opened(RecyclerviewItemOpenedBinding.inflate(inflater, parent, false))
        else
            Closed(RecyclerviewItemBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is Closed) holder.bind(events[position])
        else if (holder is Opened) holder.bind(events[position])
    }

    override fun getItemCount(): Int {
        return events.size
    }

    class Event(
        var name: String = "Max",
        var date: Date = Date(),
        var type: String = "Birthday",
        var allText: String = "Здесь будет текст события. Твой собственный текст!"
    )
}