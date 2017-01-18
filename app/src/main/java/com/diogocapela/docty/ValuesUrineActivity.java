package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesUrineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_urine);

        // Appearance
        ((TextView)findViewById(R.id.urine_app_title)).setText(Html.fromHtml("<b>Appearance</b>"));
        ((TextView)findViewById(R.id.urine_app_display)).setText(Html.fromHtml("<b>Color:</b> Yellow<br><b>Opacity:</b> Clear – Cloudy"));
        ((TextView)findViewById(R.id.urine_app_unit)).setText(Html.fromHtml(""));

        // pH
        ((TextView)findViewById(R.id.urine_ph_title)).setText(Html.fromHtml("<b>pH</b>"));
        ((TextView)findViewById(R.id.urine_ph_display)).setText(Html.fromHtml("4.5 – 8"));
        ((TextView)findViewById(R.id.urine_ph_unit)).setText(Html.fromHtml(""));

        // Osmolality
        ((TextView)findViewById(R.id.urine_osmo_title)).setText(Html.fromHtml("<b>Osmolality</b>"));
        ((TextView)findViewById(R.id.urine_osmo_display)).setText(Html.fromHtml("80 – 1300"));
        ((TextView)findViewById(R.id.urine_osmo_unit)).setText(Html.fromHtml("mOsm/L"));

        // Chloride (Cl-)
        ((TextView)findViewById(R.id.urine_cl_title)).setText(Html.fromHtml("<b>Chloride (Cl-)</b>"));
        ((TextView)findViewById(R.id.urine_cl_display)).setText(Html.fromHtml("Less than 8"));
        ((TextView)findViewById(R.id.urine_cl_unit)).setText(Html.fromHtml("mEq/L"));

        // Sodium (Na+)
        ((TextView)findViewById(R.id.urine_na_title)).setText(Html.fromHtml("<b>Sodium (Na+)</b>"));
        ((TextView)findViewById(R.id.urine_na_display)).setText(Html.fromHtml("10 – 40"));
        ((TextView)findViewById(R.id.urine_na_unit)).setText(Html.fromHtml("mEq/L"));

        // Potassium (K+)
        ((TextView)findViewById(R.id.urine_k_title)).setText(Html.fromHtml("<b>Potassium (K+)</b>"));
        ((TextView)findViewById(R.id.urine_k_display)).setText(Html.fromHtml("Less than 8"));
        ((TextView)findViewById(R.id.urine_k_unit)).setText(Html.fromHtml("mEq/L"));

        // Blood
        ((TextView)findViewById(R.id.urine_blood_title)).setText(Html.fromHtml("<b>Blood</b>"));
        ((TextView)findViewById(R.id.urine_blood_display)).setText(Html.fromHtml("Negative"));
        ((TextView)findViewById(R.id.urine_blood_unit)).setText(Html.fromHtml(""));

        // Bilirubin
        ((TextView)findViewById(R.id.urine_bilirubin_title)).setText(Html.fromHtml("<b>Bilirubin</b>"));
        ((TextView)findViewById(R.id.urine_bilirubin_display)).setText(Html.fromHtml("Negative"));
        ((TextView)findViewById(R.id.urine_bilirubin_unit)).setText(Html.fromHtml(""));

        // Leukocytes
        ((TextView)findViewById(R.id.urine_leukocytes_title)).setText(Html.fromHtml("<b>Leukocytes</b>"));
        ((TextView)findViewById(R.id.urine_leukocytes_display)).setText(Html.fromHtml("Negative"));
        ((TextView)findViewById(R.id.urine_leukocytes_unit)).setText(Html.fromHtml(""));

        // Ketones
        ((TextView)findViewById(R.id.urine_ketones_title)).setText(Html.fromHtml("<b>Ketones</b>"));
        ((TextView)findViewById(R.id.urine_ketones_display)).setText(Html.fromHtml("Negative"));
        ((TextView)findViewById(R.id.urine_ketones_unit)).setText(Html.fromHtml(""));

        // Red blood cells (RBC)
        ((TextView)findViewById(R.id.urine_rbc_title)).setText(Html.fromHtml("<b>Red blood cells (RBC)</b>"));
        ((TextView)findViewById(R.id.urine_rbc_display)).setText(Html.fromHtml("0 – 2"));
        ((TextView)findViewById(R.id.urine_rbc_unit)).setText(Html.fromHtml("cells/HPF"));

        // White blood cells (WBC)
        ((TextView)findViewById(R.id.urine_wbc_title)).setText(Html.fromHtml("<b>White blood cells (WBC)</b>"));
        ((TextView)findViewById(R.id.urine_wbc_display)).setText(Html.fromHtml("0 – 2.5"));
        ((TextView)findViewById(R.id.urine_wbc_unit)).setText(Html.fromHtml("cells/HPF"));

        // Protein
        ((TextView)findViewById(R.id.urine_protein_title)).setText(Html.fromHtml("<b>Protein</b>"));
        ((TextView)findViewById(R.id.urine_protein_display)).setText(Html.fromHtml("1 – 15"));
        ((TextView)findViewById(R.id.urine_protein_unit)).setText(Html.fromHtml("mg/dL"));

    }
}
