package com.example.goran.sharedpreferences;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.slika)ImageView pic;
    @BindView(R.id.fname)EditText ime;
    @BindView(R.id.lname)EditText prezime;
    @BindView(R.id.age)EditText godini;
    @BindView(R.id.rg)RadioGroup radiogrupa;
    @BindView(R.id.male)RadioButton m;
    @BindView(R.id.female)RadioButton f;
    boolean pol = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        Picasso.with(this).load(R.drawable.husky).centerInside().fit().into(pic);



    }


    @OnClick (R.id.savebtn)
    public void Save(){
        PreferencesManager.setFirstName(this, ime.getText().toString());
        PreferencesManager.setLastName(this, prezime.getText().toString());
        PreferencesManager.setAge(this, godini.getText().toString());
        PreferencesManager.setPol(this,m.isChecked());
        Toast.makeText(this,"Done",Toast.LENGTH_LONG).show();
    }



    @OnClick (R.id.cntbtn)
    public void Continue(){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }
}
