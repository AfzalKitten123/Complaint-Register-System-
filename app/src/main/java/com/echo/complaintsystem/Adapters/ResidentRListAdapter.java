package com.echo.complaintsystem.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.echo.complaintsystem.ListItem.ResidentREntry;
import com.echo.complaintsystem.R;

import java.util.List;

/**
 * Created by Afzal_Shama on 27-03-2016.
 */
public class ResidentRListAdapter extends ArrayAdapter<ResidentREntry> {
    private Activity myActivity;
    private List<ResidentREntry> residentREntries;

    public ResidentRListAdapter(Context context, List<ResidentREntry> objects) {
        super(context, R.layout.item_resident_r, objects);
    }

    public void setMyActivity(Activity myActivity) {
        this.myActivity = myActivity;
    }

    public void setResidentREntries(List<ResidentREntry> residentREntries) {
        this.residentREntries = residentREntries;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View myView=convertView;
        ResidentREntry residentREntry= residentREntries.get(position);
        if(myView==null)
            myView=myActivity.getLayoutInflater().inflate(R.layout.item_resident_r, parent, false);
        ((TextView)myView.findViewById(R.id.Complaint_tv)).setText(residentREntry.getComplaint());
        ((TextView)myView.findViewById(R.id.Complaint_tv)).setText(residentREntry.getComplaint());
        ((TextView)myView.findViewById(R.id.resolveDate_tv)).setText(residentREntry.getResolvedDate());
        ((TextView)myView.findViewById(R.id.ByName_tv)).setText(residentREntry.getByName());

        return myView;
    }
}
