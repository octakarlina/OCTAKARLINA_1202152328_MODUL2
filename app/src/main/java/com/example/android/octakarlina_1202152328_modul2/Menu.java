package com.example.android.octakarlina_1202152328_modul2;

/**
 * Created by Octa Karlina on 18/02/2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;


public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById (R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Ramen Go go");
            foods.add("Ramen Goyeng");
            foods.add("Ramen Maknyus");
            foods.add("Ramen Mantap");
            foods.add("Ramen Sedap");
            foods.add("Ramen Traditional");
            foods.add("Ramen Wowyes");
            foods.add("Ramen Yesgood");
            foods.add("Ramen Yuhuuu");
            foods.add("Ramen Yumyum");

            // mamanggil harga
            priceses.add(21000);
            priceses.add(23000);
            priceses.add(20000);
            priceses.add(25000);
            priceses.add(25000);
            priceses.add(22000);
            priceses.add(20000);
            priceses.add(18000);
            priceses.add(19000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.gogo);
            photos.add(R.drawable.goyeng);
            photos.add(R.drawable.maknyus);
            photos.add(R.drawable.mantap);
            photos.add(R.drawable.sedap);
            photos.add(R.drawable.traditional);
            photos.add(R.drawable.wowyes);
            photos.add(R.drawable.yesgood);
            photos.add(R.drawable.yuhuuu);
            photos.add(R.drawable.yumyum);
        }
    }
}

