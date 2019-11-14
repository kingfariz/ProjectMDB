package com.training.mdb;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
	private int waktu_loading=3000;

	//4000=4 detik

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);


		setContentView(R.layout.activity_splash_screen);
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {

				//setelah loading maka akan langsung berpindah ke home activity
				Intent home=new Intent(SplashScreenActivity.this, LoginActivity.class);
				startActivity(home);
				finish();

			}
		},waktu_loading);
	}
}