package com.example.therdsak.recycelerclass;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Therdsak on 8/18/2016.
 */
public class ExamHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    private TextView textView;


     String _string;
     int _position;

    public ExamHolder(View itemView) {
        super(itemView);

        textView = (TextView) itemView.findViewById(R.id.);
        textView.setOnClickListener(this);
    }





    @Override
    public void onClick(View view) {


    }

    public void bind(String str,int position){



    }
}
