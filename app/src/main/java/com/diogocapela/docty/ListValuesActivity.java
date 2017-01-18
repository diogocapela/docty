package com.diogocapela.docty;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListValuesActivity extends AppCompatActivity {

    // Define views
    private Button btn_vitalsigns;
    private Button btn_hematology;
    private Button btn_coagulation;
    private Button btn_bloodgases;
    private Button btn_electrolytes;
    private Button btn_lipids;
    private Button btn_gastrointestinal;
    private Button btn_cardiacmarkers;
    private Button btn_tumormarkers;
    private Button btn_urine;
    private Button btn_hormones;
    private Button btn_vitamins;
    private Button btn_cerebrospinalfluid;
    private Button btn_neurology;
    private Button btn_miscellaneous;

    private Button btn_diogocapela;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_values);

        // Find views
        btn_vitalsigns = (Button)findViewById(R.id.button_vitalsigns);
        btn_hematology = (Button)findViewById(R.id.button_hematology);
        btn_coagulation = (Button)findViewById(R.id.button_coagulation);
        btn_bloodgases = (Button)findViewById(R.id.button_bloodgases);
        btn_electrolytes = (Button)findViewById(R.id.button_electrolytes);
        btn_lipids = (Button)findViewById(R.id.button_lipids);
        btn_gastrointestinal = (Button)findViewById(R.id.button_gastrointestinal);
        btn_cardiacmarkers = (Button)findViewById(R.id.button_cardiacmarkers);
        btn_tumormarkers = (Button)findViewById(R.id.button_tumormarkers);
        btn_urine = (Button)findViewById(R.id.button_urine);
        btn_hormones = (Button)findViewById(R.id.button_hormones);
        btn_vitamins = (Button)findViewById(R.id.button_vitamins);
        btn_cerebrospinalfluid = (Button)findViewById(R.id.button_cerebrospinalfluid);
        btn_neurology = (Button)findViewById(R.id.button_neurology);
        btn_miscellaneous = (Button)findViewById(R.id.button_miscellaneous);

        btn_diogocapela = (Button)findViewById(R.id.button_diogocapela);

        // Assign listener to Vital Signs button
        btn_vitalsigns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesVitalSignsActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Hematology button
        btn_hematology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesHematologyActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Coagulation button
        btn_coagulation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesCoagulationActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Blood Gases button
        btn_bloodgases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesBloodGasesActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Electrolytes button
        btn_electrolytes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesElectrolytesActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Lipids button
        btn_lipids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesLipidsActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Gastrointestinal button
        btn_gastrointestinal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesGastrointestinalActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Cardiac Markers button
        btn_cardiacmarkers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesCardiacMarkersActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Tumor Markers button
        btn_tumormarkers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesTumorMarkersActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Urine button
        btn_urine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesUrineActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Hormones button
        btn_hormones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesHormonesActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Vitamins button
        btn_vitamins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesVitaminsActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Cerebrospinal Fluid button
        btn_cerebrospinalfluid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesCerebrospinalFluidActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Neurology button
        btn_neurology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesNeurologyActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to Miscellaneous button
        btn_miscellaneous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start activity
                Intent intent = new Intent(ListValuesActivity.this, ValuesMiscellaneousActivity.class);
                startActivity(intent);
            }
        });

        // Assign listener to diogocapela button
        btn_diogocapela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define URL
                String url = "http://diogocapela.com";
                // Start activity
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });

    }
}
