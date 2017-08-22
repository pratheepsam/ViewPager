package com.tabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by sysadmin on 22/8/17.
 */

public class FirstFragment extends Fragment {
    private String title;
    private int page;
    public static FirstFragment newInstance(int page,String title){
        FirstFragment fragment = new FirstFragment();
        Bundle arg = new Bundle();
        arg.putInt("somepage",page);
        arg.putString("sometitle",title);
        fragment.setArguments(arg);
        return fragment;

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("somepage",0);
        title = getArguments().getString("sometitle");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.first_fragment,container,false);
        TextView textView = (TextView) layout.findViewById(R.id.title);
        textView.setText(page + "----" +title);
        return layout;
    }
}
