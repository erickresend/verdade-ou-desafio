package com.erickresend.verdade_ou_desafio.datas

import com.erickresend.verdade_ou_desafio.model.TruthModel

class DataSourceTruth {

    companion object {
        fun createDataSetTruth(): ArrayList<TruthModel> {
            val listTruth = ArrayList<TruthModel>()
            listTruth.add(TruthModel("Verdade 1"))
            listTruth.add(TruthModel("Verdade 2"))
            listTruth.add(TruthModel("Verdade 3"))
            listTruth.add(TruthModel("Verdade 4"))
            listTruth.add(TruthModel("Verdade 5"))

            return listTruth
        }
    }
}