package com.se7entina.app.ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.se7entina.app.R;


/**
 * Created by Administrator on 2016/6/22.
 */
public class QuestionFeedbackActivity extends Activity implements View.OnClickListener {
    private EditText most_hint;
    private EditText QQ_hint;
    private Button submit;
    //应该是要把消息提交给后台吧
    private Editable most;//对应most_hint
    private Editable qq;//对应QQ_hint

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_feedback);
        TextView tvHead = (TextView) findViewById(R.id.tv_head);
        tvHead.setText("问题反馈");
        most_hint = (EditText)findViewById(R.id.most_hint);
        QQ_hint = (EditText)findViewById(R.id.QQ_hint);
        submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(this);
        most = most_hint.getText();
        qq = QQ_hint.getText();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.submit:
                //提交数据
                finish();
        }
    }

    public void back(View view){
        finish();
    }
}
