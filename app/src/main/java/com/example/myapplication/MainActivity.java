package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Supraja's Family");
        }

        // Mengakses tombol dari layout
        Button btnJadwalMatkul = findViewById(R.id.btn_jadwal_matkul);

        // Menambahkan fungsi onClickListener untuk tombol
        btnJadwalMatkul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Memulai JadwalMatkulActivity saat tombol diklik
                Intent intent = new Intent(MainActivity.this, JadwalMatkul.class);
                startActivity(intent);
            }
        });
    }
}