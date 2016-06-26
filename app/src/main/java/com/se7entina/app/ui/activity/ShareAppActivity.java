package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.se7entina.app.R;


/**
 * Created by Administrator on 2016/6/23.
 */
public class ShareAppActivity extends Activity {
    private ImageView share_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.share_app);
        share_back = (ImageView)findViewById(R.id.share_back);
        share_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
