package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesCardiacMarkersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_cardiac_markers);

        // Myoglobin (Mb)
        ((TextView)findViewById(R.id.cardiacmarkers_myo_title)).setText(Html.fromHtml("<b>Myoglobin (Mb)</b>"));
        ((TextView)findViewById(R.id.cardiacmarkers_myo_display)).setText(Html.fromHtml("<b>Male:</b> 10 – 95<br><b>Female:</b> 10 – 65"));
        ((TextView)findViewById(R.id.cardiacmarkers_myo_unit)).setText(Html.fromHtml("ng/mL"));

        // Creatine kinase (CK)
        ((TextView)findViewById(R.id.cardiacmarkers_ck_title)).setText(Html.fromHtml("<b>Creatine kinase (CK)</b>"));
        ((TextView)findViewById(R.id.cardiacmarkers_ck_display)).setText(Html.fromHtml("<b>Male:</b> 55 – 300<br><b>Female:</b> 40 – 175"));
        ((TextView)findViewById(R.id.cardiacmarkers_ck_unit)).setText(Html.fromHtml("IU/L"));

        // Creatine Kinase MB (CK-MB)
        ((TextView)findViewById(R.id.cardiacmarkers_ckmb_title)).setText(Html.fromHtml("<b>Creatine Kinase MB (CK-MB)</b>"));
        ((TextView)findViewById(R.id.cardiacmarkers_ckmb_display)).setText(Html.fromHtml("<b>Male:</b> 0 – 7.7<br><b>Female:</b> 0 – 4.3"));
        ((TextView)findViewById(R.id.cardiacmarkers_ckmb_unit)).setText(Html.fromHtml("ng/mL"));

        // Troponins
        ((TextView)findViewById(R.id.cardiacmarkers_trop_title)).setText(Html.fromHtml("<b>Troponins</b>"));
        ((TextView)findViewById(R.id.cardiacmarkers_trop_display)).setText(Html.fromHtml("0 – 0.3"));
        ((TextView)findViewById(R.id.cardiacmarkers_trop_unit)).setText(Html.fromHtml("ng/mL"));

    }
}
