package com.chen.fy.wisdomscenicspot.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chen.fy.wisdomscenicspot.R;
import com.chen.fy.wisdomscenicspot.utils.UiUtils;

public class FoundFragment extends Fragment implements View.OnClickListener{

    private CardView chongqi;
    private CardView beijing;
    private CardView shanghai;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.found_fragment,container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        chongqi = view.findViewById(R.id.chongqi_cd);
        beijing = view.findViewById(R.id.beijing_cd);
        shanghai = view.findViewById(R.id.shanghai_cd);

        chongqi.setOnClickListener(this);
        beijing.setOnClickListener(this);
        shanghai.setOnClickListener(this);
    }

    @Override
    public void onResume() {
        super.onResume();

        if(getActivity()!=null) {
            UiUtils.changeStatusBarTextImgColor(getActivity(), true);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.chongqi_cd:

                break;
            case R.id.beijing_cd:
                break;
            case R.id.shanghai_cd:
                break;
        }
    }
}