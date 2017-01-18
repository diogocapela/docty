package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesTumorMarkersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_tumor_markers);

        // Alpha-fetoprotein (AFP)
        ((TextView)findViewById(R.id.tumormarkers_afp_title)).setText(Html.fromHtml("<b>Alpha-fetoprotein (AFP)</b>"));
        ((TextView)findViewById(R.id.tumormarkers_afp_display)).setText(Html.fromHtml("0 – 44"));
        ((TextView)findViewById(R.id.tumormarkers_afp_unit)).setText(Html.fromHtml("ng/mL"));

        // Human chorionic gonadotropin (hCG)
        ((TextView)findViewById(R.id.tumormarkers_hcg_title)).setText(Html.fromHtml("<b>Human chorionic gonadotropin (hCG)</b>"));
        ((TextView)findViewById(R.id.tumormarkers_hcg_display)).setText(Html.fromHtml("0 – 5"));
        ((TextView)findViewById(R.id.tumormarkers_hcg_unit)).setText(Html.fromHtml("IU/L"));

        // Carbohydrate antigen 19-9 (CA19-9)
        ((TextView)findViewById(R.id.tumormarkers_ca199_title)).setText(Html.fromHtml("<b>Carbohydrate antigen 19-9 (CA19-9)</b>"));
        ((TextView)findViewById(R.id.tumormarkers_ca199_display)).setText(Html.fromHtml("0 – 40"));
        ((TextView)findViewById(R.id.tumormarkers_ca199_unit)).setText(Html.fromHtml("IU/mL"));

        // Carcinoembryonic antigen (CEA)
        ((TextView)findViewById(R.id.tumormarkers_cea_title)).setText(Html.fromHtml("<b>Carcinoembryonic antigen (CEA)</b>"));
        ((TextView)findViewById(R.id.tumormarkers_cea_display)).setText(Html.fromHtml("0 – 4"));
        ((TextView)findViewById(R.id.tumormarkers_cea_unit)).setText(Html.fromHtml("μg/L"));

        // Prostatic acid phosphatase (PAP)
        ((TextView)findViewById(R.id.tumormarkers_pap_title)).setText(Html.fromHtml("<b>Prostatic acid phosphatase (PAP)</b>"));
        ((TextView)findViewById(R.id.tumormarkers_pap_display)).setText(Html.fromHtml("0 – 3"));
        ((TextView)findViewById(R.id.tumormarkers_pap_unit)).setText(Html.fromHtml("IU/dL"));

        // Prostate-specific antigen (PSA)
        ((TextView)findViewById(R.id.tumormarkers_psa_title)).setText(Html.fromHtml("<b>Prostate-specific antigen (PSA)</b>"));
        ((TextView)findViewById(R.id.tumormarkers_psa_display)).setText(Html.fromHtml("0 – 4"));
        ((TextView)findViewById(R.id.tumormarkers_psa_unit)).setText(Html.fromHtml("μg/L"));

    }
}
