package com.example.airbnb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    Persoana persoana;
    Button button;
    EditText nume, prenume, email, telefon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        persoana = new Persoana();
        button = findViewById(R.id.btnRegister);
        nume = findViewById(R.id.et_Name);
        prenume = findViewById(R.id.et_Prenume);
        email = findViewById(R.id.et_email);
        telefon = findViewById(R.id.et_phone);
        button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    if (isValid()){
                        persoana.setNume(nume.getText().toString());
                        persoana.setPrenume((prenume.getText().toString()));
                        persoana.setEmail(email.getText().toString());
                        persoana.setTelefon(telefon.getText().toString());
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("OK",persoana);
                        Intent intent = new Intent();
                        intent.putExtra("personabundle", bundle);
                        setResult(RESULT_OK, intent);
                        finish();
                    }
                }
        });
    }

    private Boolean isValid(){
        if(nume.getText().toString().isEmpty()){
            Toast.makeText(MainActivity3.this,"Campul nume nu este completat", Toast.LENGTH_LONG).show();
            return false;
        }

        if(prenume.getText().toString().isEmpty()){
            Toast.makeText(MainActivity3.this,"Campul prenume nu este completat", Toast.LENGTH_LONG).show();
            return false;
        }

        if(email.getText().toString().isEmpty()){
            Toast.makeText(MainActivity3.this,"Campul email nu este completat", Toast.LENGTH_LONG).show();
            return false;
        }

        if(telefon.getText().toString().isEmpty()){
            Toast.makeText(MainActivity3.this,"Campul telefon nu este completat", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }
}