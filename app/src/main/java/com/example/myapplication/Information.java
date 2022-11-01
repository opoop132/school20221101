package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Information extends AppCompatActivity {
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        back=findViewById(R.id.back);
        TextView name = findViewById(R.id.in_name);
        TextView gender = findViewById(R.id.in_gender);
        TextView hobby = findViewById(R.id.in_hobby);
        ImageView image = findViewById(R.id.in_photo);

        Intent reit = getIntent();
        String str_name = reit.getStringExtra("it_name");
        String str_gender = reit.getStringExtra("it_gender");
        String str_hobby1 = reit.getStringExtra("it_hobby1");
        String str_hobby2 = reit.getStringExtra("it_hobby2");
        String str_hobby3 = reit.getStringExtra("it_hobby3");
        String str_photoUri = reit.getStringExtra("it_photoUri");

        String str_hobby="";
        if(!str_hobby1.equals("")){
            str_hobby=str_hobby+str_hobby1+"\n";
        }
        if(!str_hobby2.equals("")){
            str_hobby=str_hobby+str_hobby2+"\n";
        }
        if(!str_hobby3.equals("")){
            str_hobby=str_hobby+str_hobby3+"\n";
        }

        name.setText(str_name);
        gender.setText(str_gender);
        hobby.setText(str_hobby);
        Uri photoUri = Uri.parse(str_photoUri);
        image.setImageURI(photoUri);

    }
    public void btnBack(View v){
        finish();
    }

}
