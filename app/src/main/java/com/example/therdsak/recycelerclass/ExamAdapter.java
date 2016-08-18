package com.example.therdsak.recycelerclass;

import android.content.pm.ResolveInfo;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Therdsak on 8/18/2016.
 */
public class ExamAdapter extends RecyclerView.Adapter<ExamHolder> {
   private List<String> items;



    public ExamAdapter(List<String> item){


    }
    @Override
    public ExamHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return null;
    }

    @Override
    public void onBindViewHolder(ExamHolder holder, int position) {
        String recyclerClass = items.get(position);
        holder.bind(recyclerClass , position);


    }

    @Override
    public int getItemCount() {
      return   items.size();
    }
}
