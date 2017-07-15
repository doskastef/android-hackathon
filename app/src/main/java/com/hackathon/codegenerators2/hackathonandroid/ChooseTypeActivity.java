package com.hackathon.codegenerators2.hackathonandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by Dusan on 7/15/2017.
 */

public class ChooseTypeActivity extends BaseActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_choose_type);
    }

    private void addJob(){

        Intent intent=new Intent(ChooseTypeActivity.this,LoginActivity.class);
        intent.putExtra("type","addJob");
        startActivity(intent);
        finish();

    }
    private void findJob(){

        Intent intent=new Intent(ChooseTypeActivity.this, LoginActivity.class);
        intent.putExtra("type","findJob");
        startActivity(intent);
        finish();
    }



}
