package edu.temple.gridviewcol;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    //int colors[];
    Context context;
    String[] gridLabels;
    public CustomAdapter(Context context,  String[] gridLabels){
        this.context = context;
        this.gridLabels = gridLabels;
        //this.colors = colors;
       /* colors = new int[18];
        colors[0] = Color.BLACK;
        colors[1] = Color.BLUE;
        colors[2] = Color.GREEN;
        colors[3] = Color.YELLOW;
        colors[4] = Color.CYAN;
        colors[5] = Color.GRAY;
        colors[6] = context.getResources().getColor(R.color.OLIVE, null);
        colors[7] = Color.MAGENTA;
        colors[8] = context.getResources().getColor(R.color.PURPLE, null);
        colors[9] = Color.RED;
        colors[10] = Color.WHITE;
        colors[11] = context.getResources().getColor(R.color.ORANGE, null);
        colors[12] = context.getResources().getColor(R.color.CHOCOLATE, null);
        colors[13] = context.getResources().getColor(R.color.DPINK, null);
        colors[14] = context.getResources().getColor(R.color.CBLUE, null);
        colors[15] = Color.LTGRAY;
        colors[16] = context.getResources().getColor(R.color.RSYBROWN, null);
        colors[17] = Color.DKGRAY;*/
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
        textView.setBackgroundColor(Color.parseColor(gridLabels[position % getCount()]));
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

/*myLayout.setBackgroudColor(Color.parseColor(chosenColor))//
// Color.parseColor(String) will only work for very simply colors// see */
