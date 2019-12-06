package com.example.myappmain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Tabhost1 extends Fragment implements OnMapReadyCallback {
    private GoogleMap mMap;
//    FragmentManager fm;
    public Tabhost1() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);
    }

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_tabhost1,container,false);

    // 프래그먼트 안에서 프래그먼트를 가져오는 코드
    SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
    // 맵이 사용할 준비가 되면 onMapReady 함수를 자동으로 호출된다
    mapFragment.getMapAsync(this);



          Spinner spinner1 = (Spinner)myView.findViewById(R.id.spinner1);
          Spinner spinner2 = (Spinner)myView.findViewById(R.id.spinner2);
          Spinner spinner3 = (Spinner)myView.findViewById(R.id.spinner3);
          Button btnResult = (Button)myView.findViewById(R.id.btnResult);


          btnResult.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent mIntent = new Intent(getContext(), SearchActivity.class);
                  startActivity(mIntent);

              }
          });



        return myView;
    }
//
//    private FragmentManager getSupportFragmentManager() {
//        return  fm;
//    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}
