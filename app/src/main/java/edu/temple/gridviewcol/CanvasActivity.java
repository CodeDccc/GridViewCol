package edu.temple.gridviewcol;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CanvasActivity extends AppCompatActivity {
    TextView textView;
    View bgCol;
    int coll;
    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        textView = findViewById(R.id.textView);
        bgCol = findViewById(R.id.bgCol);

        string = getIntent().getExtras().getString("text");
        textView.setText(string);
        textView.setTextSize(30);
        coll = getIntent().getExtras().getInt("color");
        bgCol.setBackgroundColor(coll);
        if(coll== Color.BLACK){
            textView.setTextColor(Color.WHITE);
        }
    }
}