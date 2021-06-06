package com.example.retrofitappproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.CommentsViewHolder>{

    Context context;
    List<Comments> commentsListView;

    public CommentsAdapter(Context context, List<Comments> commentsListView) {
        this.context = context;
        this.commentsListView = commentsListView;
    }

    @NonNull
    @Override
    public CommentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comments, parent, false);
        CommentsViewHolder commentsViewHolder = new CommentsViewHolder(view);

        return commentsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CommentsViewHolder holder, int position) {

        Comments comments = commentsListView.get(position);
        holder.commentsText.setText(comments.getBody());
        holder.email.setText("Email : "+comments.getEmail());
        holder.name.setText("Name : "+ comments.getName());
    }

    @Override
    public int getItemCount() {
        return commentsListView.size();
    }

    public class CommentsViewHolder extends RecyclerView.ViewHolder {
        TextView commentsText, name, email;

        public CommentsViewHolder(@NonNull View itemView) {
            super(itemView);
            commentsText = itemView.findViewById(R.id.comments);
            name = itemView.findViewById(R.id.name);
            email = itemView.findViewById(R.id.email);

        }
    }
}