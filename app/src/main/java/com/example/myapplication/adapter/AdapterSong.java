package com.example.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.fragment.FragmentFavorite;
import com.example.myapplication.model.Songg;

import java.util.List;

public class AdapterSong extends RecyclerView.Adapter<AdapterSong.SongHolder> {
    private Context context;
    private List<Songg> songs;

    public AdapterSong(Context context, List<Songg> songs) {
        this.context = context;
        this.songs = songs;
    }

    public AdapterSong(FragmentFavorite fragmentFavorite, List<Songg> songs) {

    }

    @NonNull
    @Override
    public AdapterSong.SongHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.adapter_song, parent, false);
        return new SongHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterSong.SongHolder holder, int position) {
        final Songg song = songs.get(position);
        holder.tvArt.setText(song.getArtistName());
        holder.tvName.setText(song.getSongName());
        Glide.with(context).load(song.getLinkImage()).into(holder.imgAvt);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = song.getLinkSong();
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return songs.size();
    }

    public class SongHolder extends RecyclerView.ViewHolder {
        private ImageView imgAvt;
        private TextView tvName;
        private TextView tvArt;
        public SongHolder(@NonNull View itemView) {
            super(itemView);
            imgAvt = (ImageView) itemView.findViewById(R.id.img_avt);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvArt = (TextView) itemView.findViewById(R.id.tv_art);
        }
    }
}
