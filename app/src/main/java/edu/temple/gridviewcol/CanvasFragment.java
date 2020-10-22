package edu.temple.gridviewcol;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class CanvasFragment extends Fragment {
    View frame;
    TextView textView;
    View bgCol;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CanvasFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CanvasFragment newInstance(String param1, String param2) {
        CanvasFragment fragment = new CanvasFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        frame = inflater.inflate(R.layout.fragment_canvas, container, false);
        textView = frame.findViewById(R.id.textView);
        bgCol = frame.findViewById(R.id.bgCol);
        return frame;
    }
    public void show(String value){
      //  char[] ch = value.toCharArray();
        textView.setText(value);
        textView.setTextSize(20);
        textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        textView.setPadding(10,10,10,10);
        if(textView.getText().equals("BLACK")||textView.getText().equals("NOIR")){
            textView.setTextColor(Color.WHITE);
        }
        if(textView.getText().equals("WHITE")||textView.getText().equals("BLANC")){
            textView.setTextColor(Color.BLACK);
        }
        //bgCol.setBackgroundColor(Integer.parseInt(value));
    }
    public void showBg(int value){
        bgCol.setBackgroundColor(value);
       // textView.setText(value);
    }
}