package com.echo.complaintsystem.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.echo.complaintsystem.ListItem.Individual_CLEntry;
import com.echo.complaintsystem.R;

import java.util.List;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class IndividualListAdapter extends ArrayAdapter<Individual_CLEntry> {
    private Activity myActivity;
    private List<Individual_CLEntry> individual_clEntries ;

    public IndividualListAdapter(Activity myActivity, List<Individual_CLEntry> individual_clEntries) {
        super(myActivity, R.layout.item__individual__cl, individual_clEntries);
        this.myActivity = myActivity;
        this.individual_clEntries = individual_clEntries;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myView=convertView;
        if(myView==null)
            myView = myActivity.getLayoutInflater().inflate(R.layout.item__individual__cl,parent,false);
        Individual_CLEntry Individual_clEntry= individual_clEntries.get(position);
        ((TextView)myView.findViewById(R.id.Number_tv)).setText(position);
        ((TextView)myView.findViewById(R.id.Complaint_tv)).setText(Individual_clEntry.getComplaint());
        ((TextView)myView.findViewById(R.id.createdDate_tv)).setText(Individual_clEntry.getCreatedDate());

        return myView;
    }
}
