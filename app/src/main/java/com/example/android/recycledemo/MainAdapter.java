package com.example.android.recycledemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {

    private List<Message> messageInfo;
    private LayoutInflater inflator;

    public MainAdapter(List<Message> messages, Context context){
        messageInfo = messages;
        inflator = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MainHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holder=inflator.inflate(R.layout.main_item, parent, false);
        return new MainHolder(holder, this);
    }

    @Override
    public void onBindViewHolder(@NonNull MainHolder holder, int position) {
        Message message=messageInfo.get(position);

        holder.NameView.setText(message.name);
        holder.CommentView.setText(message.comment);

        if (message.drawable){
            holder.image.setImageResource(R.drawable.steak);
        }
        else{
            Picasso.get().load(message.src).into(holder.image);
        }
    }

    @Override
    public int getItemCount() {
        return messageInfo.size();
    }

    class MainHolder extends RecyclerView.ViewHolder{

        ConstraintLayout MainView;
        TextView NameView;
        TextView CommentView;
        ImageView image;
        final MainAdapter mAdapter;

        public MainHolder(View itemView, MainAdapter adapter){
            super(itemView);
            MainView= itemView.findViewById(R.id.list_main);
            NameView = itemView.findViewById(R.id.list_name);
            CommentView = itemView.findViewById(R.id.list_comment);
            image = itemView.findViewById(R.id.list_picture);

            this.mAdapter=adapter;
        }

    }
}
