package com.tianwei.hakka.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.tianwei.hakka.R;
import com.tianwei.hakka.ui.fragment.AboutFragment;
import com.r0adkll.slidr.Slidr;

/**
 * 描述：关于的Activity
 *
 */

public class AboutActivity extends AppCompatActivity{

    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        Slidr.attach(this);
        initData();
        initView();
    }

    private void initData() {

    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("关于");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(view -> finish());

        getSupportFragmentManager().beginTransaction().replace(R.id.cly_root, AboutFragment.newInstance()).commit();
    }
}
