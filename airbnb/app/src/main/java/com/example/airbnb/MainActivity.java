package com.example.airbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button6);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ati intrat in meniul de inregistrare", Toast.LENGTH_LONG).show();

                Intent intent =new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });

        Log.v("Lifecycle","onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.v("Lifecycle","onStart");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.v("Lifecycle","onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("Lifecycle","onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("Lifecycle","onStop");

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("Lifecycle","onDestroy");
    }
}