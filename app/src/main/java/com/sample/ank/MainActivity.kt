package com.sample.ank

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding

class MainActivity: AppCompatActivity {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main);
	}
	override fun onDestroy() {
		super.onDestroy();
	}
	override fun onStart() {
		super.onStart()
	}
	overridez fun onPause() {
		super.onPause()
	}
}
