package com.example.basicprogramming.imageloaderappdemo.app;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.basicprogramming.imageloaderappdemo.R;
import com.example.basicprogramming.imageloaderappdemo.adapter.ImageAdapter;
import com.example.basicprogramming.imageloaderappdemo.model.DataModel;
import com.example.basicprogramming.imageloaderappdemo.model.Images;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Images> imagesArrayList;
    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private ImageAdapter imageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        recyclerView = findViewById(R.id.my_image_loader_recycler_view);
        gridLayoutManager = new GridLayoutManager(this, 2
                , GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        setImages();
    }

    private void setImages() {

        imagesArrayList = DataModel.setDataList();
        imageAdapter = new ImageAdapter(MainActivity.this, imagesArrayList);
        recyclerView.setAdapter(imageAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
