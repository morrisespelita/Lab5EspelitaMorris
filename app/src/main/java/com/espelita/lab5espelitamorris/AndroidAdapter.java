package com.espelita.lab5espelitamorris;

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

public class AndroidAdapter extends ArrayAdapter<Companies> {

    private Context context;
    private int resource;

    public AndroidAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Companies> objects){
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int i, @Nullable View convertView, @NonNull ViewGroup parent){
        int logo = getItem(i).getLogo();
        String cName = getItem(i).getCompanyName();
        String cCountry = getItem(i).getCompanyCountry();
        String cCEO = getItem(i).getCompanyCEO();
        String cIndustry = getItem(i).getCompanyIndustry();

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource, parent, false);
        ImageView img = convertView.findViewById(R.id.ivLogo);
        TextView companyName = convertView.findViewById(R.id.tvName);
        TextView companyCountry = convertView.findViewById(R.id.tvCountry);
        TextView companyCEO = convertView.findViewById(R.id.tvCEO);
        TextView companyIndustry = convertView.findViewById(R.id.tvIndustry);

        img.setImageResource(logo);
        companyName.setText(cName);
        companyCountry.setText("Country: " + cCountry);
        companyIndustry.setText("Industry: " + cIndustry);
        companyCEO.setText("CEO: " + cCEO);

        return convertView;
    }
}