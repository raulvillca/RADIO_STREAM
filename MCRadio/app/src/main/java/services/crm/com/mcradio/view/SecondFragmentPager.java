package services.crm.com.mcradio.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import services.crm.com.mcradio.R;
import services.crm.com.mcradio.model.ItemRecycle;
import services.crm.com.mcradio.refactory.ItemFactory;
import services.crm.com.mcradio.refactory.ShareFactory;

/**
 * Created by Raul on 2/05/16.
 */
public class SecondFragmentPager extends Fragment {
    public SecondFragmentPager() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RecyclerView list = (RecyclerView) getActivity().findViewById(R.id.id_fragment_recycle);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        list.setLayoutManager(llm);
        list.setAdapter(new ItemRecycle(ShareFactory.getList((AppCompatActivity) getActivity())));
    }
}
