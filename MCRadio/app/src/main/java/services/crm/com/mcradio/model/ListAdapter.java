package services.crm.com.mcradio.model;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import services.crm.com.mcradio.R;
import services.crm.com.mcradio.consulting.IComunicationList;
import services.crm.com.mcradio.refactory.ShareFactory;

/**
 * Created by raulvillca on 10/12/16.
 */

public class ListAdapter extends BaseAdapter {
    private List<Item> items;
    private AppCompatActivity activity;

    public ListAdapter(AppCompatActivity context, List<Item> items) {
        this.items = items;
        this.activity = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View v = null;

        if (view != null) {
            v = view;
        } else {
            v = LayoutInflater.from(activity).inflate(R.layout.item_card, viewGroup, false);
        }

        TextView title = (TextView) v.findViewById(R.id.id_item_card_broadcast);
        TextView subtitle = (TextView) v.findViewById(R.id.id_item_card_schedule);
        final CheckBox checkBox = (CheckBox) v.findViewById(R.id.id_item_card_star);
        ImageView imageView = (ImageView) v.findViewById(R.id.id_item_card_image);

        Item item = items.get(i);
        title.setText(item.getLocutor());
        subtitle.setText(item.getHorario());
        checkBox.setChecked(items.get(i).isFavourite());
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                items.get(i).setFavourite(checkBox.isChecked());
                ShareFactory.setList(activity, items);
            }
        });

        Glide.with(activity).load(items.get(i).getSrc()).diskCacheStrategy(DiskCacheStrategy.ALL).into(imageView);
        return v;
    }
}
