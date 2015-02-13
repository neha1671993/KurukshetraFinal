package hotels;


import com.example.kurukshetradarshan.R;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {
	ListView list;
	String[] web = {
		"Parakeet Tourist Complex, Pipli",
		"Neelkanthi Yatri Niwas, Near Birla Mandir",
		"Jyotisar Tourist Complex, Pehowa Road, Jyotisar", 
		"Hotel Saffron, Pipli Road ",
		"Hotel Pearl Marc, Railway Road", 
		"Heritage Hotel, Pipli Road",
		"Hotel Celebration, Red Road ",
		"Hotel Silver Sand, Near Old Bus Stand", 
		"Hotel Mezbaan Regency, Railway Road ",
		"Hotel 9th Planet, Pipli Road, Opp. Telephone Exchange 01744-323132, 220223, 9896094356",
		"Richi Rich, Near 3rd Gate, KUK"
		
	} ;
	Integer[] imageId = {
			R.drawable.parakit,
			R.drawable.neelkanthi1,
			R.drawable.jyotisarfront,
			R.drawable.saffron,
			R.drawable.notavailable,
			R.drawable.notavailable,
			R.drawable.notavailable,
			R.drawable.notavailable,
			R.drawable.notavailable,
			R.drawable.notavailable,
			R.drawable.notavailable
			
			
			
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hotel);
		
		//Hotels work.....
		CustomList adapter = new
				CustomList(MainActivity.this, web, imageId);
		list=(ListView)findViewById(R.id.list);
				list.setAdapter(adapter);
				list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		            @Override
		            public void onItemClick(AdapterView<?> parent, View view,
		                                    int position, long id) {
		            	Intent i = new Intent(Intent.ACTION_VIEW);
	                	switch(position)
		                {
		                case 0:
		                	i.setData(Uri.parse("http://www.haryanatourism.gov.in/destination/parakeet.asp"));
		                	startActivity(i);
		                	break;
		                case 1:
		                	i.setData(Uri.parse("http://www.haryanatourism.gov.in/destination/neelkanthi.asp"));
		                	startActivity(i);
		                	break;
		                case 2:
		                	i.setData(Uri.parse("http://www.haryanatourism.gov.in/destination/jyotisar.asp"));
		                	startActivity(i);
		                	break;
		                case 3:
		                	i.setData(Uri.parse("http://hotelsaffronkkr.com/ContactUs.html"));
		                	startActivity(i);
		                	break;
		                case 4:
		                	i.setData(Uri.parse("http://www.hotelpearlmarc.com/"));
		                	startActivity(i);
		                	break;
		                default:
		                	Toast.makeText(getApplicationContext(), "Sorry No Information available..", 3000).show();
		                }
		                
		            }
		        });

				
				
				
	}
			
}
