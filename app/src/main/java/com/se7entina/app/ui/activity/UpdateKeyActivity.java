package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.se7entina.app.R;


/**
 * Created by Administrator on 2016/6/23.
 */
public class UpdateKeyActivity extends Activity {
    private EditText old_key;
    private EditText new_key;
    private EditText new_key_again;
    private Button confirm;
    private Editable _old_key;
    private Editable _new_key;
    private Editable _new_key_again;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.update_key);
        old_key = (EditText)findViewById(R.id.old_key);
        new_key = (EditText)findViewById(R.id.new_key);
        new_key_again = (EditText)findViewById(R.id.new_key_again);
        confirm = (Button)findViewById(R.id.confirm);
        _old_key = old_key.getText();
        _new_key = new_key.getText();
        _new_key_again = new_key_again.getText();
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //提交数据
                Toast.makeText(UpdateKeyActivity.this,"更新成功",Toast.LENGTH_SHORT).show();
                finish();//返回
            }
        });
    }
}
