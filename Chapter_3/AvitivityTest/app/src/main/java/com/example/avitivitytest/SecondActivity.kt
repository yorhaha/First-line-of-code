package com.example.avitivitytest

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : BaseActivity() {

    companion object {
        fun actionStart(context: Context, data1: String, data2: String) {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("param1", data1)
            intent.putExtra("param2", data2)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val extraData = intent.getStringExtra("extra_data")
        if (extraData != null) {
            text_extra_data.setText(extraData)
        }

        button_return.setOnClickListener {
            val intent = Intent()
            intent.putExtra("data_return", "Hello first activity")
            setResult(Activity.RESULT_OK, intent)
            finish()
        }

        button_exit.setOnClickListener {
            ActivityCollector.finishAll()
            android.os.Process.killProcess(android.os.Process.myPid())
        }
    }

    override fun onBackPressed() {
        val intent = Intent()
        intent.putExtra("data_return", "Hello first activity")
        setResult(Activity.RESULT_OK, intent)
        finish()
    }
}
