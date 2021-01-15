package com.example.aplikasimengenalbuah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Alpukat extends AppCompatActivity {

    EditText editTextAlpukat;
    Button bt_proses;
    TextView hasil;
    String benar = "alpukat";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpukat);

        editTextAlpukat = (EditText)findViewById(R.id.edt_buah_alpukat);
        bt_proses = (Button)findViewById(R.id.bt_proses_alpukat);
        hasil = (TextView)findViewById(R.id.hasil_alpukat);

        bt_proses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextAlpukat.length()==0){
                    Toast.makeText(getApplicationContext(), "Masukkan Pilihan Terlebih Dahulu", Toast.LENGTH_SHORT).show();

                }
                else {
                    String jawaban = editTextAlpukat.getText().toString();
                    if (jawaban.equals(benar)){
                        String keterangan = "Anda Benar";
                        hasil.setText(keterangan);
                    }
                    else {
                        String keterangan = "Anda Salah";
                        hasil.setText(keterangan);
                    }
                }
            }
        });
    }
}