package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesGastrointestinalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_gastrointestinal);

        // Albumin
        ((TextView)findViewById(R.id.gastrointestinal_alb_title)).setText(Html.fromHtml("<b>Albumin</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_alb_display)).setText(Html.fromHtml("35 – 50"));
        ((TextView)findViewById(R.id.gastrointestinal_alb_unit)).setText(Html.fromHtml("g/L"));

        // Alkaline phosphatase (ALP)
        ((TextView)findViewById(R.id.gastrointestinal_alp_title)).setText(Html.fromHtml("<b>Alkaline phosphatase (ALP)</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_alp_display)).setText(Html.fromHtml("50 – 100"));
        ((TextView)findViewById(R.id.gastrointestinal_alp_unit)).setText(Html.fromHtml("IU/L"));

        // Amylase
        ((TextView)findViewById(R.id.gastrointestinal_amy_title)).setText(Html.fromHtml("<b>Amylase</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_amy_display)).setText(Html.fromHtml("30 – 125"));
        ((TextView)findViewById(R.id.gastrointestinal_amy_unit)).setText(Html.fromHtml("IU/L"));

        // Alanine aminotransferase (ALT)
        ((TextView)findViewById(R.id.gastrointestinal_alt_title)).setText(Html.fromHtml("<b>Alanine aminotransferase (ALT)</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_alt_display)).setText(Html.fromHtml("5 – 30"));
        ((TextView)findViewById(R.id.gastrointestinal_alt_unit)).setText(Html.fromHtml("IU/L"));

        // Aspartate aminotransferase (AST)
        ((TextView)findViewById(R.id.gastrointestinal_ast_title)).setText(Html.fromHtml("<b>Aspartate aminotransferase (AST)</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_ast_display)).setText(Html.fromHtml("5 – 30"));
        ((TextView)findViewById(R.id.gastrointestinal_ast_unit)).setText(Html.fromHtml("IU/L"));

        // Direct bilirubin
        ((TextView)findViewById(R.id.gastrointestinal_dbir_title)).setText(Html.fromHtml("<b>Direct bilirubin</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_dbir_display)).setText(Html.fromHtml("0 – 0.3"));
        ((TextView)findViewById(R.id.gastrointestinal_dbir_unit)).setText(Html.fromHtml("mg/dL"));

        // Total bilirubin
        ((TextView)findViewById(R.id.gastrointestinal_tbir_title)).setText(Html.fromHtml("<b>Total bilirubin</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_tbir_display)).setText(Html.fromHtml("0.3 – 1.9"));
        ((TextView)findViewById(R.id.gastrointestinal_tbir_unit)).setText(Html.fromHtml("mg/dL"));

        // Gamma-glutamyltransferase (GGT)
        ((TextView)findViewById(R.id.gastrointestinal_ggt_title)).setText(Html.fromHtml("<b>Gamma-glutamyltransferase (GGT)</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_ggt_display)).setText(Html.fromHtml("6 – 50"));
        ((TextView)findViewById(R.id.gastrointestinal_ggt_unit)).setText(Html.fromHtml("IU/L"));

        // Lipase
        ((TextView)findViewById(R.id.gastrointestinal_lip_title)).setText(Html.fromHtml("<b>Lipase</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_lip_display)).setText(Html.fromHtml("10 – 150"));
        ((TextView)findViewById(R.id.gastrointestinal_lip_unit)).setText(Html.fromHtml("IU/L"));

        // Total protein
        ((TextView)findViewById(R.id.gastrointestinal_prot_title)).setText(Html.fromHtml("<b>Total protein</b>"));
        ((TextView)findViewById(R.id.gastrointestinal_prot_display)).setText(Html.fromHtml("60 – 80"));
        ((TextView)findViewById(R.id.gastrointestinal_prot_unit)).setText(Html.fromHtml("g/L"));

    }
}
