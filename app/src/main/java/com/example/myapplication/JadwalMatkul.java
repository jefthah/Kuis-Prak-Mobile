package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class JadwalMatkul extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Jadwal Mata Kuliah Semester 6");
        }

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_matkul);

        // Mendapatkan referensi ke TextView untuk setiap hari
        TextView textViewSenin = findViewById(R.id.text_senin);
        TextView textViewSelasa = findViewById(R.id.text_selasa);
        TextView textViewRabu = findViewById(R.id.text_rabu);
        TextView textViewKamis = findViewById(R.id.text_kamis);
        TextView textViewJumat = findViewById(R.id.text_jumat);

        // Mendapatkan data jadwal mata kuliah dari class sebelumnya (misalnya JadwalMataKuliah)
        // Di sini saya mengasumsikan ada array untuk setiap hari
        String[] jadwalSenin = JadwalMataKuliah.getJadwalSenin();
        String[] jadwalSelasa = JadwalMataKuliah.getJadwalSelasa();
        String[] jadwalRabu = JadwalMataKuliah.getJadwalRabu();
        String[] jadwalKamis = JadwalMataKuliah.getJadwalKamis();
        String[] jadwalJumat = JadwalMataKuliah.getJadwalJumat();

        // Menampilkan jadwal mata kuliah ke dalam TextView
        textViewSenin.setText("Senin:\n\n" + convertArrayToString(jadwalSenin));
        textViewSelasa.setText("Selasa:\n\n" + convertArrayToString(jadwalSelasa));
        textViewRabu.setText("Rabu:\n\n" + convertArrayToString(jadwalRabu));
        textViewKamis.setText("Kamis:\n\n" + convertArrayToString(jadwalKamis));
        textViewJumat.setText("Jumat:\n\n" + convertArrayToString(jadwalJumat));
    }

    // Method untuk mengubah array menjadi string
    private String convertArrayToString(String[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String item : array) {
            stringBuilder.append(item).append(" ");
        }
        return stringBuilder.toString();
    }
}
