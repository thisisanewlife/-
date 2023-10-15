package com.example.mywork;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class  Fragment1 extends Fragment {

    RecyclerView recyclerView;

    List list;
    Myadapter myadapter;
    Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab1, container, false);
        context = view.getContext();

        recyclerView = view.findViewById(R.id.recyclerView);
        list = new ArrayList();
        for (int i = 0; i < 8; i++) {
            list.add("这是第" + i + "行");

            myadapter = new Myadapter(context, list);
            recyclerView.setAdapter(myadapter);
            LinearLayoutManager manager = new LinearLayoutManager(context);
            manager.setOrientation(RecyclerView.VERTICAL);
            recyclerView.setLayoutManager(manager);//上下左右


        }
        return view;
    }//压缩
}