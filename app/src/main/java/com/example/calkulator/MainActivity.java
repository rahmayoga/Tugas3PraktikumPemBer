package com.example.calkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button tombol1,tombol2,tombol3,tombol4,tombol5,tombol6,tombol7,tombol8,tombol9,tombol0,tombolKoma,tombolPlus,tombolMinus,tombolKali,tombolBagi,tombolClear,tombolSamadengan;
    Boolean doTambah,doKurang,doKali,doBagi;
    EditText teksTampil;
    Float nilaiSatu,nilaiDua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol0 = (Button) findViewById(R.id.tombol0);
        tombol1 = (Button) findViewById(R.id.tombol1);
        tombol2 = (Button) findViewById(R.id.tombol2);
        tombol3 = (Button) findViewById(R.id.tombol3);
        tombol4 = (Button) findViewById(R.id.tombol4);
        tombol5 = (Button) findViewById(R.id.tombol5);
        tombol6 = (Button) findViewById(R.id.tombol6);
        tombol7 = (Button) findViewById(R.id.tombol7);
        tombol8 = (Button) findViewById(R.id.tombol8);
        tombol9 = (Button) findViewById(R.id.tombol9);
        tombolKoma = (Button) findViewById(R.id.tombolKoma);
        tombolPlus = (Button) findViewById(R.id.tombolPlus);
        tombolMinus = (Button) findViewById(R.id.tombolMinus);
        tombolKali = (Button) findViewById(R.id.tombolKali);
        tombolBagi = (Button) findViewById(R.id.tombolBagi);
        tombolClear = (Button) findViewById(R.id.tombolClear);
        tombolSamadengan = (Button) findViewById(R.id.tombolHasil);
        teksTampil = (EditText) findViewById(R.id.hasil);

        tombol0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"0");
            }
        });

        tombol1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"1");
            }
        });

        tombol2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"2");
            }
        });

        tombol3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"3");
            }
        });

        tombol4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"4");
            }
        });

        tombol5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"5");
            }
        });

        tombol6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"6");
            }
        });

        tombol7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"7");
            }
        });

        tombol8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"8");
            }
        });

        tombol9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+"9");
            }
        });

        tombolKoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teksTampil.setText(teksTampil.getText()+".");
            }
        });

        tombolClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu=null;
                nilaiDua=null;
                teksTampil.setText(null);
            }
        });

        tombolPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu = Float.parseFloat(teksTampil.getText().toString()+"");
                doTambah=true;
                teksTampil.setText(null);
            }
        });

        tombolMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu = Float.parseFloat(teksTampil.getText().toString()+"");
                doKurang=true;
                teksTampil.setText(null);
            }
        });

        tombolKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu = Float.parseFloat(teksTampil.getText().toString()+"");
                doKali=true;
                teksTampil.setText(null);
            }
        });

        tombolBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiSatu = Float.parseFloat(teksTampil.getText().toString()+"");
                doBagi=true;
                teksTampil.setText(null);
            }
        });

        tombolSamadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilaiDua = Float.parseFloat(teksTampil.getText().toString()+"");

                if (doTambah==true){
                    teksTampil.setText(nilaiSatu+nilaiDua+"");
                    doTambah=false;
                }
                else if (doKurang==true){
                    teksTampil.setText(nilaiSatu-nilaiDua+"");
                    doKurang=false;
                }
                else if (doKali==true){
                    teksTampil.setText(nilaiSatu*nilaiDua+"");
                    doKali=false;
                }
                else if (doBagi==true){
                    teksTampil.setText(nilaiSatu/nilaiDua+"");
                    doBagi=false;
                }
            }
        });

    }
}
