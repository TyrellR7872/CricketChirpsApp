package com.troberts.cricketchirpsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numID;
    TextView tvResults;
    Button submitID1;
    Button submitID2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numID = findViewById(R.id.numID);
        submitID1 = findViewById(R.id.submitID);
        submitID2 = findViewById(R.id.submitID2);
        tvResults = findViewById(R.id.tvResults);

        tvResults.setVisibility(View.GONE);

        submitID1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int idTemp = Integer.parseInt(numID.getText().toString());

                float converted = idTemp + 40;

                String results = getString(R.string.approxTemp) + " " +
                                    converted+ " " +getString(R.string.fahrenheit);

                tvResults.setText(results);
                tvResults.setVisibility(View.VISIBLE);
            }
        });

        submitID2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int idTemp = Integer.parseInt(numID.getText().toString());

                float converted = (idTemp/3) +4;

                String results = getString(R.string.approxTemp) + " " +
                        converted+ " " +getString(R.string.celsius);

                tvResults.setText(results);
                tvResults.setVisibility(View.VISIBLE);
            }
        });


    }
}
