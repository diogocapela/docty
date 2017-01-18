package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesVitalSignsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_vital_signs);

        // Temperature
        ((TextView)findViewById(R.id.vitalsigns_temperature_title)).setText(Html.fromHtml("<b>Temperature</b>"));
        ((TextView)findViewById(R.id.vitalsigns_temperature_display)).setText(Html.fromHtml("<b>Tympanic:</b> 35.4 – 37.8<br><b>Axillary:</b> 35.5 – 37.0<br><b>Oral:</b> 33.2 – 38.2<br><b>Rectal:</b> 34.4 – 37.8"));
        ((TextView)findViewById(R.id.vitalsigns_temperature_unit)).setText(Html.fromHtml("ºC"));

        // Pulse Rate
        ((TextView)findViewById(R.id.vitalsigns_pulserate_title)).setText(Html.fromHtml("<b>Pulse Rate</b>"));
        ((TextView)findViewById(R.id.vitalsigns_pulserate_display)).setText(Html.fromHtml("<b>Adult:</b> 60 – 100<br><b>Child:</b> 70 – 130<br><b>Newborn:</b> 100 – 150"));
        ((TextView)findViewById(R.id.vitalsigns_pulserate_unit)).setText(Html.fromHtml("bpm"));

        // Respiration Rate
        ((TextView)findViewById(R.id.vitalsigns_respirationrate_title)).setText(Html.fromHtml("<b>Respiration Rate</b>"));
        ((TextView)findViewById(R.id.vitalsigns_respirationrate_display)).setText(Html.fromHtml("<b>Adult:</b> 12 – 18<br><b>Child:</b> 17 – 23<br><b>Newborn:</b> 30 – 40"));
        ((TextView)findViewById(R.id.vitalsigns_respirationrate_unit)).setText(Html.fromHtml("bpm"));

        // Blood Pressure
        ((TextView)findViewById(R.id.vitalsigns_bloodpressure_title)).setText(Html.fromHtml("<b>Blood Pressure</b>"));
        ((TextView)findViewById(R.id.vitalsigns_bloodpressure_display)).setText(Html.fromHtml("<b>Systolic:</b> 90 – 120<br><b>Diastolic:</b> 60 – 80"));
        ((TextView)findViewById(R.id.vitalsigns_bloodpressure_unit)).setText(Html.fromHtml("mmHg"));

    }
}
