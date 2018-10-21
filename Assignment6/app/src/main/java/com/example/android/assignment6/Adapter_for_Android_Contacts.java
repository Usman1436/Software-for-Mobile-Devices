package com.example.android.assignment6;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Asad Ur Rehman on 10/20/2018.
 */

public class Adapter_for_Android_Contacts extends BaseAdapter {
    Context mContext;
    List<Android_Contact> mList_Android_Contacts;

    public Adapter_for_Android_Contacts(Context mContext, List<Android_Contact> mContact) {
        this.mContext = mContext;
        this.mList_Android_Contacts = mContact;
    }
    @Override
    public int getCount() {
        return mList_Android_Contacts.size();
    }

    @Override
    public Object getItem(int position) {
        return mList_Android_Contacts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=View.inflate(mContext,R.layout.custom_layout,null);
        TextView textview_contact_Name= (TextView) view.findViewById(R.id.textview_android_contact_name);
        TextView textview_contact_TelefonNr= (TextView) view.findViewById(R.id.textview_android_contact_phoneNr);
        textview_contact_Name.setText(mList_Android_Contacts.get(position).android_contact_Name);
        textview_contact_TelefonNr.setText(mList_Android_Contacts.get(position).android_contact_TelefonNr);

        view.setTag(mList_Android_Contacts.get(position).android_contact_Name);
        return view;
    }
}
