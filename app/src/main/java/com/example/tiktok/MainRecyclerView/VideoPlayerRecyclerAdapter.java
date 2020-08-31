package com.example.tiktok.MainRecyclerView;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.RequestManager;
import com.example.tiktok.Models.MediaObject;
import com.example.tiktok.R;

import java.util.ArrayList;


public class VideoPlayerRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<MediaObject> mediaObjects;
    private RequestManager requestManager;

    public VideoPlayerRecyclerAdapter(ArrayList<MediaObject> arrayList, RequestManager requestManager2) {
        this.mediaObjects = arrayList;
        this.requestManager = requestManager2;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new VideoPlayerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_main, viewGroup, false));
    }

    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((VideoPlayerViewHolder) viewHolder).onBind(this.mediaObjects.get(i), this.requestManager);
    }

    public int getItemCount() {
        return this.mediaObjects.size();
    }
}

