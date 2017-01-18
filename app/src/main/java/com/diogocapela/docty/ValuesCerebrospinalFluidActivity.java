package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesCerebrospinalFluidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_cerebrospinal_fluid);

        // Appearance
        ((TextView)findViewById(R.id.cerebrospinalfluid_appearance_title)).setText(Html.fromHtml("<b>Appearance</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_appearance_display)).setText(Html.fromHtml("Clear, colorless"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_appearance_unit)).setText(Html.fromHtml(""));

        // Glucose
        ((TextView)findViewById(R.id.cerebrospinalfluid_glucose_title)).setText(Html.fromHtml("<b>Glucose</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_glucose_display)).setText(Html.fromHtml("50 – 80"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_glucose_unit)).setText(Html.fromHtml("mg/100mL"));

        // Osmolality
        ((TextView)findViewById(R.id.cerebrospinalfluid_osmolality_title)).setText(Html.fromHtml("<b>Osmolality</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_osmolality_display)).setText(Html.fromHtml("290 – 298"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_osmolality_unit)).setText(Html.fromHtml("mOsm/L"));

        // Pressure
        ((TextView)findViewById(R.id.cerebrospinalfluid_pressure_title)).setText(Html.fromHtml("<b>Pressure</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_pressure_display)).setText(Html.fromHtml("70 – 180"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_pressure_unit)).setText(Html.fromHtml("mm/H2O"));

        // Total protein
        ((TextView)findViewById(R.id.cerebrospinalfluid_protein_title)).setText(Html.fromHtml("<b>Total protein</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_protein_display)).setText(Html.fromHtml("15 – 45"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_protein_unit)).setText(Html.fromHtml("mg/dL"));

        // Gamma globulin
        ((TextView)findViewById(R.id.cerebrospinalfluid_globulin_title)).setText(Html.fromHtml("<b>Gamma globulin</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_globulin_display)).setText(Html.fromHtml("3 – 12"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_globulin_unit)).setText(Html.fromHtml("% of the total protein"));

        // White blood cell count
        ((TextView)findViewById(R.id.cerebrospinalfluid_wbcell_title)).setText(Html.fromHtml("<b>White blood cell count</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_wbcell_display)).setText(Html.fromHtml("0 – 5"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_wbcell_unit)).setText(Html.fromHtml("cell/µL"));

        // Chloride (Cl-)
        ((TextView)findViewById(R.id.cerebrospinalfluid_chloride_title)).setText(Html.fromHtml("<b>Chloride (Cl-)</b>"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_chloride_display)).setText(Html.fromHtml("110 – 125"));
        ((TextView)findViewById(R.id.cerebrospinalfluid_chloride_unit)).setText(Html.fromHtml("mEq/L"));

    }
}
