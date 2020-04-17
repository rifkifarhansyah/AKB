package com.apps.rifki.latihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.apps.rifki.latihan2.Daftar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
   dibuat oleh 10117193 Rifki Farhansyah_IF5
    Kamis,16 April 2020
 */

public class Login extends AppCompatActivity {
    @BindView(R.id.txtRegister)
    TextView txtRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        txtRegister.setText(Html.fromHtml(getString(R.string.txtdaftar)));
    }

        @OnClick(R.id.txtRegister)
    void start() {
        Intent intent = new Intent(this, Daftar.class);
        startActivity(intent);
    }
}
