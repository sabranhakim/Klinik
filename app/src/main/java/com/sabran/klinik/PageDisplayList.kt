package com.sabran.klinik

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sabran.klinik.adapter.adapterDokter
import com.sabran.klinik.adapter.adapterHastag
import com.sabran.klinik.adapter.adapterIcon
import com.sabran.klinik.model.MockList
import com.sabran.klinik.model.MockList1
import com.sabran.klinik.model.MockList2
import com.sabran.klinik.model.modelDokter
import com.sabran.klinik.model.modelHastag
import com.sabran.klinik.model.modelIcon

class PageDisplayList : AppCompatActivity() {
    private lateinit var rv_hastag : RecyclerView
    private lateinit var rv_icon : RecyclerView
    private lateinit var rv_dokter : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_display_list)

        rv_hastag = findViewById(R.id.rv_hastag)
        rv_icon = findViewById(R.id.rv_icon)
        rv_dokter = findViewById(R.id.rv_dokter)

        ///recycle view hastag
        rv_hastag.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val adapter = adapterHastag(MockList1.getModel() as ArrayList<modelHastag>,this)
        rv_hastag.adapter = adapter

        rv_hastag.layoutManager?.scrollToPosition(0)

        ///recyle view icon
        rv_icon.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        val adapter1 = adapterIcon(MockList.getModel() as ArrayList<modelIcon>,this)
        rv_icon.adapter = adapter1

        rv_icon.layoutManager?.scrollToPosition(0)

        //recycle view dokter
        rv_dokter.layoutManager = GridLayoutManager(this, 1)
        val adapter2 = adapterDokter(MockList2.getModel() as ArrayList<modelDokter>, this)
        rv_dokter.adapter = adapter2

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}