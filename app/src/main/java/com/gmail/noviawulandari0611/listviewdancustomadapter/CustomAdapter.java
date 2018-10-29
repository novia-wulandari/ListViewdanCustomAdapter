package com.gmail.noviawulandari0611.listviewdancustomadapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String Item[];
    String SubItem[];
    int flags[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] Item, String[] SubItem , int[] flags) {
        this.context = context;
        this.Item = Item;
        this.SubItem = SubItem;
        this.flags = flags;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return Item.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_list_item, null);
        TextView item = (TextView) view.findViewById(R.id.item);
        TextView subitem = (TextView) view.findViewById(R.id.subitem);
        ImageView image = (ImageView) view.findViewById(R.id.image);
        item.setText(Item[i]);
        subitem.setText(SubItem[i]);
        image.setImageResource(flags[i]);
        return view;
    }
}




