package com.twiceyuan.androidmavenpublishsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.twiceyuan.mavenpublish.samplelib.TestLib
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_resource.setText(R.string.test_string)

        TestLib().test()
    }
}
