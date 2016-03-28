package layout;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.echo.complaintsystem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class item_residentR_others extends Fragment {


    public item_residentR_others() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.item_resident_r, container, false);
    }

}
