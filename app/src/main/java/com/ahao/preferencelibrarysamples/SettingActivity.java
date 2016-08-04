package com.ahao.preferencelibrarysamples;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ahao.preferencelibrary.AppCompatPreferenceActivity;

import java.util.List;

/**
 * Created by Avalon on 2016/8/4.
 */
public class SettingActivity extends AppCompatPreferenceActivity {

    private final String[] validFrags = new String[]{
            CommonPreferenceFragment.class.getName(),
            MDPreferenceFragment.class.getName()};


    @Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_header, target);
    }

    /** 必须包含一个id为 @android:id/list 的ListView */
    @Override
    protected int getActLayoutId() {
        return R.layout.act_setting;
    }

    @Override
    protected int getActToolbarId() {
        return R.id.tb_preference;
    }

    @Override
    protected boolean isValidFragment(String fragmentName) {
        for(String frag:validFrags){
            if(frag.equals(fragmentName)){
                return true;
            }
        }
        return false;
    }

    @Override
    protected void initToolbar(Toolbar toolbar) {
        toolbar.setTitle("设置");
        setSupportActionBar(toolbar);

        /** 写在setSupportActionBar()后，防止NavigationOnClickListener被覆盖 */
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }


    public static void startAction(Context context){
        Intent intent = new Intent(context, SettingActivity.class);
        context.startActivity(intent);
    }
}
