package com.erickresend.verdade_ou_desafio.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.erickresend.verdade_ou_desafio.databinding.ResPlayersBinding
import com.erickresend.verdade_ou_desafio.database.models.PlayerModel

class PlayerAdapter(
    var onItemClick: OnItemClick
):
    RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    private var list = mutableListOf<PlayerModel>()

    interface OnItemClick {
        fun onClick(player: PlayerModel)
    }

    inner class PlayerViewHolder(val binding: ResPlayersBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(player: PlayerModel) {
            binding.textPlayer.text = player.name
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