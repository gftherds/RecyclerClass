package com.example.therdsak.recycelerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerClass extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ExamAdapter mExamAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_class);




        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        ArrayList<String> myArrList = new ArrayList<>();
        myArrList.add("Therdsak");
        myArrList.add("Suraphong");
        myArrList.add("Kitsada");
    }
}
