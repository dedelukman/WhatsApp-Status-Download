package com.abahstudio.status.Activity;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.abahstudio.status.R;
import com.abahstudio.status.Util.Method;
import com.google.android.material.appbar.MaterialToolbar;


public class PrivacyPolicy extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

        Method method = new Method(PrivacyPolicy.this);
        method.forceRTLIfSupported();

        MaterialToolbar toolbar = findViewById(R.id.toolbar_privacy_policy);
        toolbar.setTitle(getResources().getString(R.string.privacy_policy));
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

//        TextView privacyPolicyTextView = findViewById(R.id.textView_privacy_policy);
//        privacyPolicyTextView.setText(Html.fromHtml(getString(R.string.privacy_policy_html)));
//        privacyPolicyTextView.setMovementMethod(LinkMovementMethod.getInstance());


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
