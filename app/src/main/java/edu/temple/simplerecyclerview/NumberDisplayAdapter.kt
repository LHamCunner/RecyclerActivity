package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val data: List<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>(){

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            ).apply {
                setPadding(10, 10, 10, 10)
                textSize = 30f
            }
        )

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        val number = data[position]
        holder.textView.text = number.toString()
    }

}