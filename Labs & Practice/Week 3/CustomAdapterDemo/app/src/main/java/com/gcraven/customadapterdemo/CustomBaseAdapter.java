package com.gcraven.customadapterdemo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

public class CustomBaseAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<Animal> data;

    public CustomBaseAdapter(Context context, ArrayList<Animal> data) {
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

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.list_item, viewGroup, false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Animal currentAnimal = data.get(i);

        viewHolder.firstTextView.setText(currentAnimal.getName());
        viewHolder.secondTextView.setText(currentAnimal.getSound());

        final String toastMessage = currentAnimal.getName() + " says " + currentAnimal.getSound();

        viewHolder.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    private class ViewHolder{
        TextView firstTextView;
        TextView secondTextView;
        Button button;

        public ViewHolder(View itemLayout){
            this.firstTextView = (TextView) itemLayout.findViewById(R.id.list_item_tv_first);
            this.secondTextView = (TextView) itemLayout.findViewById(R.id.list_item_tv_second);
            this.button = (Button) itemLayout.findViewById(R.id.list_item_button);
        }
    }

}
