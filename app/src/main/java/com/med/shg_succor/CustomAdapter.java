package com.med.shg_succor;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<CustomsItems> {

    public CustomAdapter(@NonNull Context context, ArrayList<CustomsItems> customList) {
        super(context, 0, customList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return customView(position, convertView, parent);
    }

    private View customView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_spinner_layout, parent, false);
        }

        ImageView spinnerImage = convertView.findViewById(R.id.ivCustomSpinner);
        TextView spinnername = convertView.findViewById(R.id.tvCustomSpinner);

        CustomsItems currentItems = getItem(position);
        if (currentItems != null) {
          //  spinnerImage.setImageResource(currentItems.getSpinnerImage());
        //    spinnername.setText(currentItems.getSpinnerText());
        }

        return convertView;

    }
}