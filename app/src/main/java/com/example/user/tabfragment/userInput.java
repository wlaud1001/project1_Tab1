package com.example.user.tabfragment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class userInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_input);
        final int numnum = getIntent().getIntExtra("num#", 0);

        final EditText edittext = (EditText) findViewById(R.id.editText3);
        Button button = (Button) findViewById(R.id.bu2);
        Button button3 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String userAnswer = edittext.getText().toString();
                if (userAnswer.length() == numnum) {
                    Intent intent = new Intent(getApplicationContext(), numberbaseball.class);
                    intent.putExtra("userAnswer", userAnswer);
                    intent.putExtra("user", 1);
                    intent.putExtra("num#", numnum);
                    startActivity(intent);
                } else
                    Toast.makeText(getApplicationContext(), "Wrong length!! Please enter " + numnum + " digits.", Toast.LENGTH_LONG).show();


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}
