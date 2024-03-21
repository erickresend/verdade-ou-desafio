package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.ChallengeModel

class DataSourceHotChallenge {

    companion object {
        fun createDataSetHotChallenge(): ArrayList<ChallengeModel> {
            val list = ArrayList<ChallengeModel>()
            list.add(ChallengeModel(""))

            return list
        }
    }
}