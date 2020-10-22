package edu.temple.gridviewcol;

import androidx.appcompat.app.AppCompatActivity;


import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements PaletteFragment.ColorSelectable {
    String[] gridLabels;
    CanvasFragment canvasFragment;
    String[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources res = getResources();
        gridLabels = res.getStringArray(R.array.color_array);
        colors = res.getStringArray(R.array.color);
        canvasFragment = new CanvasFragment();
        //Bundle bundle = new Bundle();
        //bundle
        if(!(getSupportFragmentManager().findFragmentById(R.id.container_1) instanceof PaletteFragment)) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container_1, PaletteFragment.newInstance(getResources().getStringArray(R.array.color_array)))
                    .add(R.id.container_2, canvasFragment)
                    .addToBackStack(null)
                    .commit();
        }
    }
    @Override
    public void selectColor(String index){
        canvasFragment.show((gridLabels[Integer.parseInt(index)]));
        canvasFragment.showBg(Color.parseColor((colors[Integer.parseInt(index)])));
    }
}