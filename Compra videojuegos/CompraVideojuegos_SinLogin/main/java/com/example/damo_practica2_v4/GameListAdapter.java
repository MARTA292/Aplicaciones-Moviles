package com.example.damo_practica2_v4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GameListAdapter extends ArrayAdapter<Game> {
    public GameListAdapter(Context context, ArrayList<Game> data) {
        super(context, 0, data);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Game data = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.layout_simple_item, parent, false);
        }
        ImageView game_img = (ImageView) convertView.findViewById(R.id.image);
        TextView game_name = (TextView) convertView.findViewById(R.id.name);
        TextView game_company = (TextView) convertView.findViewById(R.id.company);
        game_img.setImageResource(data.image);
        game_name.setText(data.name);
        game_company.setText(data.company);
        return convertView;
    }
}
