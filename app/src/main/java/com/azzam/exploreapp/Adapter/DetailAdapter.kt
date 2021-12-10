package com.azzam.exploreapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.azzam.exploreapp.databinding.RowItemDetailBinding
import com.azzam.exploreapp.databinding.RowItemHomeBinding
import com.bumptech.glide.Glide


class DetailAdapter(val listDetail: ArrayList<DetailExplore>): RecyclerView.Adapter<DetailAdapter.MyViewHolder>() {
    class MyViewHolder(val binding: RowItemHomeBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: DetailAdapter.MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listDetail[position]){
                txtTitle.text = title
                Glide.with(imgHome.context).load(photo).into(imgHome)
            }
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXPLORE_DATA, listDetail[position])
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = listDetail.size

}
