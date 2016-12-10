package services.crm.com.mcradio.consulting;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import services.crm.com.mcradio.model.Item;

/**
 * Created by raulvillca on 9/12/16.
 */

public interface IRequestService {
    @GET("/api/json/get/bHoHKtwqcy?indent=2")
    public void getItemRequest(Callback<List<Item>> callback);
}
