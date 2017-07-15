package com.hackathon.codegenerators2.hackathonandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
/**
 * Created by Dusan on 7/15/2017.
 */

public class RegisterActivity extends BaseActivity {

    private EditText userText=null;
    private EditText passwordText=null;
    private RegisterActivity thisActivity=this;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);

        sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);


        final Button registerButton=(Button) findViewById(R.id.buttonRegister);

        registerButton.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                String userName=userText.getText().toString();
                String password=passwordText.getText().toString();

                if(!userName.isEmpty() && !password.isEmpty()) {


                    SharedPreferences.Editor edi = sharedPreferences.edit();

                    edi.putString("username", userName);
                    edi.apply();

                    edi.putString("password", password);
                    edi.apply();

                    RequestQueue queue=Volley.newRequestQueue(thisActivity);

                    Intent intent=new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);

                }
            }
        });













    }








}
