package com.example.avitivitytest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extra_data = intent.getStringExtra("extra_data")
        if (extra_data != null) {
            text_extra_data.setText(extra_data)
        }

        button_return.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return", "Hello first activity")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return", "Hello first activity")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
