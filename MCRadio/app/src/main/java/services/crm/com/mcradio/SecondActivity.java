package services.crm.com.mcradio;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.io.IOException;

import services.crm.com.mcradio.consulting.IComunicationList;
import services.crm.com.mcradio.model.ItemPageAdapter;
import services.crm.com.mcradio.refactory.ShareFactory;
import services.crm.com.mcradio.view.FavouriteFragment;
import services.crm.com.mcradio.view.FirstFragmentPager;
import services.crm.com.mcradio.view.TableFragment;

/**
 * Created by Raul on 29/04/16.
 */
public class SecondActivity extends AppCompatActivity implements IComunicationList {
    MediaPlayer player;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        prepare();

        String s = getIntent().getStringExtra(getResources().getString(R.string.array_list));
        //solo cargamos una sola vez la lista
        if ( ! getPreferences(SecondActivity.MODE_PRIVATE).getBoolean("save", false)) {
            ShareFactory.setList(SecondActivity.this, s);
            getPreferences(SecondActivity.MODE_PRIVATE)
                    .edit()
                    .putBoolean("save", true)
                    .commit();
        }

        ListView listView = (ListView) findViewById(R.id.id_listdrawer);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Log.e("Accionar","logs");

                        Snackbar.make(view, "No hay accion para esta opcion", Snackbar.LENGTH_LONG).show();
                        Log.e("Accionar","logs");
                        break;
                    case 1:
                        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                        startActivity(intent);
                        Toast.makeText(SecondActivity.this, getResources().getString(R.string.message_irc), Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Log.e("Accionar","logs");
                        Snackbar.make(view, "No hay accion para esta opcion", Snackbar.LENGTH_LONG).show();
                        Log.e("Accionar","logs");

                        break;
                    case 3:
                        Snackbar.make(view, getResources().getString(R.string.message_mcradio), Snackbar.LENGTH_LONG).show();
                        Log.e("Accionar","logs");
                        player.start();
                        break;
                    case 4:
                        Log.e("Accionar","logs");
                        FavouriteFragment favouriteFragment = (FavouriteFragment) getSupportFragmentManager().findFragmentByTag(FavouriteFragment.TAG);

                        if (favouriteFragment == null) {
                            getSupportFragmentManager().beginTransaction()
                                    .addToBackStack(null)
                                    .add(R.id.root_coordinator, new FavouriteFragment(), FavouriteFragment.TAG)
                                    .commit();
                        }
                        break;
                }
                closeOptionsMenu();
            }
        });

        getSupportFragmentManager().beginTransaction()
                .add(R.id.root_coordinator, new TableFragment(), TableFragment.TAG)
                .commit();
    }

    public void prepare() {
        player = new MediaPlayer();
        player.setAudioStreamType(AudioManager.STREAM_MUSIC);

        try {
            player.setDataSource(getResources().getString(R.string.url_server_music));
            player.prepare();
        } catch (IllegalStateException e) {
            Toast.makeText(getApplicationContext(), "Problemas con le URI", Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            Toast.makeText(getApplicationContext(), "Problemas con la URI", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        player.stop();
    }

    @Override
    public void updateList() {
        FavouriteFragment favouriteFragment = (FavouriteFragment) getSupportFragmentManager().findFragmentByTag(FavouriteFragment.TAG);

        if (favouriteFragment != null && favouriteFragment.isVisible()) {
            favouriteFragment.updateList();
        }

        TableFragment tableFragment = (TableFragment) getSupportFragmentManager().findFragmentByTag(TableFragment.TAG);

        if (tableFragment != null) {
            tableFragment.updateList();
        }
    }
}
