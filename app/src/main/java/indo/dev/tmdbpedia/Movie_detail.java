package indo.dev.tmdbpedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Movie_detail extends AppCompatActivity {
	
	
	private TextView txtJudul,txtTanggal,txtDeskripsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
		
		txtJudul =(TextView) findViewById(R.id.txtJudul);
		txtTanggal =(TextView) findViewById(R.id.txtTanggal);
		txtDeskripsi =(TextView) findViewById(R.id.txtDeskripsi);
		
		Movies details = (Movies) getIntent().getExtras().getSerializable("MovieDetails");
		
		
		if(details != null){
			txtJudul.setText(details.getTitle());
			txtTanggal.setText(details.getRelease());
			txtDeskripsi.setText(details.getOverview());
		}


    }
}
