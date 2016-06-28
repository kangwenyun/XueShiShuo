package com.se7entina.app.ui.fragment;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.se7entina.app.App;
import com.se7entina.app.R;
import com.se7entina.app.base.BaseFragment;
import com.se7entina.app.ui.activity.AboutAppActivity;
import com.se7entina.app.ui.activity.MyMessageActivity;
import com.se7entina.app.ui.activity.QuestionFeedbackActivity;
import com.se7entina.app.ui.activity.UpdateKeyActivity;
import com.se7entina.app.widgets.ToastTools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/6/28.
 */
public class UnPersonalInfoFragment extends BaseFragment {
    private ListView infoListView =null;
    private List<Map<String, Object>> listData = null;
    private SimpleAdapter adapter = null;

    @Override
    public int getLayoutId() {
        return R.layout.un_fg_personal_info;
    }

    @Override
    public void onFirst(View rootView) {

        infoListView = (ListView) getRootView().findViewById(R.id.lv_item);
        setListData();

        adapter = new SimpleAdapter(getActivity(), listData, R.layout.lv_setting_list_item,
                new String[]{"text","pic"}, new int[]{R.id.tv_system_title,R.id.iv_pic_show});

        infoListView.setAdapter(adapter);
        infoListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = null;
                switch (position){
                    case 0:
                        //我的消息
                        intent = new Intent(getActivity(), MyMessageActivity.class);
                        break;
                    case 1:
                        //修改密码
                        intent = new Intent(getActivity(), UpdateKeyActivity.class);
                        break;
                    case 2:
                        //问题反馈
                        intent = new Intent(getActivity(), QuestionFeedbackActivity.class);
                        break;
                    case 3:
                        //分享应用
                        startMarket();
                        break;
                    case 4:
                        //关于应用
                        intent = new Intent(getActivity(), AboutAppActivity.class);
                        break;

                }
                if(intent!=null){
                    startActivity(intent);
                }
            }
        });
    }

    private void setListData() {
        listData = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("text", "我的消息");
        map.put("pic", R.mipmap.my_message);
        listData.add(map);

        map = new HashMap<String, Object>();
        map.put("text", "修改密码");
        map.put("pic", R.mipmap.update_key);
        listData.add(map);

        map = new HashMap<String, Object>();
        map.put("text", "问题反馈");
        map.put("pic", R.mipmap.question_feedback);
        listData.add(map);

        map = new HashMap<String, Object>();
        map.put("text", "分享应用");
        map.put("pic",R.mipmap.share_app);
        listData.add(map);

        map = new HashMap<String, Object>();
        map.put("text", "关于应用");
        map.put("pic",R.mipmap.about_app);
        listData.add(map);

    }

    @Override
    public void onAgain(View rootView) {

    }
    public void startMarket() {
        Uri uri = Uri.parse(String.format("market://details?id=%s", App.getPackage(getActivity())));
        if (App.isIntentSafe(getActivity(), uri)) {
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            App.getContext().startActivity(intent);
        }
        // 没有安装市场
        else {
            ToastTools.show(getActivity(), R.string.settings_error_market);
        }
    }
}
