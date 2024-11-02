package com.sabran.klinik.model

import com.sabran.klinik.R

data class modelIcon(
    var gambar : Int,
    var judul : String
)

object MockList{
    fun getModel() : List<modelIcon>{

        val itemModel1 = modelIcon(
            R.drawable.iconheart,
            "Cardiologyst"
        )

        val itemModel2 = modelIcon(
            R.drawable.iconeye,
            "Ophthalmologyst"
        )

        val itemModel3 = modelIcon(
            R.drawable.icontooth,
            "Dentist"
        )






        val itemList : ArrayList<modelIcon> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)


        return itemList


    }

}
