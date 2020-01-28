package com.example.android.recycledemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainHolder> {

    private List<String> nameInfo;
    private List<String> commentInfo;
    private LayoutInflater inflator;

    public MainAdapter(List<String> namelist, List<String> commentList, Context context){
        nameInfo = namelist;
        commentInfo = commentList;
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
        String name=nameInfo.get(position);
        String comment = commentInfo.get(position);

        holder.NameView.setText(name);
        holder.CommentView.setText(comment);
    }

    @Override
    public int getItemCount() {
        return nameInfo.size();
    }

    class MainHolder extends RecyclerView.ViewHolder{

        ConstraintLayout MainView;
        TextView NameView;
        TextView CommentView;
        final MainAdapter mAdapter;

        public MainHolder(View itemView, MainAdapter adapter){
            super(itemView);
            MainView= itemView.findViewById(R.id.list_main);
            NameView = itemView.findViewById(R.id.list_name);
            CommentView = itemView.findViewById(R.id.list_comment);

            this.mAdapter=adapter;
        }

    }
}
