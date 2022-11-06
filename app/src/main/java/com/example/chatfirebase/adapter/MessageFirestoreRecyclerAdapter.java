package com.example.chatfirebase.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.RequestManager;
import com.example.chatfirebase.Message;
import com.firebase.ui.firestore.FirestoreRecyclerAdapter;
import com.firebase.ui.firestore.FirestoreRecyclerOptions;
import com.example.chatfirebase.R;



public class MessageFirestoreRecyclerAdapter extends FirestoreRecyclerAdapter<Message, MessageHolder> {

    private final RequestManager glide;

    public MessageFirestoreRecyclerAdapter(RequestManager glide, FirestoreRecyclerOptions<Message> options) {
        super(options);
        this.glide = glide;
    }

    @Override
    public void onBindViewHolder(MessageHolder holder, int position, Message message) {
        holder.bindMessage(message, position, glide);
    }

    @Override
    public MessageHolder onCreateViewHolder(ViewGroup group, int i) {
        View view = LayoutInflater.from(group.getContext())
                .inflate(R.layout.message, group, false);

        return new MessageHolder(view);
    }

    @Override
    public void onViewRecycled(MessageHolder holder) {
        super.onViewRecycled(holder);
        glide.clear(holder.imageView);
    }
}
