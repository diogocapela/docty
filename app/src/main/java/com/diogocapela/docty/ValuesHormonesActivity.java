package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesHormonesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_hormones);

        // 17-hydroxycorticosteroid (17-OHCS)
        ((TextView)findViewById(R.id.hormones_17ohcs_title)).setText(Html.fromHtml("<b>17-hydroxycorticosteroid (17-OHCS)</b>"));
        ((TextView)findViewById(R.id.hormones_17ohcs_display)).setText(Html.fromHtml("<b>Male:</b> 4 – 14<br><b>Female:</b> 2 – 12"));
        ((TextView)findViewById(R.id.hormones_17ohcs_unit)).setText(Html.fromHtml("mg/24h"));

        // Adrenocorticotropic hormone (ACTH)
        ((TextView)findViewById(R.id.hormones_acth_title)).setText(Html.fromHtml("<b>Adrenocorticotropic hormone (ACTH)</b>"));
        ((TextView)findViewById(R.id.hormones_acth_display)).setText(Html.fromHtml("20 – 100"));
        ((TextView)findViewById(R.id.hormones_acth_unit)).setText(Html.fromHtml("pg/mL"));

        // Alpha-fetoprotein (AFP)
        ((TextView)findViewById(R.id.hormones_afp_title)).setText(Html.fromHtml("<b>Alpha-fetoprotein (AFP)</b>"));
        ((TextView)findViewById(R.id.hormones_afp_display)).setText(Html.fromHtml("0 – 44"));
        ((TextView)findViewById(R.id.hormones_afp_unit)).setText(Html.fromHtml("ng/mL"));

        // Vasopressin (ADH)
        ((TextView)findViewById(R.id.hormones_adh_title)).setText(Html.fromHtml("<b>Vasopressin (ADH)</b>"));
        ((TextView)findViewById(R.id.hormones_adh_display)).setText(Html.fromHtml("1 – 5"));
        ((TextView)findViewById(R.id.hormones_adh_unit)).setText(Html.fromHtml("pg/mL"));

        // Calcitonin
        ((TextView)findViewById(R.id.hormones_calcitonin_title)).setText(Html.fromHtml("<b>Calcitonin</b>"));
        ((TextView)findViewById(R.id.hormones_calcitonin_display)).setText(Html.fromHtml("less than 10"));
        ((TextView)findViewById(R.id.hormones_calcitonin_unit)).setText(Html.fromHtml("pg/mL"));

        // Epinephrine (Adrenaline)
        ((TextView)findViewById(R.id.hormones_epi_title)).setText(Html.fromHtml("<b>Epinephrine (Adrenaline)</b>"));
        ((TextView)findViewById(R.id.hormones_epi_display)).setText(Html.fromHtml("0 – 900"));
        ((TextView)findViewById(R.id.hormones_epi_unit)).setText(Html.fromHtml("pg/mL"));

        // Norepinephrine (Noradrenaline)
        ((TextView)findViewById(R.id.hormones_norepi_title)).setText(Html.fromHtml("<b>Norepinephrine (Noradrenaline)</b>"));
        ((TextView)findViewById(R.id.hormones_norepi_display)).setText(Html.fromHtml("0 – 600"));
        ((TextView)findViewById(R.id.hormones_norepi_unit)).setText(Html.fromHtml("pg/mL"));

        // Cortisol
        ((TextView)findViewById(R.id.hormones_cortisol_title)).setText(Html.fromHtml("<b>Cortisol</b>"));
        ((TextView)findViewById(R.id.hormones_cortisol_display)).setText(Html.fromHtml("7 – 28 (Morning)<br>2 – 18 (Afternoon)"));
        ((TextView)findViewById(R.id.hormones_cortisol_unit)).setText(Html.fromHtml("μg/dL"));

        // Growth hormone (GH)
        ((TextView)findViewById(R.id.hormones_gh_title)).setText(Html.fromHtml("<b>Growth hormone (GH)</b>"));
        ((TextView)findViewById(R.id.hormones_gh_display)).setText(Html.fromHtml("<b>Male:</b> 1 – 9<br><b>Female:</b> 1 – 16"));
        ((TextView)findViewById(R.id.hormones_gh_unit)).setText(Html.fromHtml("ng/mL"));

        // Luteinizing hormone (LH)
        ((TextView)findViewById(R.id.hormones_lh_title)).setText(Html.fromHtml("<b>Luteinizing hormone (LH)</b>"));
        ((TextView)findViewById(R.id.hormones_lh_display)).setText(Html.fromHtml("<b>Female:</b> 3 – 14 (Follicular)"));
        ((TextView)findViewById(R.id.hormones_lh_unit)).setText(Html.fromHtml("IU/L"));

        // Parathyroid hormone (PTH)
        ((TextView)findViewById(R.id.hormones_pth_title)).setText(Html.fromHtml("<b>Parathyroid hormone (PTH)</b>"));
        ((TextView)findViewById(R.id.hormones_pth_display)).setText(Html.fromHtml("10 – 55"));
        ((TextView)findViewById(R.id.hormones_pth_unit)).setText(Html.fromHtml("pg/mL"));

        // Prolactin (PRL)
        ((TextView)findViewById(R.id.hormones_prl_title)).setText(Html.fromHtml("<b>Prolactin (PRL)</b>"));
        ((TextView)findViewById(R.id.hormones_prl_display)).setText(Html.fromHtml("0 – 14"));
        ((TextView)findViewById(R.id.hormones_prl_unit)).setText(Html.fromHtml("ng/mL"));

        // Serotonin
        ((TextView)findViewById(R.id.hormones_serot_title)).setText(Html.fromHtml("<b>Serotonin</b>"));
        ((TextView)findViewById(R.id.hormones_serot_display)).setText(Html.fromHtml("101 – 283"));
        ((TextView)findViewById(R.id.hormones_serot_unit)).setText(Html.fromHtml("ng/mL"));

        // Triiodothyronine (T3)
        ((TextView)findViewById(R.id.hormones_t3_title)).setText(Html.fromHtml("<b>Triiodothyronine (T3)</b>"));
        ((TextView)findViewById(R.id.hormones_t3_display)).setText(Html.fromHtml("100 – 200"));
        ((TextView)findViewById(R.id.hormones_t3_unit)).setText(Html.fromHtml("ng/dL"));

        // Thyroxine (T4)
        ((TextView)findViewById(R.id.hormones_t4_title)).setText(Html.fromHtml("<b>Thyroxine (T4)</b>"));
        ((TextView)findViewById(R.id.hormones_t4_display)).setText(Html.fromHtml("4.5 – 12.5"));
        ((TextView)findViewById(R.id.hormones_t4_unit)).setText(Html.fromHtml("µg/dL"));

        // Testosterone
        ((TextView)findViewById(R.id.hormones_testo_title)).setText(Html.fromHtml("<b>Testosterone</b>"));
        ((TextView)findViewById(R.id.hormones_testo_display)).setText(Html.fromHtml("<b>Male:</> 300 – 1000<br><b>Female:</b> 15 – 70"));
        ((TextView)findViewById(R.id.hormones_testo_unit)).setText(Html.fromHtml("ng/dL"));

        // Thyroid stimulating hormone (TSH)
        ((TextView)findViewById(R.id.hormones_tsh_title)).setText(Html.fromHtml("<b>Thyroid stimulating hormone (TSH)</b>"));
        ((TextView)findViewById(R.id.hormones_tsh_display)).setText(Html.fromHtml("0.5 – 4.7"));
        ((TextView)findViewById(R.id.hormones_tsh_unit)).setText(Html.fromHtml("µIU/mL"));
    }
}
