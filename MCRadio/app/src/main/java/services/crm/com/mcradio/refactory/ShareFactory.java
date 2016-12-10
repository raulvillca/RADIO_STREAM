package services.crm.com.mcradio.refactory;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import services.crm.com.mcradio.MainActivity;
import services.crm.com.mcradio.R;
import services.crm.com.mcradio.model.Item;

import static android.R.attr.process;
import static android.R.attr.type;

/**
 * Created by raulvillca on 9/12/16.
 */

public class ShareFactory {
    public static List<Item> getFavourite(AppCompatActivity activity) {
        SharedPreferences preferences = activity.getPreferences(MainActivity.MODE_PRIVATE);

        String jsonString = preferences.getString(activity.getResources().getString(R.string.array_list), null);

        if ( jsonString != null) {

            List<Item> items = (List<Item>) new Gson().fromJson(jsonString, new TypeToken<List<Item>>() {}.getType());
            List<Item> favourites = new ArrayList<>();

            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).isFavourite() == true) favourites.add(items.get(i));
            }

            return favourites;
        }

        return new ArrayList<Item>();
    }

    public static void setList(AppCompatActivity activity, List<Item> list) {
        SharedPreferences preferences = activity.getPreferences(MainActivity.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        String jsonString = new Gson().toJson(list);
        editor.putString(activity.getResources().getString(R.string.array_list), jsonString);
        editor.commit();
    }

    public static void setList(AppCompatActivity activity, int id, boolean value) {
        SharedPreferences preferences = activity.getPreferences(MainActivity.MODE_PRIVATE);
        List<Item> items = (List<Item>) new Gson().fromJson(preferences.getString(
                activity.getResources().getString(R.string.array_list), null),
                new TypeToken<List<Item>>() {}.getType());

        if (items.size() != 0) {
            //buscamos el item favorito y le cambiamos el estado
            SharedPreferences.Editor editor = preferences.edit();

            for (int i = 0; i < items.size(); i++) {
                if (items.get(i).getId() == id) {
                    items.get(i).setFavourite(value);
                }
            }

            String jsonString = new Gson().toJson(items);
            editor.putString(activity.getResources().getString(R.string.array_list), jsonString);
            editor.commit();
        }

    }

    public static List<Item> getList(AppCompatActivity activity) {
        SharedPreferences preferences = activity.getPreferences(MainActivity.MODE_PRIVATE);

        String jsonString = preferences.getString(activity.getResources().getString(R.string.array_list), null);

        if ( jsonString != null) {

            List<Item> items = (List<Item>) new Gson().fromJson(jsonString, new TypeToken<List<Item>>() {}.getType());
            return items;
        }

        return new ArrayList<Item>();
    }

    public static void setList(AppCompatActivity activity, String list) {
        SharedPreferences preferences = activity.getPreferences(MainActivity.MODE_PRIVATE);

        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(activity.getResources().getString(R.string.array_list), list);
        editor.commit();
    }
}
