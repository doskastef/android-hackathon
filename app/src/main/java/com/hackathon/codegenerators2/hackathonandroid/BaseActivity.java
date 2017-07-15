package com.hackathon.codegenerators2.hackathonandroid;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Dusan on 7/15/2017.
 */

public class BaseActivity extends AppCompatActivity{

    protected SharedPreferences sharedPreferences=null;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

}

