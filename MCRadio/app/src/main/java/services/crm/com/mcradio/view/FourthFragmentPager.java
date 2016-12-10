package services.crm.com.mcradio.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import services.crm.com.mcradio.R;

/**
 * Created by Raul on 2/05/16.
 */
public class FourthFragmentPager extends Fragment {
    public FourthFragmentPager() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }
}
