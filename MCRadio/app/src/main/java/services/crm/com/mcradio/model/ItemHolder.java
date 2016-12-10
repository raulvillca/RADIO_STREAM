package services.crm.com.mcradio.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import services.crm.com.mcradio.R;

/**
 * Created by Raul on 1/05/16.
 */
public class ItemHolder extends RecyclerView.ViewHolder {
    private TextView title;
    private TextView desc;
    private ImageView imageView;

    public ItemHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.id_item_list_broadcaster);
        desc = (TextView) itemView.findViewById(R.id.id_item_list_schedule);
        imageView = (ImageView) itemView.findViewById(R.id.id_item_list_image);
    }

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getDesc() {
        return desc;
    }

    public void setDesc(TextView desc) {
        this.desc = desc;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }
}
