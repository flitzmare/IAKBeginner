package com.iak.riksasuviana.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    public int scoreA = 0;
    public int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

//        Intent i = getIntent();
//
//        Bundle bundle = i.getExtras();
//
//        String nama = bundle.getString("nama");
//        String password = bundle.getString("password");

//        Toast.makeText(this,
//                "Username : "+nama+", Password : "+password,
//                Toast.LENGTH_SHORT).show();
    }

    public void scoreToView(){
        TextView tvscoreA = (TextView) findViewById(R.id.scoreTeamA);
        TextView tvscoreB = (TextView) findViewById(R.id.scoreTeamB);
        tvscoreA.setText(scoreA+"");
        tvscoreB.setText(scoreB+"");
    }

    public void addScoreTeamA1(View view){
        scoreA += 1;
        scoreToView();
    }

    public void addScoreTeamA2(View view){
        scoreA += 2;
        scoreToView();
    }

    public void addScoreTeamA3(View view){
        scoreA += 3;
        scoreToView();
    }
}
