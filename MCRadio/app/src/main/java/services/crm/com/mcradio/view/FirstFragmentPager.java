package services.crm.com.mcradio.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import services.crm.com.mcradio.R;
import services.crm.com.mcradio.consulting.IComunicationList;
import services.crm.com.mcradio.model.ListAdapter;
import services.crm.com.mcradio.refactory.ShareFactory;

/**
 * Created by Raul on 2/05/16.
 */
public class FirstFragmentPager extends Fragment implements IComunicationList {
    public static String TAG = "FirstFragmentPager";
    private ListView listView;

    public FirstFragmentPager() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        listView = (ListView) getActivity().findViewById(R.id.listview_fragment_first);
        listView.setAdapter(new ListAdapter((AppCompatActivity) getActivity(), ShareFactory.getList((AppCompatActivity) getActivity())));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Snackbar.make(view, "lanzar fragmento con descripcion", Snackbar.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void updateList() {
        listView.setAdapter(new ListAdapter((AppCompatActivity) getActivity(), ShareFactory.getList((AppCompatActivity) getActivity())));
    }
}
