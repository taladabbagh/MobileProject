package com.example.mobileproject;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class CartActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ArrayList<String> cartList = new ArrayList<>();

    private TextView bagItemListTextView;
    private Button checkoutBtn;
    private Button removeBtn;

    private Spinner spinner;
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

        spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.locations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemClickListener(this);

        cartList = new ArrayList<>();
        bagItemListTextView = findViewById(R.id.bagtv);
        checkoutBtn = findViewById(R.id.checkoutbtn);
   //     removeBtn = findViewById(R.id.removeFromCartImg);

        File img= null;
        Watch watch = new Watch(12, "casio",15.00, "casio", "2021","M",img);

        checkoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

          String watch= cartList.toString();

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

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String choice = parent.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(),choice, Toast.LENGTH_SHORT).show();
    }
}
