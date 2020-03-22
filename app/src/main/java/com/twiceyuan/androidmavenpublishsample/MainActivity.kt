package com.twiceyuan.androidmavenpublishsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twiceyuan.mavenpublish.samplelib.TestLib

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestLib().test()
    }
}
