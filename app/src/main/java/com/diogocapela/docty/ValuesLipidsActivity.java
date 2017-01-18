package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesLipidsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_lipids);

        // Cholesterol (Total)
        ((TextView)findViewById(R.id.lipids_coltot_title)).setText(Html.fromHtml("<b>Cholesterol (Total)</b>"));
        ((TextView)findViewById(R.id.lipids_coltot_display)).setText(Html.fromHtml("Less than 200"));
        ((TextView)findViewById(R.id.lipids_coltot_unit)).setText(Html.fromHtml("mg/dL"));

        // High-density lipoprotein (HDL)
        ((TextView)findViewById(R.id.lipids_colhdl_title)).setText(Html.fromHtml("<b>High-density lipoprotein (HDL)</b>"));
        ((TextView)findViewById(R.id.lipids_colhdl_display)).setText(Html.fromHtml("Less than 130"));
        ((TextView)findViewById(R.id.lipids_colhdl_unit)).setText(Html.fromHtml("mg/dL"));

        // Low-density lipoprotein (LDL)
        ((TextView)findViewById(R.id.lipids_colldl_title)).setText(Html.fromHtml("<b>Low-density lipoprotein (LDL)</b>"));
        ((TextView)findViewById(R.id.lipids_colldl_display)).setText(Html.fromHtml("30 – 75"));
        ((TextView)findViewById(R.id.lipids_colldl_unit)).setText(Html.fromHtml("mg/dL"));

        // Triglycerides
        ((TextView)findViewById(R.id.lipids_trig_title)).setText(Html.fromHtml("<b>Triglycerides</b>"));
        ((TextView)findViewById(R.id.lipids_trig_display)).setText(Html.fromHtml("<b>Male:</b> 40 – 170<br><b>Female:</b> 35 – 135"));
        ((TextView)findViewById(R.id.lipids_trig_unit)).setText(Html.fromHtml("mg/dL"));

        // Phospholipids (PPL)
        ((TextView)findViewById(R.id.lipids_phos_title)).setText(Html.fromHtml("<b>Phospholipids (PPL)</b>"));
        ((TextView)findViewById(R.id.lipids_phos_display)).setText(Html.fromHtml("155 – 275"));
        ((TextView)findViewById(R.id.lipids_phos_unit)).setText(Html.fromHtml("mg/dL"));

        // Very-low-density lipoprotein (VLDL)
        ((TextView)findViewById(R.id.lipids_colvldl_title)).setText(Html.fromHtml("<b>Very-low-density lipoprotein (VLDL)</b>"));
        ((TextView)findViewById(R.id.lipids_colvldl_display)).setText(Html.fromHtml("2 – 30"));
        ((TextView)findViewById(R.id.lipids_colvldl_unit)).setText(Html.fromHtml("mg/dL"));

        // Cholesterol:HDL Ratio
        ((TextView)findViewById(R.id.lipids_colratio_title)).setText(Html.fromHtml("<b>Cholesterol:HDL Ratio</b>"));
        ((TextView)findViewById(R.id.lipids_colratio_display)).setText(Html.fromHtml("1 – 3.5"));
        ((TextView)findViewById(R.id.lipids_colratio_unit)).setText(Html.fromHtml(""));

    }
}
