package services.crm.com.mcradio.util;

import android.support.v7.app.AppCompatActivity;

import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import services.crm.com.mcradio.R;
import services.crm.com.mcradio.consulting.IComunicationFragment;
import services.crm.com.mcradio.consulting.IRequestService;
import services.crm.com.mcradio.model.Item;

/**
 * Created by raulvillca on 9/12/16.
 */

public class MainUtil {
    private RestAdapter adapter;
    private IRequestService service;
    private IComunicationFragment iComunication;

    public MainUtil(AppCompatActivity activity) {
        iComunication = (IComunicationFragment) activity;
        adapter = new RestAdapter.Builder()
                .setEndpoint(activity.getResources().getString(R.string.url_fake_server))
                .build();
        service = adapter.create(IRequestService.class);
    }

    public void sendRequest() {
        service.getItemRequest(new Callback<List<Item>>() {
            @Override
            public void success(List<Item> items, Response response) {
                if (items != null) {
                    iComunication.sendResponse(items);
                }
            }

            @Override
            public void failure(RetrofitError error) {
                iComunication.error(false);
            }
        });
    }
}
