package com.example.imageness;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mensaje(View view) {
        Toast.makeText(this, "Medusa avispa de mar ", Toast.LENGTH_SHORT).show();
    }
    public void Mensaje1(View view){
        Toast.makeText(this, "Mamba negra ", Toast.LENGTH_SHORT).show();
    }
    public void Mensaje2(View view){
        Toast.makeText(this, "Viuda negra ", Toast.LENGTH_SHORT).show();
    }
    public void Mensaje3(View view){
        Toast.makeText(this, "Pulpo de anillos azules  ", Toast.LENGTH_SHORT).show();
    }
}
