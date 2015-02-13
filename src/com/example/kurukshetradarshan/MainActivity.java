package com.example.kurukshetradarshan;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		GridView gridView;
		ArrayList<Item> gridArray = new ArrayList<Item>();
		 CustomGridViewAdapter customGridAdapter;
		//set grid view item
			Bitmap routes = BitmapFactory.decodeResource(this.getResources(), R.drawable.routes);
			Bitmap reference = BitmapFactory.decodeResource(this.getResources(), R.drawable.refer);
			Bitmap taxi = BitmapFactory.decodeResource(this.getResources(), R.drawable.taxi);
			Bitmap hotel = BitmapFactory.decodeResource(this.getResources(), R.drawable.hotel);
			Bitmap mela = BitmapFactory.decodeResource(this.getResources(), R.drawable.mela);
			Bitmap natak = BitmapFactory.decodeResource(this.getResources(), R.drawable.natak);
			Bitmap express = BitmapFactory.decodeResource(this.getResources(), R.drawable.express);
			Bitmap emergency = BitmapFactory.decodeResource(this.getResources(), R.drawable.emergency);
			Bitmap share = BitmapFactory.decodeResource(this.getResources(), R.drawable.share);
			Bitmap feedback = BitmapFactory.decodeResource(this.getResources(), R.drawable.feedback);
			Bitmap about = BitmapFactory.decodeResource(this.getResources(), R.drawable.about);
			Bitmap rating = BitmapFactory.decodeResource(this.getResources(), R.drawable.rating);
			
			gridArray.add(new Item(routes,"Routes"));
			gridArray.add(new Item(reference,"Refereneces"));
			gridArray.add(new Item(taxi,"Taxis"));
			gridArray.add(new Item(hotel,"Hotels & Restaurants"));
			gridArray.add(new Item(mela,"Fair Calendars"));
			gridArray.add(new Item(natak,"Natak"));
			gridArray.add(new Item(express,"Railway/Bus Routes"));
			gridArray.add(new Item(emergency,"Emergency"));
			gridArray.add(new Item(share,"Share"));
			gridArray.add(new Item(feedback,"Feedback"));
			gridArray.add(new Item(about,"About"));
			gridArray.add(new Item(rating,"Rating"));
			
			
			gridView = (GridView) findViewById(R.id.gridView1);
			customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
			gridView.setAdapter(customGridAdapter);
			gridView.setOnItemClickListener(new OnItemClickListener() {

				
					public void onItemClick(AdapterView<?> arg0, View arg1, int ch,
							long arg3) {
						// TODO Auto-generated method stub
						Log.e("In click event", Integer.toString(ch));
						switch(ch)
						{
						//Create different cases for numbers in the grid
						case 8:
							Intent i=new Intent(android.content.Intent.ACTION_SEND);
							i.setType("text/plain");
							i.putExtra(android.content.Intent.EXTRA_SUBJECT,"New Application");
							i.putExtra(android.content.Intent.EXTRA_TEXT, "Here is new application about kkr tourism i would like to share with thids u....LINK OF APPLICATION");
							startActivity(Intent.createChooser(i,"Share via"));
							break;
						}
						}
				});
				}
		
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
