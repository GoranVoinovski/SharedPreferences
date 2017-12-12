package com.example.goran.sharedpreferences;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.slika)ImageView pic;
    @BindView(R.id.fname)TextView ime;
    @BindView(R.id.lname)TextView prezime;
    @BindView(R.id.age)TextView godini;
    @BindView(R.id.showfname)TextView pokaziime;
    @BindView(R.id.showlname)TextView pokaziprezime;
    @BindView(R.id.showage)TextView pokazigodini;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        Picasso.with(this).load(R.drawable.husky).centerInside().fit().into(pic);



    }


    @OnClick(R.id.load)
    public void Save(){
        pokaziime.setText(PreferencesManager.getFirstName(this));


    }
}
