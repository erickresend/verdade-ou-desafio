package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.model.ChallengeModel

class DataSourceChallenge {

    companion object {
        fun createDataSetChallenge(): ArrayList<ChallengeModel> {
            val listChallenge= ArrayList<ChallengeModel>()
            listChallenge.add(ChallengeModel("teste desafio 1"))
            listChallenge.add(ChallengeModel("teste desafio 2"))
            listChallenge.add(ChallengeModel("teste desafio 3"))
            listChallenge.add(ChallengeModel("teste desafio 4"))
            listChallenge.add(ChallengeModel("teste desafio 5"))

            return listChallenge
        }
    }
}