package com.acadview.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {


    private List<Movie> Movieslist;

    public class ViewHolder extends RecyclerView.ViewHolder  {


        public TextView title,genre,year;
        ImageView image;
        public ViewHolder(View View) {


            super(View);

            title = (TextView) View.findViewById(R.id.title);
            genre = (TextView) View.findViewById(R.id.genre);
            year = (TextView) View.findViewById(R.id.year);
            image = (ImageView) View.findViewById(R.id.img);
        }
    }

    public MovieAdapter(List<Movie> MoviesList) {
        this.Movieslist = MoviesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View View = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Movie movie = Movieslist.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        holder.image.setImageResource(movie.getimage());




    }

    @Override
    public int getItemCount() {
        return Movieslist.size();
    }


}
