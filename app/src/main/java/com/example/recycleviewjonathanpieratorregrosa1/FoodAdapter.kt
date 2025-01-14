package com.example.recycleviewjonathanpieratorregrosa1

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList: List<Food>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return FoodViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val foodItem = foodList[position]
        holder.foodName.text = foodItem.name
        holder.foodCountry.text = foodItem.country
        holder.foodImage.setImageResource(foodItem.imageResource)

        holder.itemView.setOnClickListener {

            // aci me ha ajudat un poc el chatgpt //

            val context = holder.itemView.context
            val intent = Intent(context, WikipediaActivity::class.java)
            intent.putExtra("URL", foodItem.wikipediaUrl)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodName: TextView = itemView.findViewById(R.id.foodName)
        val foodCountry: TextView = itemView.findViewById(R.id.foodCountry)
        val foodImage: ImageView = itemView.findViewById(R.id.foodImage)
    }
}
