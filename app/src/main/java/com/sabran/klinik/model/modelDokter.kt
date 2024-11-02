package com.sabran.klinik.model

import com.sabran.klinik.R

data class modelDokter(
    var gambar : Int,
    var nama_dokter : String,
    var spesialis : String,
    var review : String,
    var nilai : String
)

object MockList2{
    fun getModel() : List<modelDokter>{
        val itemModel1 = modelDokter(
            R.drawable.dokter3,
            "Dr.Floyd Miles",
            "Pediatrics",
            "(123 reviews)",
            "4.9"
        )

        val itemModel2 = modelDokter(
            R.drawable.dokter8,
            "Dr. Guy Hawkins",
            "Dentist",
            "(85 reviews)",
            "4.9"
        )

        val itemModel3 = modelDokter(
            R.drawable.dokter9,
            "Dr. Jane Cooper",
            "Cardiologist",
            "(44 reviews)",
            "4.7"
        )

        val itemModel4 = modelDokter(
            R.drawable.dokter10,
            "Dr. Jacob Jones",
            "Nephrologyst",
            "(101 reviews)",
            "5.0"
        )

        val itemModel5 = modelDokter(
            R.drawable.dokter11,
            "Dr. Savannah Nguyen",
            "Urologyst",
            "(168 reviews)",
            "4.8"
        )

        val itmList : ArrayList<modelDokter> = ArrayList()
        itmList.add(itemModel1)
        itmList.add(itemModel2)
        itmList.add(itemModel3)
        itmList.add(itemModel4)
        itmList.add(itemModel5)

        return itmList
    }

}
