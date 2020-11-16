package com.e.praktikum5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.kontak_desc.*

class Detail : AppCompatActivity() {
    override fun onCreate (savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kontak_desc)

        var intentThatStartedThisActivity = getIntent()


        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)) {
            var partNama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEXT)
            var partDesc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            nk.text = partNama
            descnomor.text = partDesc

        }
    }
}