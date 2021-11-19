package com.example.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.net.DatagramSocket;


public class FragmentThree extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_three, null);
        Button button = (Button) v.findViewById(R.id.but1Fr3);
        Button button2 = (Button) v.findViewById(R.id.but2Fr3);
        Button button3 = (Button) v.findViewById(R.id.but3Fr3);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Fragment fragment = null;
                fragment = new Sport1();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frSport, fragment);
                ft.commit();
            }
    });
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Fragment fragment = null;
                fragment = new Sport2();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frSport, fragment);
                ft.commit();
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Fragment fragment = null;
                fragment = new Sport3();
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frSport, fragment);
                ft.commit();
            }
        });

        return v;

    }
}





