package com.example.ex_templete;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class LaiguangqiangActivity9 extends Activity
{
	public void btu(View v)
	{
		startActivity(new Intent(this, LiaoHuiActivity10.class));
		finish();
	}

	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_laiguangqiang_activity9);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ruan_activity10, menu);
		return true;
	}
}
