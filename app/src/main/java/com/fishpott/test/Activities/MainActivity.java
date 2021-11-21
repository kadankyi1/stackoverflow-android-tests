package com.fishpott.test.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.fishpott.test.R;

public class MainActivity extends AppCompatActivity {

    TextView mClickerTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClickerTextView = findViewById(R.id.clicker);

        mClickerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(MainActivity.this, PrintLauncherFragmentActivity.class);
                //myIntent.putExtra("key", value); //Optional parameters
                startActivity(myIntent);
            }
        });
    }
}