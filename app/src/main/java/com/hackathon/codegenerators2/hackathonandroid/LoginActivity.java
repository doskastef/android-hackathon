package com.hackathon.codegenerators2.hackathonandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Dusan on 7/15/2017.
 */

public class LoginActivity extends BaseActivity {

    private SharedPreferences sharedPreferences=null;
    private EditText userText=null;
    private EditText passwordText=null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        userText=(EditText) findViewById(R.id.txtusername);
        passwordText=(EditText) findViewById(R.id.txtpassword);
        
        

        sharedPreferences=getSharedPreferences("login",MODE_PRIVATE);


        final Button loginButton=(Button) findViewById(R.id.buttonlogin);
        
        loginButton.setOnClickListener(new View.OnClickListener(){


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
                }
            }
        });

                                         
        
        

        
        





    }
}
