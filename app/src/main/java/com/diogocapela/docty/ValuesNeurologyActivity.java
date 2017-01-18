package com.diogocapela.docty;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class ValuesNeurologyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_values_neurology);

        // Intracranial pressure (ICP)
        ((TextView)findViewById(R.id.neurology_icp_title)).setText(Html.fromHtml("<b>Intracranial pressure (ICP)</b>"));
        ((TextView)findViewById(R.id.neurology_icp_display)).setText(Html.fromHtml("5 – 15"));
        ((TextView)findViewById(R.id.neurology_icp_unit)).setText(Html.fromHtml("mmHg"));

        // Cerebral perfusion pressure (CPP)
        ((TextView)findViewById(R.id.neurology_cpp_title)).setText(Html.fromHtml("<b>Cerebral perfusion pressure (CPP)</b>"));
        ((TextView)findViewById(R.id.neurology_cpp_display)).setText(Html.fromHtml("70 – 90"));
        ((TextView)findViewById(R.id.neurology_cpp_unit)).setText(Html.fromHtml("mmHg"));

    }
}
