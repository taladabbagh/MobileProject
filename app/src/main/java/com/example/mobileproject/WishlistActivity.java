package com.example.mobileproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class WishlistActivity extends AppCompatActivity {

    private ArrayList<String> wishlistList = new ArrayList<>();

    private TextView bagItemListTextView;
    private Button checkoutBtn;
    private Button removeBtn;

    private double totalCost = 0.0;

    RecyclerView mrecyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass> watchList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        initData();
        initRecyclerView();

        wishlistList = new ArrayList<>();
        bagItemListTextView = findViewById(R.id.bagtv);
        checkoutBtn = findViewById(R.id.checkoutbtn);
        //     removeBtn = findViewById(R.id.removeFromCartImg);

        File img= null;
        Watch watch = new Watch(12, "casio",15.00, "casio", "2021","M",img);

        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String watch= wishlistList.toString();

            }
        });
    }

    private void initRecyclerView() {

        mrecyclerView=findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        mrecyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(watchList);
        mrecyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

    private void initData() {

        watchList = new ArrayList<>();

        watchList.add(new ModelClass(R.drawable.casio,"casio go","500$","1",R.drawable.trash));

        watchList.add(new ModelClass(R.drawable.casio,"casio what","100$","1",R.drawable.trash));

        watchList.add(new ModelClass(R.drawable.casio,"casio sho","120$","1",R.drawable.trash));

    }
}
