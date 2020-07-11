package com.example.uiwidgettest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener(this)
        button_changePic.setOnClickListener(this)
        button_changeProgress.setOnClickListener(this)
        button_addProgress.setOnClickListener(this)
        button_alertDialog.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.button -> {
                val intputText = editText.text.toString()
                if (intputText != "") {
                    Toast.makeText(this, intputText, Toast.LENGTH_SHORT).show()
                }
            }
            R.id.button_changePic -> {
                imageView.setImageResource(R.drawable.img_2)
            }
            R.id.button_changeProgress -> {
                if (progressBar.visibility == View.VISIBLE) {
                    progressBar.visibility = View.GONE
                } else {
                    progressBar.visibility = View.VISIBLE
                }
            }
            R.id.button_addProgress -> {
                progressBar2.progress += 10
            }
            R.id.button_alertDialog -> {
                AlertDialog.Builder(this).apply {
                    setTitle("This is Dialog")
                    setMessage("Something important")
                    setCancelable(false)
                    setPositiveButton("OK") { dialog, which ->
                    }
                    setNegativeButton("Cancel") { dialog, which ->
                    }
                    show()
                }
            }
        }
    }
}