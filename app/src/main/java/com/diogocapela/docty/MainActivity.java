package com.diogocapela.docty;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Define views
    private Button btn_list_values;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        // Find list view
        btn_list_values = (Button)findViewById(R.id.button_list_values);

        // Assign listener to list button
        btn_list_values.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start list activity
                Intent intent = new Intent(MainActivity.this, ListValuesActivity.class);
                startActivity(intent);
            }
        });

    }
}
