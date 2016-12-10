package services.crm.com.mcradio.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import services.crm.com.mcradio.R;

/**
 * Created by Raul on 2/05/16.
 */
public class ThirdFragmentPager extends Fragment {
    public ThirdFragmentPager() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        WebView webView = (WebView) getActivity().findViewById(R.id.webview_thirdFragment);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.loadUrl(getResources().getString(R.string.url_schedule));

    }
}
