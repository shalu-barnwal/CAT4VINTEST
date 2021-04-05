package com.example.lab8app;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class secondActivity extends AppCompatActivity {

    private FrameLayout fragcont;
    private Button b1,b2,b3,b4,select;
    public static String PACKAGE_NAME;
    String c = "C";
    String js = "JavaScript";
    String java = "JAVA";
    String python = "Pyton";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        b1 = (Button) findViewById(R.id.ml);
        b2 = (Button) findViewById(R.id.ai);
        b3 = (Button) findViewById(R.id.cloud);
        b4 = (Button) findViewById(R.id.big);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = "ml";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(id , "drawable",PACKAGE_NAME) ;
                openfragment(resID,ml,d_ml);
                Toast.makeText(MainActivity.this, "Machine Learning",Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = "ai";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(id , "drawable",PACKAGE_NAME) ;
                openfragment(resID,ai,d_ai);
                Toast.makeText(MainActivity.this, "Artificial Intelligence",Toast.LENGTH_SHORT).show();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = "cloud";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(id , "drawable",PACKAGE_NAME) ;
                openfragment(resID,cloud,d_cloud);
                Toast.makeText(MainActivity.this, "Cloud Computing",Toast.LENGTH_SHORT).show();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = "python";
                PACKAGE_NAME = getApplicationContext().getPackageName();
                int resID = getResources().getIdentifier(id , "drawable",PACKAGE_NAME) ;
                openfragment(resID,big_data,d_big_data);
                Toast.makeText(MainActivity.this, " Big Data",Toast.LENGTH_SHORT).show();
            }
        });
        select.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Selected",Toast.LENGTH_SHORT).show();
            }
        });
    }



    private void openfragment(int resID,String txt,String date) {
        ImageFragment fragment = ImageFragment.newInstance(resID,txt,date);
        FragmentManager  fragmentmanager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentmanager.beginTransaction();
        transaction.addToBackStack(null);
        transaction.add(R.id.fragment_container,fragment,"Image_Fragment").commit();

    }
}