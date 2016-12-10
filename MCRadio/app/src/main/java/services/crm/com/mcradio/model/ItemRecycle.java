package services.crm.com.mcradio.model;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

import java.util.List;

import services.crm.com.mcradio.FourthActivity;
import services.crm.com.mcradio.R;

/**
 * Created by Raul on 1/05/16.
 */
public class ItemRecycle extends RecyclerView.Adapter<ItemHolder> {
    private List<Item> list;
    private Context context;

    public ItemRecycle(List<Item> list) {
        this.list = list;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_dj, parent, false);
        ItemHolder holder = new ItemHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        final Item item = list.get(position);
        holder.getTitle().setText(item.getLocutor());
        holder.getDesc().setText(item.getHorario());

        Glide.with(context).load(list.get(position).getSrc()).diskCacheStrategy(DiskCacheStrategy.ALL).crossFade().into((ImageView) holder.getImageView());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
