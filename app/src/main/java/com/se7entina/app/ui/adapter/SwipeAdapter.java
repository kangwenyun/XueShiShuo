package com.se7entina.app.ui.adapter;
/**
 * InfoTeacher界面里科目的适配器
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.se7entina.app.R;
import com.se7entina.app.view.SwipeItemLayout;

public class SwipeAdapter extends BaseAdapter {
	private Context mContext = null;

	public SwipeAdapter(Context context) {
		this.mContext = context;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(final int position, View contentView, ViewGroup arg2) {
		ViewHolder holder = null;
		if(contentView==null){
			holder = new ViewHolder();
			View view01 = LayoutInflater.from(mContext).inflate(R.layout.subject_teacher, null);
			View view02 = LayoutInflater.from(mContext).inflate(R.layout.delete_subject, null);
			contentView = new SwipeItemLayout(view01, view02, null, null);
			contentView.setTag(holder);
		}else{
			holder = (ViewHolder) contentView.getTag();
		}
		return contentView;
	}
	class ViewHolder{
		Button btn = null;
	}
}
