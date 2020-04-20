package com.sem6.recyclertrial;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BlogViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textView;

    public BlogViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.image);
        textView = itemView.findViewById(R.id.details);

    }
}
