package services.crm.com.mcradio.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.List;

import services.crm.com.mcradio.R;
import services.crm.com.mcradio.consulting.IComunicationList;
import services.crm.com.mcradio.model.FavouriteAdapter;
import services.crm.com.mcradio.model.Item;
import services.crm.com.mcradio.refactory.ShareFactory;

/**
 * Created by raulvillca on 9/12/16.
 */

public class FavouriteFragment extends Fragment implements IComunicationList {
    public static String TAG = "FavouriteFragment";
    private ListView listView;

    public FavouriteFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_favourite, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<Item> itemList = ShareFactory.getFavourite((AppCompatActivity) getActivity());

        listView = (ListView) getActivity().findViewById(R.id.listview_fragment_favourite);
        listView.setAdapter(new FavouriteAdapter((AppCompatActivity) getActivity(), itemList));

        ImageView imageView = (ImageView) getActivity().findViewById(R.id.imageButton_appbar_back);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager().popBackStackImmediate();
            }
        });
    }

    @Override
    public void updateList() {
        listView.setAdapter(new FavouriteAdapter((AppCompatActivity) getActivity(), ShareFactory.getFavourite((AppCompatActivity) getActivity())));
        ((BaseAdapter) listView.getAdapter()).notifyDataSetChanged();
    }
}
