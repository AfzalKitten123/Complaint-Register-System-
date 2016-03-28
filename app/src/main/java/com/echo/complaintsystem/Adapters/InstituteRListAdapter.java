package com.echo.complaintsystem.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.echo.complaintsystem.ListItem.InstituteEntry;
import com.echo.complaintsystem.ListItem.InstituteREntry;
import com.echo.complaintsystem.R;

import java.util.List;

/**
 * Created by Afzal_Shama on 28-03-2016.
 */
public class InstituteRListAdapter extends ArrayAdapter<InstituteREntry>{
    private Activity myActivity;
    private List<InstituteREntry> instituteREntries;

    public InstituteRListAdapter(Activity myActivity, List<InstituteREntry> instituteREntries) {
        super(myActivity,R.layout.item_institute_r, instituteREntries);
        this.myActivity = myActivity;
        this.instituteREntries = instituteREntries;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myView = convertView;
        if(myView==null)
            myView=myActivity.getLayoutInflater().inflate(R.layout.item_institute,parent,false);
        InstituteREntry instituteREntry=instituteREntries.get(position);
        ((TextView)myView.findViewById(R.id.Number_tv)).setText(position);
        ((TextView)myView.findViewById(R.id.Complaint_tv)).setText(instituteREntry.getComplaint());
        ((TextView)myView.findViewById(R.id.resolveDate_tv)).setText(instituteREntry.getCreatedDate());

        return myView;
    }
}
