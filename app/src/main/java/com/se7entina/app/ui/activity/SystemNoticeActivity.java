package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.se7entina.app.R;

/**
 * Created by Administrator on 2016/6/26.
 */
public class SystemNoticeActivity extends Activity {

    private TextView system_notice_time_specific_1;
    private TextView system_notice_content;
    private TextView system_notice_time_specific_2;
    private TextView system_notice_reply;
    private TextView reply_hint;
    private Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.system_notice);
        TextView tvHead = (TextView) findViewById(R.id.tv_head);
        tvHead.setText("系统通知");
        system_notice_time_specific_1 = (TextView)findViewById(R.id.system_notice_time_specific_1);
        system_notice_content = (TextView)findViewById(R.id.system_notice_content);
        system_notice_time_specific_2 = (TextView)findViewById(R.id.system_notice_time_specific_2);
        system_notice_reply = (TextView)findViewById(R.id.system_notice_reply);
        reply_hint = (TextView)findViewById(R.id.reply_hint);
        send = (Button)findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void back(View view){
        finish();
    }
}

