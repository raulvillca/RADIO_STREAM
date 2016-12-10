package services.crm.com.mcradio.consulting;

import java.util.List;

import services.crm.com.mcradio.model.Item;

/**
 * Created by raulvillca on 9/12/16.
 */

public interface IComunicationFragment {
    public void sendResponse(List<Item> items);
    public void error(boolean state);
}
