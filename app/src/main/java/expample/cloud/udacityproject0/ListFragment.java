package expample.cloud.udacityproject0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by cloud on 9/15/16.
 */
public class ListFragment extends android.support.v4.app.Fragment{
    public ListFragment() {

    }

    ArrayAdapter<String> mDataAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container,false);
        String[] data = {
                "POPULAR MOVIES",
                "STOCK HAWK",
                "BUILD IT BIGGER",
                "MAKE UR APP MATERIAL",
                "GO UBIQUITOUS",
                "CAPSTONE"
        };
        ArrayList<String> dataarray = new ArrayList<>(Arrays.asList(data));
        ListView listview = (ListView) rootView.findViewById(R.id.listview_apps);
        mDataAdapter = new ArrayAdapter<String>(this.getActivity(), R.layout.listview_item, R.id.itembutton, dataarray);
        listview.setAdapter(mDataAdapter);
        return rootView;
    }

}
