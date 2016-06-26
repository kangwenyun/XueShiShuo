package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.se7entina.app.R;

/**
 * Created by Administrator on 2016/6/25.
 */
public class MyMessageActivity extends Activity {
    private LinearLayout system_notice_colume;
    private TextView singleline_text;
    private TextView system_notice_time;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        system_notice_colume = (LinearLayout)findViewById(R.id.system_notice_colume);
        singleline_text = (TextView)findViewById(R.id.singleline_text);
        system_notice_time = (TextView)findViewById(R.id.system_notice_time);
        system_notice_colume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyMessageActivity.this,SystemNoticeActivity.class);
                startActivity(intent);
            }
        });
    }
}
