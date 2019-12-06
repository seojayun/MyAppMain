package com.example.myappmain;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.makeramen.roundedimageview.RoundedImageView;


public class Tabhost2 extends Fragment {



    public Tabhost2() {

    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View myView2 = inflater.inflate(R.layout.fragment_tabhost2,container,false);

       ImageButton ibTop = (ImageButton)myView2.findViewById(R.id.ibTop);
       ImageButton iButtom = (ImageButton)myView2.findViewById(R.id.iButtom);




        return myView2;
    }
}
