package com.example.latihan1pplg2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class Kalkulator extends AppCompatActivity {

    EditText idangka1;
    EditText idangka2;
    Spinner spinnerpilih;
    TextView txthasil;
    Button btnhitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        idangka1 = findViewById(R.id.et_angka1);
        idangka2 = findViewById(R.id.et_angka2);
        btnhitung = findViewById(R.id.btnhasil);
        spinnerpilih = findViewById(R.id.spinnerpilih);
        txthasil = findViewById(R.id.txtHasil);
        txthasil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                idangka1 = findViewById(R.id.et_angka1);
                idangka2 = findViewById(R.id.et_angka2);
                String text = spinnerpilih.getSelectedItem().toString();
                int angka1 = Integer.parseInt(idangka1.getText().toString());
                int angka2 = Integer.parseInt(idangka2.getText().toString());
                switch (text) {
                    case "tambah":
                        int hasilTambah = angka1 + angka2;
                        txthasil.setText(String.valueOf(hasilTambah));
                        break;
                    case "kurang":
                        if (angka1 >= angka2) {
                            int hasilKurang = angka1 - angka2;
                            txthasil.setText(String.valueOf(hasilKurang));
                        } else {
                            Toast.makeText(Kalkulator.this, "Angka pertama harus lebih besar dari angka kedua", Toast.LENGTH_SHORT).show();
                        }
                        break;
                    case "kali":
                        int hasilKali = angka1 * angka2;
                        txthasil.setText(String.valueOf(hasilKali));
                        break;
                    case "bagi":
                        double doubleangka1 = Double.parseDouble(idangka1.getText().toString());
                        double doubleangka2 = Double.parseDouble(idangka2.getText().toString());
                        double doublehasil = doubleangka1/doubleangka2;
                        txthasil.setText(doublehasil+"");

                        break;
                }
            }
        });
    }
}
