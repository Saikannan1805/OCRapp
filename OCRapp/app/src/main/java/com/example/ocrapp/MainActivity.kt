package com.example.ocrapp

import android.Manifest
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PackageManagerCompat

class MainActivity : AppCompatActivity() {

    var button_capture = findViewById(R.id.button_capture) as Button
    var button_copy = findViewById(R.id.button_copy) as Button
    var textview_data = findViewById(R.id.text_data) as TextView

    var REQUEST_CAMERA_CODE = 100;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (ContextCompat.checkSelfPermission(this@MainActivity, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this@MainActivity, new <String>[10] {
                Manifest.permission.CAMERA
            },REQUEST_CAMERA_CODE);
        }
        button_capture.setOnClickListener(new View.OnClickListener() {
            @Override
        })

    }
}