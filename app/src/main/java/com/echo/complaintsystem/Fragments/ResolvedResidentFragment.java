package com.echo.complaintsystem.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.echo.complaintsystem.Adapters.ResidentRListAdapter;
import com.echo.complaintsystem.ListItem.ResidentREntry;
import com.echo.complaintsystem.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ResolvedResidentFragment extends Fragment {

    private ListView listView;
    private List<ResidentREntry> complaintList;

    public ResolvedResidentFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView=inflater.inflate(R.layout.fragment_resolved_resident, container, false);
        listView=(ListView)myView.findViewById(R.id.ResR_lv);

//url need to be added
        String url=" ";
        Toast.makeText(getActivity(), " Retrieving the Complaints ", Toast.LENGTH_SHORT).show();

        JsonObjectRequest jsonRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // the response is already constructed as a JSONObject!
                        try {
                            JSONArray complaintArray = response.getJSONArray("complaintArray");
                            complaintList = new ArrayList<>();
                            complaintList.add(new ResidentREntry());
                            for(int i=0;i<complaintArray.length();i++){
                                complaintList.add(new ResidentREntry(complaintArray.getJSONObject(i).getString("complaint"), complaintArray.getJSONObject(i).getString("resolved On"), complaintArray.getJSONObject(i).getString("byName")));
                            }
                            ResidentRListAdapter adapter= new ResidentRListAdapter(getActivity(),complaintList);
                            adapter.setMyActivity(getActivity());
                            adapter.setResidentREntries(complaintList);
                            listView.setAdapter(adapter);

                        } catch (JSONException e) {
                            Toast.makeText(getActivity(), "JSONObjectException:\n" + e.getMessage(), Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "ErrorResponse:\n"+error.getMessage(), Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });

        Volley.newRequestQueue(getActivity()).add(jsonRequest);


        return myView;
    }

}


