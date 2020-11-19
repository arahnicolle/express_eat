package com.example.express_eat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Settings extends AppCompatActivity {

    private TextView e_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        e_logout = (TextView) findViewById(R.id.logout);

        e_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view == e_logout) {
                    Intent b = new Intent(Settings.this, LogIn.class);
                    startActivity(b);
                    finish();

                }
            }
        });
    }
}