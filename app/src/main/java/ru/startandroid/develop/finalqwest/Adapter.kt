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
            binding.textTitle.text = events.type
            binding.openClick.setOnClickListener {
                val oldPosition = openedItemPos
                openedItemPos = adapterPosition
                oldPosition?.let { i -> notifyItemChanged(i) }
                notifyItemChanged(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater = LayoutInflater.from(parent.context)
        return if (viewType == opened)
            OpenedVH(RecyclerviewItemBinding.inflate(inflater, parent, false))
        else
            ClosedVH(RecyclerviewItemBinding.inflate(inflater, parent, false))
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        if (holder is ClosedVH) holder.bind(events[position])
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