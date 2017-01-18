package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesVitaminsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_vitamins);

        // Vitamin A
        ((TextView)findViewById(R.id.vitamins_vita_title)).setText(Html.fromHtml("<b>Vitamin A</b>"));
        ((TextView)findViewById(R.id.vitamins_vita_display)).setText(Html.fromHtml("30 – 65"));
        ((TextView)findViewById(R.id.vitamins_vita_unit)).setText(Html.fromHtml("µg/dL"));

        // Vitamin B9 (Folic acid)
        ((TextView)findViewById(R.id.vitamins_vitb9_title)).setText(Html.fromHtml("<b>Vitamin B9 (Folic acid)</b>"));
        ((TextView)findViewById(R.id.vitamins_vitb9_display)).setText(Html.fromHtml("7 – 36"));
        ((TextView)findViewById(R.id.vitamins_vitb9_unit)).setText(Html.fromHtml("nmol/L"));

        // Vitamin B12 (Cobalamin)
        ((TextView)findViewById(R.id.vitamins_vitb12_title)).setText(Html.fromHtml("<b>Vitamin B12 (Cobalamin)</b>"));
        ((TextView)findViewById(R.id.vitamins_vitb12_display)).setText(Html.fromHtml("130 – 700"));
        ((TextView)findViewById(R.id.vitamins_vitb12_unit)).setText(Html.fromHtml("ng/L"));

        // Vitamin C
        ((TextView)findViewById(R.id.vitamins_vitc_title)).setText(Html.fromHtml("<b>Vitamin C</b>"));
        ((TextView)findViewById(R.id.vitamins_vitc_display)).setText(Html.fromHtml("0.4 – 1.5"));
        ((TextView)findViewById(R.id.vitamins_vitc_unit)).setText(Html.fromHtml("mg/dL"));

        // Vitamin D
        ((TextView)findViewById(R.id.vitamins_vitd_title)).setText(Html.fromHtml("<b>Vitamin D</b>"));
        ((TextView)findViewById(R.id.vitamins_vitd_display)).setText(Html.fromHtml("5 – 75"));
        ((TextView)findViewById(R.id.vitamins_vitd_unit)).setText(Html.fromHtml("ng/mL"));

    }
}
