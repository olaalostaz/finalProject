package com.example.finalprojectola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class newActivitytwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_activitytwo);


        ImageButton imageButton=findViewById(R.id.imageButton);
        EditText  Name=findViewById(R.id.Name);
        EditText Phone=findViewById(R.id.Phone);
        EditText EmailAddress=findViewById(R.id.EmailAddress);
        EditText PostalAddress=findViewById(R.id.PostalAddress);
        Button Save=findViewById(R.id.Save);
        Button Back=findViewById(R.id.Back);











    }
}