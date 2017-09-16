package com.imooc.smartbutler.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.imooc.smartbutler.entity.WeChatData;

import java.util.List;

/**
 * Created by Administrator on 2017/8/21.
 * 项目名：      SmartButler
 * 包名：        com.imooc.smartbutler.adapter
 * 文件名：      MyAdapter
 * 描述：        TOOO
 */

public class MyAdapter extends BaseAdapter {
    private Context mContext;
    private List<WeChatData> mList;
    public MyAdapter(Context mContext, List mList){
        this.mContext = mContext;
        this.mList = mList;

    }
    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MVMViewHolder viewHolder = new MVMViewHolder();

        return null;
    }
    class MVMViewHolder{
        TextView title;
        TextView name;
        ImageView image;
    }
}

