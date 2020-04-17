package com.apps.rifki.latihan2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
   dibuat oleh 10117193 Rifki Farhansyah_IF5
    Kamis,16 April 2020
 */

public class Daftar extends AppCompatActivity {
    @BindView(R.id.toolbar_register)
    Toolbar toolbar_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar_register);
        toolbar_register.setLogoDescription(getResources().getString(R.string.edt_daftar));

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @OnClick(R.id.btn_register)
    void register() {
        Intent intent = new Intent(this, verify.class);
        startActivity(intent);
    }
}