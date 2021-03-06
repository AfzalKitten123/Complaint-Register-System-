package com.echo.complaintsystem.Activities;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.echo.complaintsystem.Fragments.ResolvedIndividualFragment;
import com.echo.complaintsystem.Fragments.UnresolvedIndividualFragment;
import com.echo.complaintsystem.R;

public class MainIndividualFragment extends Fragment {

    private FragmentTabHost myTabHost;

    public MainIndividualFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_resident, container, false);
        myTabHost = (FragmentTabHost) rootView.findViewById(android.R.id.tabhost);

        myTabHost.setup(getActivity(), getChildFragmentManager(), android.R.id.tabcontent);
        myTabHost.addTab(myTabHost.newTabSpec("tab1").setIndicator("UnResolved"), UnresolvedIndividualFragment.class, null);
        myTabHost.addTab(myTabHost.newTabSpec("tab2").setIndicator("Resolved"), ResolvedIndividualFragment.class, null);

        return rootView;
    }
}