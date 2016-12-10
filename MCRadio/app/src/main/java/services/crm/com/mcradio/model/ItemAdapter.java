package services.crm.com.mcradio.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import services.crm.com.mcradio.R;

/**
 * Created by Raul on 30/04/16.
 */
public class ItemAdapter extends BaseAdapter {

    private List<Item> list;
    private int resources;
    private LayoutInflater inflater;

    public ItemAdapter(Context context, List<Item> list) {
        this.list = list;
        this.resources = resources;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = null;
        if (view == null) {
            v = inflater.inflate(R.layout.item_list_dj, viewGroup, false);
        } else {
            v = view;
        }
        populate(v, list.get(i));
        return v;
    }

    private void populate (View view, Item item) {
        TextView title = (TextView) view.findViewById(R.id.id_item_list_broadcaster);
        TextView desc = (TextView) view.findViewById(R.id.id_item_list_schedule);
        title.setText(item.getLocutor());
        desc.setText(item.getHorario());
    }
}
