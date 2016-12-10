package services.crm.com.mcradio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

/**
 * Created by Raul on 2/05/16.
 */
public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        WebView webView = (WebView) findViewById(R.id.webview_thirdActivity);
        webView.getSettings().setPluginState(WebSettings.PluginState.ON);
        webView.loadUrl(getResources().getString(R.string.url_irc));

    }
}
