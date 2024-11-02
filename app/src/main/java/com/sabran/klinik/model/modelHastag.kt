package com.sabran.klinik.model

import android.widget.TextView
import com.sabran.klinik.R

data class modelHastag(
    var hastag : String
)

object MockList1{
    fun getModel() : List<modelHastag>{
        val itemModel1 = modelHastag(
            "#heart"
        )

        val itemModel2 = modelHastag(
            "#teeth"
        )

        val itemModel3 = modelHastag(
            "#surgeon"
        )

        val itemModel4 = modelHastag(
            "#eyes"
        )

        val itemModel5 = modelHastag(
            "#mounth"
        )


        val itemList : ArrayList<modelHastag> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)

        return itemList
    }
}