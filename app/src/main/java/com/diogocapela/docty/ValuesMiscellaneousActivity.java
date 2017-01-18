package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesMiscellaneousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_miscellaneous);

        // Alpha-1 antitrypsin (A1AT)
        ((TextView)findViewById(R.id.miscellaneous_a1at_title)).setText(Html.fromHtml("<b>Alpha-1 antitrypsin (A1AT)</b>"));
        ((TextView)findViewById(R.id.miscellaneous_a1at_display)).setText(Html.fromHtml("20 – 50"));
        ((TextView)findViewById(R.id.miscellaneous_a1at_unit)).setText(Html.fromHtml("µmol/L"));

        // Angiotensin-converting enzyme (ACE)
        ((TextView)findViewById(R.id.miscellaneous_ace_title)).setText(Html.fromHtml("<b>Angiotensin-converting enzyme (ACE)</b>"));
        ((TextView)findViewById(R.id.miscellaneous_ace_display)).setText(Html.fromHtml("23 – 57"));
        ((TextView)findViewById(R.id.miscellaneous_ace_unit)).setText(Html.fromHtml("IU/L"));

        // C-reactive protein (CRP)
        ((TextView)findViewById(R.id.miscellaneous_crp_title)).setText(Html.fromHtml("<b>C-reactive protein (CRP)</b>"));
        ((TextView)findViewById(R.id.miscellaneous_crp_display)).setText(Html.fromHtml("0 – 5"));
        ((TextView)findViewById(R.id.miscellaneous_crp_unit)).setText(Html.fromHtml("mg/L"));

        // D-dimer
        ((TextView)findViewById(R.id.miscellaneous_dd_title)).setText(Html.fromHtml("<b>D-dimer</b>"));
        ((TextView)findViewById(R.id.miscellaneous_dd_display)).setText(Html.fromHtml("0 – 500"));
        ((TextView)findViewById(R.id.miscellaneous_dd_unit)).setText(Html.fromHtml("ng/mL"));

        // Lactate dehydrogenase (LDH)
        ((TextView)findViewById(R.id.miscellaneous_ldh_title)).setText(Html.fromHtml("<b>Lactate dehydrogenase (LDH)</b>"));
        ((TextView)findViewById(R.id.miscellaneous_ldh_display)).setText(Html.fromHtml("50 – 150"));
        ((TextView)findViewById(R.id.miscellaneous_ldh_unit)).setText(Html.fromHtml("IU/L"));
        
    }
}
