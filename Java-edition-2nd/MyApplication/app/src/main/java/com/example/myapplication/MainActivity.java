package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.text_edit);
        imageView = findViewById(R.id.image_view);
        final TextView text_view = (TextView)findViewById(R.id.text_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);

        imageView.setVisibility(View.GONE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editText.getText().toString();
                if (!inputText.equals(""))
                    Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                text_view.setText(inputText);
                progressBar.setProgress(progressBar.getProgress() + 10);
//                if (progressBar.getVisibility() == View.GONE)
//                    progressBar.setVisibility(View.VISIBLE);
//                else
//                    progressBar.setVisibility(View.GONE);
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is a dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
            }
        });

    }
}
