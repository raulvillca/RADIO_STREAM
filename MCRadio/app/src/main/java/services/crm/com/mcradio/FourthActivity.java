package services.crm.com.mcradio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Raul on 4/05/16.
 */
public class FourthActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        TextView view = (TextView) findViewById(R.id.id_detail_broadcast);
        view.setText(savedInstanceState.getString("broadcast"));
        view = (TextView) findViewById(R.id.id_detail_country);
        view.setText(savedInstanceState.getString("country"));
        view = (TextView) findViewById(R.id.id_detail_genre);
        view.setText(savedInstanceState.getString("genre"));
        view = (TextView) findViewById(R.id.id_detail_schedule);
        view.setText(savedInstanceState.getString("schedule"));
        view = (TextView) findViewById(R.id.id_detail_song);
        view.setText(savedInstanceState.getString("song"));
        view = (TextView) findViewById(R.id.id_detail_about);
        view.setText(savedInstanceState.getString("about"));
    }
}
