package com.example.airbnb;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private final int MainActivityRequestCode = 100;
    private EditText t;
    private EditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button6);
        t = findViewById(R.id.tbPhone);
        t2 = findViewById(R.id.et_Prefix);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Ati intrat in meniul de inregistrare", Toast.LENGTH_LONG).show();

                Intent intent =new Intent(MainActivity.this,MainActivity3.class);
                startActivityForResult(intent, MainActivityRequestCode);
            }
        });

        Log.v("Lifecycle","onCreate");
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==MainActivityRequestCode){
            if(resultCode==RESULT_OK) {
                if(data!=null){
                    Bundle bundle = data.getBundleExtra("personabundle");
                    Persoana persoana = bundle.getParcelable("OK");
                    t.setText(persoana.getTelefon());
                    t2.setText("Romania (+04) ???");
                }
            }
        }
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