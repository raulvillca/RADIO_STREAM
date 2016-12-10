package services.crm.com.mcradio.model;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import services.crm.com.mcradio.view.FirstFragmentPager;
import services.crm.com.mcradio.view.FourthFragmentPager;
import services.crm.com.mcradio.view.SecondFragmentPager;
import services.crm.com.mcradio.view.ThirdFragmentPager;

/**
 * Created by Raul on 2/05/16.
 */
public class ItemPageAdapter extends FragmentStatePagerAdapter {

    public ItemPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new FirstFragmentPager();
                break;
            case 1:
                fragment = new SecondFragmentPager();
                break;
            case 2:
                fragment = new ThirdFragmentPager();
                break;
        }
        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String pageName = null;
        switch (position) {
            case 0:
                pageName = "Inicio";
                break;
            case 1:
                pageName = "DJs";
                break;
            case 2:
                pageName = "Horarios";
                break;
        }
        return pageName;
    }

    @Override
    public int getCount() {
        return 3;
    }


}
