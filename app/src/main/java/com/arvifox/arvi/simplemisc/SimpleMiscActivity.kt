package com.arvifox.arvi.simplemisc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.arvifox.arvi.R
import com.arvifox.arvi.simplemisc.camera.CameraShotActivity
import kotlinx.android.synthetic.main.activity_simple_misc.*

import kotlinx.android.synthetic.main.app_bar_layout.*

class SimpleMiscActivity : AppCompatActivity() {

    companion object {
        fun newIntent(c: Context): Intent {
            return Intent(c, SimpleMiscActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_misc)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        btnCameraStart.setOnClickListener { startActivity(CameraShotActivity.newIntent(this)) }
    }
}