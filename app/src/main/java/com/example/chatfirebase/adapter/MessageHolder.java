package com.example.chatfirebase.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.example.chatfirebase.Message;
import com.example.chatfirebase.R;



public class MessageHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    View mView;
    Context mContext;
    public TextView view;
    public ImageView imageView;

    public MessageHolder(View itemView) {
        super(itemView);
        mView = itemView;
        mContext = itemView.getContext();
        view = mView.findViewById(R.id.textView);
        imageView = mView.findViewById(R.id.imageView);
        itemView.setOnClickListener(this);
    }

    public void bindMessage(Message message, int position, RequestManager glide) {

        view.setText(message.getText());
        glide
                .load(message.getPhotoUrl())
                .apply(RequestOptions
                        .circleCropTransform()
                        .placeholder(R.drawable.ic_launcher_foreground))
                .into(imageView);
    }

    @Override
    public void onClick(View view) {

    }
}