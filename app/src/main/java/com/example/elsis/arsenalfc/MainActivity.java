package com.example.elsis.arsenalfc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToSquad(View view) {
        Intent intent = new Intent(getApplicationContext(),PlayerActivity.class);
        startActivity(intent);
    }

    public void goToFixures(View view) {
        Intent intent = new Intent(getApplicationContext(),Fixtures.class);
        startActivity(intent);
    }

    public void goToAbout(View view) {
        Intent intent = new Intent(getApplicationContext(),About.class);
        startActivity(intent);

    }
}
