package com.erickresend.verdade_ou_desafio.recylerview

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.erickresend.verdade_ou_desafio.databinding.ResPlayersBinding
import com.erickresend.verdade_ou_desafio.datas.DataSourcePlayer
import com.erickresend.verdade_ou_desafio.models.PlayerModel

class PlayerAdapter: RecyclerView.Adapter<PlayerViewHolder>() {

    private var list = mutableListOf<PlayerModel>()


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
        holder.binding.btnDeletePlayer.setOnClickListener {
            DataSourcePlayer.removePlayer(position)
            list.removeAt(position)
            notifyDataSetChanged()
        }
    }

    fun setPlayerList(players: List<PlayerModel>) {
        list.clear()
        list = players.toMutableList()
        notifyDataSetChanged()
    }

    fun getAll(): List<PlayerModel> {
        return list
    }

    fun addPlayer(player: PlayerModel) {
        list.add(player)
        notifyDataSetChanged()
    }
}