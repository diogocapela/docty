package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesHematologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_hematology);

        // Total red blood cells (RBC)
        ((TextView)findViewById(R.id.hematology_rbc_title)).setText(Html.fromHtml("<b>Total red blood cells (RBC)</b>"));
        ((TextView)findViewById(R.id.hematology_rbc_display)).setText(Html.fromHtml("<b>Male:</b> 4.2 – 5.6<br><b>Female:</b> 3.8 – 5.1<br><b>Child:</b> 3.5 – 5.0"));
        ((TextView)findViewById(R.id.hematology_rbc_unit)).setText(Html.fromHtml("x 10<sup>12</sup>/L"));

        // Hemoglobin (HgB)
        ((TextView)findViewById(R.id.hematology_hgb_title)).setText(Html.fromHtml("<b>Hemoglobin (HgB)</b>"));
        ((TextView)findViewById(R.id.hematology_hgb_display)).setText(Html.fromHtml("<b>Male:</b> 14 – 18<br><b>Female:</b> 11 – 16<br><b>Child:</b> 10 – 14<br><b>Newborn:</b> 15 – 25"));
        ((TextView)findViewById(R.id.hematology_hgb_unit)).setText(Html.fromHtml("g/dL"));

        // Hematocrit (Hct)
        ((TextView)findViewById(R.id.hematology_hct_title)).setText(Html.fromHtml("<b>Hematocrit (Hct)</b>"));
        ((TextView)findViewById(R.id.hematology_hct_display)).setText(Html.fromHtml("<b>Male:</b> 39 – 54<br><b>Female:</b> 34 – 47<br><b>Child:</b> 30 – 42"));
        ((TextView)findViewById(R.id.hematology_hct_unit)).setText(Html.fromHtml("%"));

        // Mean corpuscular volume (MCV)
        ((TextView)findViewById(R.id.hematology_mcv_title)).setText(Html.fromHtml("<b>Mean corpuscular volume (MCV)</b>"));
        ((TextView)findViewById(R.id.hematology_mcv_display)).setText(Html.fromHtml("76 – 96"));
        ((TextView)findViewById(R.id.hematology_mcv_unit)).setText(Html.fromHtml("fL"));

        // Mean corpuscular hemoglobin (MCH)
        ((TextView)findViewById(R.id.hematology_mch_title)).setText(Html.fromHtml("<b>Mean corpuscular hemoglobin (MCH)</b>"));
        ((TextView)findViewById(R.id.hematology_mch_display)).setText(Html.fromHtml("27 – 35"));
        ((TextView)findViewById(R.id.hematology_mch_unit)).setText(Html.fromHtml("pg"));

        // Mean corpuscular hemoglobin concentration (MCHC)
        ((TextView)findViewById(R.id.hematology_mchc_title)).setText(Html.fromHtml("<b>Mean corpuscular hemoglobin concentration (MCHC)</b>"));
        ((TextView)findViewById(R.id.hematology_mchc_display)).setText(Html.fromHtml("31 – 37"));
        ((TextView)findViewById(R.id.hematology_mchc_unit)).setText(Html.fromHtml("%"));

        // Reticulocytes (RET)
        ((TextView)findViewById(R.id.hematology_ret_title)).setText(Html.fromHtml("<b>Reticulocytes (RET)</b>"));
        ((TextView)findViewById(R.id.hematology_ret_display)).setText(Html.fromHtml("<b>Adult:</b> 0.5 – 1.5<br><b>Child:</b> 0.5 – 3.1<br><b>Newborn:</b> 1.1 – 4.5"));
        ((TextView)findViewById(R.id.hematology_ret_unit)).setText(Html.fromHtml("%"));

        // Total white blood cells (WBC)
        ((TextView)findViewById(R.id.hematology_wbc_title)).setText(Html.fromHtml("<b>Total white blood cells (WBC)</b>"));
        ((TextView)findViewById(R.id.hematology_wbc_display)).setText(Html.fromHtml("<b>Adult:</b> 3.8 – 11<br><b>Child:</b> 5 – 10<br><br><b>Neutrophils:</b> 50 – 81 %<br><b>Lymphocytes:</b> 14 – 44 %<br><b>Monocytes:</b> 2 – 6 %<br><b>Eosinophils:</b> 1 – 5 %<br><b>Basophils:</b> 0 – 1 %<br>"));
        ((TextView)findViewById(R.id.hematology_wbc_unit)).setText(Html.fromHtml("x 10<sup>9</sup>/L"));

        // Platelets (PLT)
        ((TextView)findViewById(R.id.hematology_plt_title)).setText(Html.fromHtml("<b>Platelets (PLT)</b>"));
        ((TextView)findViewById(R.id.hematology_plt_display)).setText(Html.fromHtml("150 – 400"));
        ((TextView)findViewById(R.id.hematology_plt_unit)).setText(Html.fromHtml("x 10<sup>9</sup>/L"));

    }
}
