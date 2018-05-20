package com.svanriper.habittrainer

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.single_card.view.*

/**
 * Created by Shawn on 5/20/2018.
 */
class HabitsAdapter(private val habits: List<Habit>): RecyclerView.Adapter<HabitsAdapter.HabitViewHolder>() {

    class HabitViewHolder(val card: View) : RecyclerView.ViewHolder(card)

    // Specifies the contents for the shown habit
    override fun onBindViewHolder(holder: HabitViewHolder, position: Int) {
        val habit = habits[position]
        holder.card.tvTitle.text = habit.title
        holder.card.tvDescription.text = habit.description
        holder.card.ivIcon.setImageResource(habit.image)
    }

    // Create a new ViewHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HabitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.single_card, parent, false)
        return HabitViewHolder(card = view)
    }

    override fun getItemCount() = habits.size

}