package com.echo.complaintsystem.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.echo.complaintsystem.ListItem.IndividualR_CLEntry;
import com.echo.complaintsystem.ListItem.Individual_CLEntry;
import com.echo.complaintsystem.R;

import java.util.List;

/**
 * Created by Afzal_Shama on 28-03-2016.
 */
public class IndividualRListAdapter extends ArrayAdapter<IndividualR_CLEntry> {
    private Activity myActivity;
    private List<IndividualR_CLEntry> individualR_clEntries;

    public IndividualRListAdapter(Activity myActivity, List<IndividualR_CLEntry> individualR_clEntries) {
        super(myActivity, R.layout.item_individual_r, individualR_clEntries);
        this.myActivity = myActivity;
        this.individualR_clEntries = individualR_clEntries;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myView=convertView;
        if(myView==null)
            myView=myActivity.getLayoutInflater().inflate(R.layout.item_individual_r,parent,false);
        IndividualR_CLEntry individualR_clEntry=individualR_clEntries.get(position);
        ((TextView)myView.findViewById(R.id.Number_tv)).setText(position);
        ((TextView)myView.findViewById(R.id.Complaint_tv)).setText(individualR_clEntry.getComplaint());
        ((TextView)myView.findViewById(R.id.createdDate_tv)).setText(individualR_clEntry.getResolvedDate());

        return myView;
    }
}
