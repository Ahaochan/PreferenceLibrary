package com.ahao.preferencelibrarysamples;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Avalon on 2016/8/3.
 */
public class MDPreferenceFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference_common);
    }
}
