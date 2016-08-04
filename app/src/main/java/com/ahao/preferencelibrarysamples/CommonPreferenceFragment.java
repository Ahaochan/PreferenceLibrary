package com.ahao.preferencelibrarysamples;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Avalon on 2016/8/3.
 */
public class CommonPreferenceFragment extends PreferenceFragment {
    private static final String TAG = CommonPreferenceFragment.class.getSimpleName();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_common);
    }
}
