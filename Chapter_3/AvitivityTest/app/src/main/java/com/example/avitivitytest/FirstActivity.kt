package com.example.avitivitytest

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_first.*

class FirstActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

//        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            Toast.makeText(this, "You click Button 1", Toast.LENGTH_SHORT).show()
        }
        button_go_second.setOnClickListener {
            val my_data = "Hello second activity"
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("extra_data", my_data)
            startActivity(intent)
        }
        button_go_second2.setOnClickListener {
            val intent = Intent("com.example.activitytest.ACTION_START")
            intent.addCategory("com.example.activitytest.MY_CATEGORY")
            startActivityForResult(intent, 1)
        }
        button_go_second3.setOnClickListener {
            SecondActivity.actionStart(this, "data1", "data2")
        }
        button_open_baidu.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.baidu.com")
            startActivity(intent)

        }
        button_exit.setOnClickListener {
            finish()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.add_item -> Toast.makeText(this, "You click Add",
                Toast.LENGTH_SHORT).show()
            R.id.remove_item -> Toast.makeText(this, "You click Remove",
                Toast.LENGTH_SHORT).show()
        }
        return true
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        when (requestCode) {
            1 -> if (resultCode == Activity.RESULT_OK) {
                val returnData = data?.getStringExtra("data_return")
                if (returnData != null) {
                    text_return.setText(returnData)
                }
            }
        }
    }
}
