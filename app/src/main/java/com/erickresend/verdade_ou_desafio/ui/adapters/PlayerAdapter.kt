package com.erickresend.verdade_ou_desafio.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import com.erickresend.verdade_ou_desafio.R
import com.erickresend.verdade_ou_desafio.databinding.ResPlayersBinding
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel
import com.erickresend.verdade_ou_desafio.service.Constants

class PlayerAdapter(
    var onItemClick: OnItemClick
):
    RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    private var list = mutableListOf<PlayerModel>()

    interface OnItemClick {
        fun onClick(player: PlayerModel)
    }

    inner class PlayerViewHolder(private val binding: ResPlayersBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(player: PlayerModel) {
            binding.textPlayer.text = player.name
            if(player.sex == Constants.SEX.BOY) {
                binding.imgSex.setImageResource(R.drawable.img_boy)
            } else {
                binding.imgSex.setImageResource(R.drawable.img_girl)
            }
            binding.cardPlayer.setOnClickListener {
                onItemClick.onClick(player)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val binding = ResPlayersBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = list[position]
        holder.bind(player)
    }

    fun setPlayerList(players: List<PlayerModel>) {
        list = players.toMutableList()
        notifyDataSetChanged()
    }
}