package com.se7entina.app.ui.adapter;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.AbsListView;

import com.se7entina.app.R;
import com.se7entina.app.base.GeneralAdapter;
import com.se7entina.app.bean.ClassBean;
import com.se7entina.app.view.ClassListShowDataView;

import java.util.List;


/**
 * Class:
 * Created by se7enTina on 2016/4/23.
 * Description:
 */
public class ClassListAdapter extends GeneralAdapter<List<ClassBean>, ClassBean> {

    public ClassListAdapter(Activity activity, List<ClassBean> list) {
        super(new ClassListShowDataView(activity,list), R.layout.ad_class_list);
    }

    @Override
    public int[] getIds() {

        return new int[]{
                R.id.iv_sex_img,
                R.id.tv_name,
                R.id.iv_sex,
                R.id.tv_price,
                R.id.iv_icon,
                R.id.tv_per
        };
    }

    @Override
    public AbsListView.LayoutParams getLayoutParams(float density) {

        return new AbsListView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
    }
}