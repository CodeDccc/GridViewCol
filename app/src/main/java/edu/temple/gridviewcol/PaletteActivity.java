package edu.temple.gridviewcol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class PaletteActivity extends AppCompatActivity {

    ArrayList<String> col;
    View bgCol;
    GridView gridView;
    View textView;
    int coll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Intent newIntent = new Intent(this, CanvasActivity.class);

        textView = findViewById(R.id.textView);
        gridView = findViewById(R.id.gridView);
        bgCol = findViewById(R.id.bgCol);
        col = new ArrayList<>();
        fillArrayList ();
        final BaseAdapter adapter = new CustomAdapter(this, col);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (parent.getItemAtPosition(position).toString().equals("BLACK")) {
                    coll = Color.BLACK;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("GREEN")) {
                    coll = Color.GREEN;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("GRAY")) {
                    coll = Color.GRAY;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("DARK GRAY")) {
                    coll = Color.DKGRAY;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("CYAN")) {
                    coll = Color.CYAN;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("RED")) {
                    coll = Color.RED;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("MAGENTA")) {
                    coll = Color.MAGENTA;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("LIGHT GRAY")) {
                    coll = Color.LTGRAY;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("BLUE")) {
                    coll = Color.BLUE;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                } else if (parent.getItemAtPosition(position).toString().equals("YELLOW")) {
                    coll = Color.YELLOW;
                    newIntent.putExtra("color", coll);
                    newIntent.putExtra("text", col.get(position));
                    startActivity(newIntent);
                }
            }
        });
    }

    private void fillArrayList() {
        col.add("BLACK");
        col.add("BLUE");
        col.add("GREEN");
        col.add("DARK GRAY");
        col.add("YELLOW");
        col.add("CYAN");
        col.add("GRAY");
        col.add("MAGENTA");
        col.add("LIGHT GRAY");
        col.add("RED");
    }
}