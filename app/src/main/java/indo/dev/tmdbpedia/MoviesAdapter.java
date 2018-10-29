package indo.dev.tmdbpedia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by User on 29-Oct-18.
 */

public class MoviesAdapter extends ArrayAdapter{

    private List<Movies> movieList;
    private int resource;
    private Context context;

    public MoviesAdapter(Context context, int resource, List<Movies> movieDetails) {
        super(context, resource, movieDetails);
        this.context = context;
        this.movieList = movieDetails;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Movies details = movieList.get(position);

        View view = LayoutInflater.from(context).inflate(resource,parent,false);

        TextView movieName = (TextView) view.findViewById(R.id.txtTitle);
        TextView movieOver = (TextView) view.findViewById(R.id.txtDesc);
        ImageView image = (ImageView) view.findViewById(R.id.imageView);

        movieName.setText(details.title());
        movieOver.setText(details.getOverview());

        Glide.with(context).load("https://image.tmdb.org/t/p/w500/"+details.getPoster_path()).into(image);

        return view;
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return movieList.get(position);
    }
}
