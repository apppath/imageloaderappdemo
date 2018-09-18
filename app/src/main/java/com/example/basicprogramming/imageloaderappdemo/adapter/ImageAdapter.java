package com.example.basicprogramming.imageloaderappdemo.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.imageloader.ImageLoader;
import com.budiyev.android.imageloader.ImageUtils;
import com.example.basicprogramming.imageloaderappdemo.R;
import com.example.basicprogramming.imageloaderappdemo.model.Images;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.Holder> {

    private Context context;
    private ArrayList<Images> imagesArrayList;
    private LayoutInflater inflater;

    public ImageAdapter(Context context, ArrayList<Images> imagesArrayList) {
        this.context = context;
        this.imagesArrayList = imagesArrayList;
        this.inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int position) {

        View view = inflater.inflate(R.layout.list_of_image_layout, parent, false);
        Holder holder = new Holder(view);
        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {

        Images images = imagesArrayList.get(position);

        ImageLoader.with(context)
                .from(images.getImageUrl())
                .size(350, 500)
                .roundCorners()
                .placeholder(new ColorDrawable(Color.GREEN))
                .errorDrawable(new ColorDrawable(Color.RED))
                .transform(ImageUtils.cropCenter())
                .transform(ImageUtils.roundCorners())
                .load(holder.imageView);

        holder.textView.setText(images.getMovieName().toUpperCase());
        holder.setListener(position);
    }

    @Override
    public int getItemCount() {
        return imagesArrayList.size();
    }

    public class Holder extends RecyclerView.ViewHolder {

        private TextView textView;
        private ImageView imageView;

        public Holder(View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.movie_name_text_view);
            imageView = itemView.findViewById(R.id.my_image_loader);

        }

        public void setListener(final int position) {

            textView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Images images = imagesArrayList.get(position);

                    Toast.makeText(context,
                            "Movie Name " + images.getMovieName(),
                            Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
}
