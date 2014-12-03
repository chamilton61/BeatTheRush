package com.example.beattherush;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainScreenActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_screen);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_screen, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	public void goToBerkshire(View view){
		Intent intent = new Intent(this, Berkshire.class);
		startActivity(intent);
	}
	public void goToHampshire(View view){
		Intent intent = new Intent(this, Hampshire.class);
		startActivity(intent);
	}
	public void goToFranklin(View view){
		Intent intent = new Intent(this, Franklin.class);
		startActivity(intent);
	}
	public void goToWorcester(View view){
		Intent intent = new Intent(this, Worcester.class);
		startActivity(intent);
	}
}
