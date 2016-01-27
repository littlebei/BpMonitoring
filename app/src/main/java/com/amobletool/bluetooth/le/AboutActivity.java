package com.amobletool.bluetooth.le;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.amoheartrate.bluetooth.le.R;

public class AboutActivity extends Activity {
	private final static String TAG = AboutActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		getActionBar().setTitle("About our team");

		Intent intent = getIntent();
		String value = intent.getStringExtra("testIntent");

		String help = "test";

		TextView tv = (TextView) findViewById(R.id.about_text_help);
		tv.setText(help);
	}

	public void onClick(View v) {
		// TODO 自动生成的方法存根
	}

}