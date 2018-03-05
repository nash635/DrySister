package com.tianwei.hakka.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tianwei.hakka.R;

/**
 * 描述：看天气的Fragment
 *
 */

public class SubwayFragment extends Fragment {

    public static SubwayFragment newInstance() {
        return new SubwayFragment();
    }

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_subway, container,false);
    }
}
