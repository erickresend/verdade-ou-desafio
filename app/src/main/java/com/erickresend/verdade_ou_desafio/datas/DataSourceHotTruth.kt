package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.database.models.ChallengeModel
import com.erickresend.verdade_ou_desafio.database.models.TruthModel

class DataSourceHotTruth {

    companion object {
        fun createDataSetHotTruth(): ArrayList<TruthModel> {
            val list = ArrayList<TruthModel>()
            list.add(TruthModel(""))

            return list
        }
    }
}