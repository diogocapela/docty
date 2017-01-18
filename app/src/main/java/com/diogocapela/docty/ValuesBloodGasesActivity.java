package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesBloodGasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_blood_gases);

        // pH
        ((TextView)findViewById(R.id.bloodgases_ph_title)).setText(Html.fromHtml("<b>pH</b>"));
        ((TextView)findViewById(R.id.bloodgases_ph_display)).setText(Html.fromHtml("<b>Arterial:</b> 7.35 – 7.45<br><b>Venous:</b> 7.31 – 7.41"));
        ((TextView)findViewById(R.id.bloodgases_ph_unit)).setText(Html.fromHtml(""));

        // Partial pressure of oxygen (PaO2)
        ((TextView)findViewById(R.id.bloodgases_pao2_title)).setText(Html.fromHtml("<b>Partial pressure of oxygen (PaO2)</b>"));
        ((TextView)findViewById(R.id.bloodgases_pao2_display)).setText(Html.fromHtml("<b>Arterial:</b> 80 – 100<br><b>Venous:</b> 30 – 40"));
        ((TextView)findViewById(R.id.bloodgases_pao2_unit)).setText(Html.fromHtml("mmHg"));

        // Partial pressure of carbon dioxide (PaCO2)
        ((TextView)findViewById(R.id.bloodgases_paco2_title)).setText(Html.fromHtml("<b>Partial pressure of carbon dioxide (PaCO2)</b>"));
        ((TextView)findViewById(R.id.bloodgases_paco2_display)).setText(Html.fromHtml("<b>Arterial:</b> 35 – 45<br><b>Venous:</b> 41 – 51"));
        ((TextView)findViewById(R.id.bloodgases_paco2_unit)).setText(Html.fromHtml("mmHg"));

        // Oxygen saturation (SaO2)
        ((TextView)findViewById(R.id.bloodgases_sao2_title)).setText(Html.fromHtml("<b>Oxygen saturation (SaO2)</b>"));
        ((TextView)findViewById(R.id.bloodgases_sao2_display)).setText(Html.fromHtml("<b>Arterial:</b> 96 – 100<br><b>Venous:</b> 60 – 85"));
        ((TextView)findViewById(R.id.bloodgases_sao2_unit)).setText(Html.fromHtml("%"));

        // Bicarbonate (HCO3-)
        ((TextView)findViewById(R.id.bloodgases_hco3_title)).setText(Html.fromHtml("<b>Bicarbonate (HCO3<sup>-</sup>)</b>"));
        ((TextView)findViewById(R.id.bloodgases_hco3_display)).setText(Html.fromHtml("<b>Arterial:</b> 22 – 26<br><b>Venous:</b> 22 – 29"));
        ((TextView)findViewById(R.id.bloodgases_hco3_unit)).setText(Html.fromHtml("mEq/L"));

        // Base excess (BE)
        ((TextView)findViewById(R.id.bloodgases_be_title)).setText(Html.fromHtml("<b>Base excess (BE)</b>"));
        ((TextView)findViewById(R.id.bloodgases_be_display)).setText(Html.fromHtml("<b>Arterial:</b> -2 – +2<br><b>Venous:</b> 0 – +4"));
        ((TextView)findViewById(R.id.bloodgases_be_unit)).setText(Html.fromHtml("mmol/L"));


    }
}
