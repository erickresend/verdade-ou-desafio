package com.erickresend.verdade_ou_desafio.recylerview

import androidx.recyclerview.widget.RecyclerView
import com.erickresend.verdade_ou_desafio.databinding.ResPlayersBinding
import com.erickresend.verdade_ou_desafio.datas.DataSourcePlayer
import com.erickresend.verdade_ou_desafio.models.PlayerModel

class PlayerViewHolder(val binding: ResPlayersBinding) : RecyclerView.ViewHolder(binding.root) {

    private val adapter = PlayerAdapter()

    fun bind(player: PlayerModel) {
        binding.textPlayer.text = player.name
    }
}