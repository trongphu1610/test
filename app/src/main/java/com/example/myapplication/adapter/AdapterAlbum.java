package com.example.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.R;
import com.example.myapplication.model.Album;

import java.util.List;

public class AdapterAlbum extends RecyclerView.Adapter<AdapterAlbum.AlbumHolder> {

    Context context;
    List<Album> albums;

    public AdapterAlbum(Context context, List<Album> albums) {
        this.context = context;
        this.albums = albums;
    }

    @NonNull
    @Override
    public AdapterAlbum.AlbumHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_album, parent, false);
        return new AlbumHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterAlbum.AlbumHolder holder, int position) {
        Glide.with(context).load(albums.get(position).getAvt()).into(holder.imgAvt);
        holder.tvName.setText(albums.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public class AlbumHolder extends RecyclerView.ViewHolder {
        private ImageView imgAvt;
        private TextView tvName;
        private  TextView tvContent;
        public AlbumHolder(@NonNull View itemView) {
            super(itemView);
            imgAvt = itemView.findViewById(R.id.img_avt_album);
            tvName = itemView.findViewById(R.id.tv_name_album);
            tvContent = itemView.findViewById(R.id.tv_art_album);
        }
    }
}
