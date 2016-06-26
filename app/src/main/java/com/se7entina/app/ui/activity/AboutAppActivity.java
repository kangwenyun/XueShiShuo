package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.se7entina.app.R;

/**
 * Created by Administrator on 2016/6/25.
 */
public class AboutAppActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);
        TextView tvTitle = (TextView) findViewById(R.id.tv_head);
        tvTitle.setText("关于应用");
    }

    public void back(View view){
        finish();
    }
}
