package com.bobo.beijingnews.pager;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

import com.bobo.beijingnews.base.BasePager;
import com.bobo.beijingnews.utils.LogUtil;

/**
 * Created by 求知自学网 on 20设置中心9/7/20. Copyright © Leon. All rights reserved.
 * Functions: 设置中心
 */
public class SettingPager extends BasePager {

    public SettingPager(Context context) {
        super(context);
    }

    @Override
    public void initData() {
        super.initData();

        LogUtil.e("设置中心数据被加载了");

        //设置中心.设置标题
        tv_title.setText("设置中心");

        //2.联网请求，得到数据，创建视图
        TextView textView = new TextView(context);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        textView.setTextSize(25);

        //3.把子视图添加到BasePager的FrameLayout中
        fl_content.addView(textView);

        //4.绑定数据
        textView.setText("设置中心内容");
    }
}
