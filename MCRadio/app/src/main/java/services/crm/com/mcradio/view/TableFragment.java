package services.crm.com.mcradio.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import services.crm.com.mcradio.R;
import services.crm.com.mcradio.model.ItemPageAdapter;
import services.crm.com.mcradio.refactory.ShareFactory;

/**
 * Created by raulvillca on 10/12/16.
 */

public class TableFragment extends Fragment {
    public static String TAG = "TableFragment";
    private ViewPager pager;

    public TableFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_table, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        //pedimos la taba y las paginas para crear el adapter
        FragmentManager manager = getFragmentManager();
        ItemPageAdapter adapter = new ItemPageAdapter(manager);
        pager = (ViewPager) getActivity().findViewById(R.id.id_viewPager);
        pager.setAdapter(adapter);
        TabLayout tabLayout = (TabLayout) getActivity().findViewById(R.id.id_tablayout);
        tabLayout.setupWithViewPager(pager);
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    public void updateList() {
        Fragment fragment = (Fragment) pager.getAdapter().instantiateItem(pager, 0);
        if (fragment != null && fragment.isAdded()) {
            if (fragment instanceof FirstFragmentPager) {
                FirstFragmentPager filterFragment = (FirstFragmentPager) fragment;
                filterFragment.updateList();
            }
        }
    }
}
