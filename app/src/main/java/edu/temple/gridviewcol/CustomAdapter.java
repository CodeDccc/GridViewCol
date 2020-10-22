package edu.temple.gridviewcol;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] colors;
    String[] gridLabels;
    public CustomAdapter(Context context,  String[] gridLabels){
        this.context = context;
        this.gridLabels = gridLabels;
        colors = context.getResources().getStringArray(R.array.color);
    }
    @Override
    public int getCount() {
        return gridLabels.length;
    }

    @Override
    public Object getItem(int position) {
        return gridLabels[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        TextView textView = new TextView(context);
        textView.setText(getItem(position).toString());
        textView.setBackgroundColor(Color.parseColor((colors[position % colors.length])));
        textView.setTextSize(20);
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView.setPadding(10,10,10,10);
        if(textView.getText().equals("BLACK")||textView.getText().equals("NOIR")){
            textView.setTextColor(Color.WHITE);
        }
        if(textView.getText().equals("MAGENTA")){
            textView.setPadding(0,10,0,10);
        }
        return textView;
    }

    @Override
    public View getDropDownView(int position, View convertView, ViewGroup parent){
        return null;
    }
}

