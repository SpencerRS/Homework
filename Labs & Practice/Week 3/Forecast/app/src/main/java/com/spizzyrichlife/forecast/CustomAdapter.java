package com.spizzyrichlife.forecast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by SpizzyRich on 8/16/16.
 */
public class CustomAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Forecast> data;

    public CustomAdapter(Context context, ArrayList<Forecast> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.forecast_list, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Forecast currentForecast = data.get(i);

        viewHolder.firstTextView.setText(currentForecast.getDay());
        viewHolder.secondTextView.setText(currentForecast.getHigh());
        viewHolder.thirdTextView.setText(currentForecast.getLow());
        return view;

    }

    private class ViewHolder {
        TextView firstTextView;
        TextView secondTextView;
        TextView thirdTextView;

        public ViewHolder(View itemLayout) {
            this.firstTextView = (TextView) itemLayout.findViewById(R.id.firstTextView);
            this.secondTextView = (TextView) itemLayout.findViewById(R.id.secondTextView);
            this.thirdTextView = (TextView) itemLayout.findViewById(R.id.thirdTextView);
        }
    }
}
