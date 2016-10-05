package com.portal_of_happy.shortcuttest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("http://sanfordfl.gov"));

        startActivity(browserIntent);

        finish();
    }
}
