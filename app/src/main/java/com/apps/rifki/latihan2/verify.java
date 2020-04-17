package com.apps.rifki.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.apps.rifki.latihan2.Daftar;

import butterknife.ButterKnife;
import butterknife.OnClick;

/*
   dibuat oleh 10117193 Rifki Farhansyah_IF5
    Kamis,16 April 2020
 */

public class verify extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_verify)
    void verify(){
        Intent intent = new Intent(this, verify_account.class);
        startActivity(intent);
    }
}
