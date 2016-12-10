package services.crm.com.mcradio;

import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

import com.google.gson.Gson;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import services.crm.com.mcradio.consulting.IComunicationFragment;
import services.crm.com.mcradio.model.Item;
import services.crm.com.mcradio.refactory.ShareFactory;
import services.crm.com.mcradio.util.MainUtil;

public class MainActivity extends AppCompatActivity implements IComunicationFragment {
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.id_progress);
        final MainUtil util = new MainUtil(MainActivity.this);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                util.sendRequest();
                for (int i = 0 ; i < progressBar.getMax(); i++) {
                    progressBar.setProgress(i);
                    SystemClock.sleep(10);
                }

            }
        };
        timer.schedule(timerTask, 0L);

    }

    @Override
    public void sendResponse(List<Item> items) {
        progressBar.setProgress(progressBar.getMax());
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(getResources().getString(R.string.array_list), new Gson().toJson(items));
        startActivity(intent);
        finish();
    }

    @Override
    public void error(boolean state) {

    }
}
