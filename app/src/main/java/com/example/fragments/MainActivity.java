package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v){
        Fragment fragment = null;
        Fragment fragment1 = null;

        switch (v.getId()){
            case R.id.fr1:
                fragment = new FragmentOne();
                break;

            case R.id.fr2:
                fragment = new FragmentTwo();
                break;

            case R.id.fr3:
                fragment = new FragmentThree();
                break;

            case R.id.but1Fr3:
                fragment1 = new Sport2();
                break;

        }

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frMain, fragment);
        ft.commit();
        


    }


}