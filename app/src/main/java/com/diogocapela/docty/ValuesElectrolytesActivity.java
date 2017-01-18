package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesElectrolytesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_electrolytes);

        // Ammonia (NH3)
        ((TextView)findViewById(R.id.electrolytes_nh3_title)).setText(Html.fromHtml("<b>Ammonia (NH3)</b>"));
        ((TextView)findViewById(R.id.electrolytes_nh3_display)).setText(Html.fromHtml("15 – 50"));
        ((TextView)findViewById(R.id.electrolytes_nh3_unit)).setText(Html.fromHtml("µmol/L"));

        // Calcium (Ca2+)
        ((TextView)findViewById(R.id.electrolytes_ca2_title)).setText(Html.fromHtml("<b>Calcium (Ca2+)</b>"));
        ((TextView)findViewById(R.id.electrolytes_ca2_display)).setText(Html.fromHtml("2 – 2.6"));
        ((TextView)findViewById(R.id.electrolytes_ca2_unit)).setText(Html.fromHtml("mmol/L"));

        // Ceruloplasmin
        ((TextView)findViewById(R.id.electrolytes_ceru_title)).setText(Html.fromHtml("<b>Ceruloplasmin</b>"));
        ((TextView)findViewById(R.id.electrolytes_ceru_display)).setText(Html.fromHtml("15 – 60"));
        ((TextView)findViewById(R.id.electrolytes_ceru_unit)).setText(Html.fromHtml("mg/dL"));

        // Chloride (Cl-)
        ((TextView)findViewById(R.id.electrolytes_cl_title)).setText(Html.fromHtml("<b>Chloride (Cl-)</b>"));
        ((TextView)findViewById(R.id.electrolytes_cl_display)).setText(Html.fromHtml("95 – 105"));
        ((TextView)findViewById(R.id.electrolytes_cl_unit)).setText(Html.fromHtml("mmol/L"));

        // Copper (Cu)
        ((TextView)findViewById(R.id.electrolytes_cu_title)).setText(Html.fromHtml("<b>Copper (Cu)</b>"));
        ((TextView)findViewById(R.id.electrolytes_cu_display)).setText(Html.fromHtml("70 – 150"));
        ((TextView)findViewById(R.id.electrolytes_cu_unit)).setText(Html.fromHtml("µg/dL"));

        // Creatinine
        ((TextView)findViewById(R.id.electrolytes_crea_title)).setText(Html.fromHtml("<b>Creatinine</b>"));
        ((TextView)findViewById(R.id.electrolytes_crea_display)).setText(Html.fromHtml("0.8 – 1.3"));
        ((TextView)findViewById(R.id.electrolytes_crea_unit)).setText(Html.fromHtml("mg/dL"));

        // Ferritin
        ((TextView)findViewById(R.id.electrolytes_ferr_title)).setText(Html.fromHtml("<b>Ferritin</b>"));
        ((TextView)findViewById(R.id.electrolytes_ferr_display)).setText(Html.fromHtml("<b>Male:</b> 12 – 300<br><b>Female:</b> 12 – 150"));
        ((TextView)findViewById(R.id.electrolytes_ferr_unit)).setText(Html.fromHtml("ng/mL"));

        // Glucose
        ((TextView)findViewById(R.id.electrolytes_glu_title)).setText(Html.fromHtml("<b>Glucose</b>"));
        ((TextView)findViewById(R.id.electrolytes_glu_display)).setText(Html.fromHtml("15 – 50"));
        ((TextView)findViewById(R.id.electrolytes_glu_unit)).setText(Html.fromHtml("mg/dL"));

        // Iron (Fe2+)
        ((TextView)findViewById(R.id.electrolytes_fe2_title)).setText(Html.fromHtml("<b>Iron (Fe2+)</b>"));
        ((TextView)findViewById(R.id.electrolytes_fe2_display)).setText(Html.fromHtml("<b>Male:</b> 65 – 180<br><b>Female:</b> 30 – 170"));
        ((TextView)findViewById(R.id.electrolytes_fe2_unit)).setText(Html.fromHtml("µg/dL"));

        // Magnesium (Mg2+)
        ((TextView)findViewById(R.id.electrolytes_mg_title)).setText(Html.fromHtml("<b>Magnesium (Mg2+)</b>"));
        ((TextView)findViewById(R.id.electrolytes_mg_display)).setText(Html.fromHtml("1.5 – 2"));
        ((TextView)findViewById(R.id.electrolytes_mg_unit)).setText(Html.fromHtml("mEq/L"));

        // Phosphate (PO43-)
        ((TextView)findViewById(R.id.electrolytes_po4_title)).setText(Html.fromHtml("<b>Phosphate (PO43-)</b>"));
        ((TextView)findViewById(R.id.electrolytes_po4_display)).setText(Html.fromHtml("0.8 – 1.5"));
        ((TextView)findViewById(R.id.electrolytes_po4_unit)).setText(Html.fromHtml("mmol/L"));

        // Potassium (K+)
        ((TextView)findViewById(R.id.electrolytes_k_title)).setText(Html.fromHtml("<b>Potassium (K+)</b>"));
        ((TextView)findViewById(R.id.electrolytes_k_display)).setText(Html.fromHtml("3.5 – 5"));
        ((TextView)findViewById(R.id.electrolytes_k_unit)).setText(Html.fromHtml("mmol/L"));

        // Pyruvate
        ((TextView)findViewById(R.id.electrolytes_pyr_title)).setText(Html.fromHtml("<b>Pyruvate</b>"));
        ((TextView)findViewById(R.id.electrolytes_pyr_display)).setText(Html.fromHtml("300 – 900"));
        ((TextView)findViewById(R.id.electrolytes_pyr_unit)).setText(Html.fromHtml("µg/dL"));

        // Sodium (Na+)
        ((TextView)findViewById(R.id.electrolytes_na_title)).setText(Html.fromHtml("<b>Sodium (Na+)</b>"));
        ((TextView)findViewById(R.id.electrolytes_na_display)).setText(Html.fromHtml("135 – 145"));
        ((TextView)findViewById(R.id.electrolytes_na_unit)).setText(Html.fromHtml("mmol/L"));

        // Transferrin
        ((TextView)findViewById(R.id.electrolytes_trans_title)).setText(Html.fromHtml("<b>Transferrin</b>"));
        ((TextView)findViewById(R.id.electrolytes_trans_display)).setText(Html.fromHtml("200 – 350"));
        ((TextView)findViewById(R.id.electrolytes_trans_unit)).setText(Html.fromHtml("mg/dL"));

        // Urea
        ((TextView)findViewById(R.id.electrolytes_urea_title)).setText(Html.fromHtml("<b>Urea</b>"));
        ((TextView)findViewById(R.id.electrolytes_urea_display)).setText(Html.fromHtml("1.2 – 3"));
        ((TextView)findViewById(R.id.electrolytes_urea_unit)).setText(Html.fromHtml("mmol/L"));

        // Uric acid
        ((TextView)findViewById(R.id.electrolytes_uric_title)).setText(Html.fromHtml("<b>Uric acid</b>"));
        ((TextView)findViewById(R.id.electrolytes_uric_display)).setText(Html.fromHtml("0.18 – 0.48"));
        ((TextView)findViewById(R.id.electrolytes_uric_unit)).setText(Html.fromHtml("mmol/L"));

        // Zinc (Zn2+)
        ((TextView)findViewById(R.id.electrolytes_zn_title)).setText(Html.fromHtml("<b>Zinc (Zn2+)</b>"));
        ((TextView)findViewById(R.id.electrolytes_zn_display)).setText(Html.fromHtml("70 – 100"));
        ((TextView)findViewById(R.id.electrolytes_zn_unit)).setText(Html.fromHtml("µmol/L"));



    }
}
