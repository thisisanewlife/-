package com.example.mywork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

//泛型 类。类
public class Myadapter extends RecyclerView.Adapter <Myadapter.myholder>{
   Context context1;
   List <String>list1;
    public Myadapter(Context context, List list) {
        context1=context;
        list1=list;

    }

    @NonNull
    @Override
    public myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

       View view =
       LayoutInflater.from(context1).inflate(R.layout.item,parent,false) ;
       //Inflater inflater=new inflater();
       //inflater.inflate()不是要这个压缩
        myholder myholder=new myholder(view);

        return myholder;
    }

    @Override
    public void onBindViewHolder(@NonNull myholder holder, int position) {
     holder.textView.setText(list1.get(position));
    }

    @NonNull

    //指向行的指针



    //item 一行，多长
    public int getItemCount() {
        return list1.size();
    }


    public class myholder extends  RecyclerView.ViewHolder{//类的嵌套，会调用子类对象
        TextView textView;
        public myholder(@NonNull View itemView) {

            super(itemView);
             textView = itemView.findViewById(R.id.item);
        }
    }
}


