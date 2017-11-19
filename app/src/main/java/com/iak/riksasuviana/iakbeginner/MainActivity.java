package com.iak.riksasuviana.iakbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText)findViewById(R.id.editTextUsername);
        final EditText password = (EditText)findViewById(R.id.editTextPassword);
        Button button = (Button)findViewById(R.id.btnLogin);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        username.getText().toString(),
                        Toast.LENGTH_SHORT)
                        .show();

                Intent i = new Intent(MainActivity.this,
                        Main2Activity.class);

                i.putExtra("nama", username.getText().toString());
                i.putExtra("password", password.getText().toString());

                startActivity(i);
            }
        });
    }
}
