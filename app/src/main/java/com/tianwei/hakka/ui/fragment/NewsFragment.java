package com.tianwei.hakka.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tianwei.hakka.R;

/**
 * 描述：看资讯的Fragment
 *
 */

public class NewsFragment extends Fragment {

    public static NewsFragment newInstance() {
        return new NewsFragment();
    }

    @Nullable @Override public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_news, container,false);
    }
}
