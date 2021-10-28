package com.example.a1918122_tugas4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MahasiswaAdapter adapter;
    private ArrayList<Mahasiswa> mahasiswaArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =
                (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MahasiswaAdapter(mahasiswaArrayList);
        RecyclerView.LayoutManager layoutManager = new
                LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Fery", "1918120",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Ramadhan", "1918121",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Fadel", "1918122",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Arsyad", "1918123",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Rizki", "1918124",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Arya", "1918125",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Dhiya'", "1918126",
                "2019"));
        mahasiswaArrayList.add(new Mahasiswa("Sovian", "1918127",
                "2019"));
    }
}