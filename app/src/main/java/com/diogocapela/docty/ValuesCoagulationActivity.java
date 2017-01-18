package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesCoagulationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_coagulation);

        // Prothrombin time (PT)
        ((TextView)findViewById(R.id.coagulation_pt_title)).setText(Html.fromHtml("<b>Prothrombin time (PT)</b>"));
        ((TextView)findViewById(R.id.coagulation_pt_display)).setText(Html.fromHtml("10 – 14"));
        ((TextView)findViewById(R.id.coagulation_pt_unit)).setText(Html.fromHtml("seconds"));

        // Partial thromboplastin time (PTT)
        ((TextView)findViewById(R.id.coagulation_ptt_title)).setText(Html.fromHtml("<b>Partial thromboplastin time (PTT)</b>"));
        ((TextView)findViewById(R.id.coagulation_ptt_display)).setText(Html.fromHtml("32 – 45"));
        ((TextView)findViewById(R.id.coagulation_ptt_unit)).setText(Html.fromHtml("seconds"));

        // International normalized ratio (INR)
        ((TextView)findViewById(R.id.coagulation_inr_title)).setText(Html.fromHtml("<b>International normalized ratio (INR)</b>"));
        ((TextView)findViewById(R.id.coagulation_inr_display)).setText(Html.fromHtml("0.8 – 1.3"));
        ((TextView)findViewById(R.id.coagulation_inr_unit)).setText(Html.fromHtml(""));

        // Thrombin time (TT)
        ((TextView)findViewById(R.id.coagulation_tt_title)).setText(Html.fromHtml("<b>Thrombin time (TT)</b>"));
        ((TextView)findViewById(R.id.coagulation_tt_display)).setText(Html.fromHtml("12 – 14"));
        ((TextView)findViewById(R.id.coagulation_tt_unit)).setText(Html.fromHtml("seconds"));

        // Plasminogen (PLG)
        ((TextView)findViewById(R.id.coagulation_plg_title)).setText(Html.fromHtml("<b>Plasminogen (PLG)</b>"));
        ((TextView)findViewById(R.id.coagulation_plg_display)).setText(Html.fromHtml("<b>Adult:</b> 80 – 120<br><b>Child:</b> 80 – 120<br><b>Newborn:</b> 50 – 90"));
        ((TextView)findViewById(R.id.coagulation_plg_unit)).setText(Html.fromHtml("%"));

        // Fibrin split products (FSP)
        ((TextView)findViewById(R.id.coagulation_fsp_title)).setText(Html.fromHtml("<b>Fibrin split products (FSP)</b>"));
        ((TextView)findViewById(R.id.coagulation_fsp_display)).setText(Html.fromHtml("less than 10"));
        ((TextView)findViewById(R.id.coagulation_fsp_unit)).setText(Html.fromHtml("µg/dL"));

        // Bleeding time
        ((TextView)findViewById(R.id.coagulation_bt_title)).setText(Html.fromHtml("<b>Bleeding time</b>"));
        ((TextView)findViewById(R.id.coagulation_bt_display)).setText(Html.fromHtml("3 – 7"));
        ((TextView)findViewById(R.id.coagulation_bt_unit)).setText(Html.fromHtml("minutes"));

        // Fibrinogen
        ((TextView)findViewById(R.id.coagulation_fibri_title)).setText(Html.fromHtml("<b>Fibrinogen</b>"));
        ((TextView)findViewById(R.id.coagulation_fibri_display)).setText(Html.fromHtml("160 – 450"));
        ((TextView)findViewById(R.id.coagulation_fibri_unit)).setText(Html.fromHtml("mg/dL"));

        // Activated clotting time (ACT)
        ((TextView)findViewById(R.id.coagulation_act_title)).setText(Html.fromHtml("<b>Activated clotting time (ACT)</b>"));
        ((TextView)findViewById(R.id.coagulation_act_display)).setText(Html.fromHtml("90 – 130"));
        ((TextView)findViewById(R.id.coagulation_act_unit)).setText(Html.fromHtml("seconds"));

        // Platelets (PLT)
        ((TextView)findViewById(R.id.coagulation_plt_title)).setText(Html.fromHtml("<b>Platelets (PLT)</b>"));
        ((TextView)findViewById(R.id.coagulation_plt_display)).setText(Html.fromHtml("150 – 400"));
        ((TextView)findViewById(R.id.coagulation_plt_unit)).setText(Html.fromHtml("x 10<sup>9</sup>/L"));


    }
}
