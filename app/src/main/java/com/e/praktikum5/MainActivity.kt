package com.e.praktikum5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val testData = createKontak()
        rv_kontak.layoutManager = LinearLayoutManager(this)
        rv_kontak.setHasFixedSize(true)
        rv_kontak.adapter = Adapter(testData, { fakItem: Data -> resepItemClicked(fakItem)})
    }
    private fun resepItemClicked(Item: Data) {
        val showDetailActivityIntent = Intent(this, Detail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, Item.namakontak.toString())
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, Item.desckontak.toString())
        startActivity(showDetailActivityIntent)
    }
    private fun createKontak() : List<Data> {
        val partList = ArrayList<Data>()
        partList.add(
            Data("ABIMANYU",
            "+62 838-6946-3456"))
        partList.add(Data("BUDIYANTO",
            "+62 878-8546-9878"))
        partList.add(Data("CACA HANDIKA",
            "+62 838-8421-6443"))
        partList.add(Data("DESY SINTA",
            "+62 838-6432-0132"))
        partList.add(Data("ENGGAR AKSARA",
            "+62 838-0560-0320"))
                return partList
    }
}