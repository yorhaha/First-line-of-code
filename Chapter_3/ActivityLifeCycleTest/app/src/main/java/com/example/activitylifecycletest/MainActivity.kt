package com.example.activitylifecycletest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val log_tag = "myLogTag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(log_tag, "onCreate")

        if (savedInstanceState != null) {
            val tempData = savedInstanceState.getString("data_key")
            Log.d(log_tag, tempData)
        }

        startNormalActivity.setOnClickListener {
            val intent = Intent(this, NormalActivity::class.java)
            startActivity(intent)
        }
        startDialogActivity.setOnClickListener {
            val intent = Intent(this, DialogActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        val tempData = "Something you just typed"
        outState.putString("data_key", tempData)
    }

    override fun onStart() {
        super.onStart()
        Log.d(log_tag, "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d(log_tag, "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(log_tag, "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(log_tag, "onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d(log_tag, "onDestroy")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(log_tag, "onRestart")
    }
}
