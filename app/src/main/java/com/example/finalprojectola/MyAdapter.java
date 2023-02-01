package com.example.finalprojectola;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContacttViewHolder> {

    ArrayList<contact>contacts;
    public MyAdapter(ArrayList<contact> contacts) {
        this.contacts = contacts;
    }



    @NonNull
    @Override
    //1- The function is called only once when the element appears on the screen && nflate design ,creat holder ,return viewholder in order to function after him it installs items on it
    public ContacttViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //inflate design Cat_custom_item && save in viewholder && return viewholder
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.for_adapter,null,false);
        ContacttViewHolder viewHolder=new ContacttViewHolder(v);
        return viewHolder;
    }

    @Override
    //2- take catviewholder and return null not anything
    public void onBindViewHolder(@NonNull ContacttViewHolder holder, int position) {
        contact c=contacts.get(position);
        holder.iv_image.setImageResource(c.getImage());
        holder.tv_name.setText(c.getName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }
    // Holder class for Recycler View
    class ContacttViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name;
        TextView tv_no;
        ImageView iv_image;
        public ContacttViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name=itemView.findViewById(R.id.name);
            tv_no=itemView.findViewById(R.id.number);
            iv_image=itemView.findViewById(R.id.image);
        }
    }
}
























//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.Filter;
//import android.widget.Filterable;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.ArrayList;
//import java.util.Locale;
//
//
//public class MyAdapter extends BaseAdapter implements Filterable {
//    Context context;
//    ArrayList<contact> contacts;
//    ArrayList<contact> contactsCopy;
//    public MyAdapter(Context context, ArrayList<contact> contacts){
//        this.contacts=contacts;
//        this.contactsCopy=contacts;
//        this.context=context;
//
//    }
//    @Override
//    public int getCount() {
//        return contacts.size();
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return contacts.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertedView, ViewGroup parent) {
//        View myView=null;
//        if (convertedView==null) {
//            LayoutInflater layoutInflater = LayoutInflater.from(context);
//            myView = layoutInflater.inflate(R.layout.for_adapter, parent, false);
//            ViewHolder vh=new ViewHolder();
//            vh.no = myView.findViewById(R.id.number);
//            vh.name = myView.findViewById(R.id.name);
//            vh.image = myView.findViewById(R.id.image);
//            myView.setTag(vh);
//        } else myView=convertedView;
//        contact c=contacts.get(position);
//        ViewHolder vh=(ViewHolder) myView.getTag();
//        vh.no.setText(c.getNo()+"");
//        vh.name.setText(c.getName());
//        vh.image.setImageResource(c.getImage());
//        return myView;
//    }
//
//    @Override
//    public Filter getFilter() {
//        Filter myFilter=new Filter() {
//
//            FilterResults fs=new FilterResults();
//
//            @Override
//            protected FilterResults performFiltering(CharSequence text) {
//                ArrayList<contact> temp=new ArrayList<contact>();
//                if(text.toString()!=null || !text.toString().equals("")) {
//                    for (int i = 0; i < contactsCopy.size(); i++) {
//                        contact c = contacts.get(i);
//                        String strno=c.getNo()+"";
//                        if (strno.contains(text.toString())|| c.getName().toLowerCase().contains(text.toString().toLowerCase())) {
//                            temp.add(c);
//                        }
//                    }
//                }
//                fs.values=temp;
//                fs.count=temp.size();
//                return fs;
//            }
//
//            @Override
//            protected void publishResults(CharSequence constraint, FilterResults results) {
//                contacts=(ArrayList<contact>) results.values;
//                notifyDataSetChanged();
//            }
//        };
//        return myFilter;
//    }
//
//    class ViewHolder {
//
//        TextView no;
//        TextView name;
//        ImageView image;
//
//    }
//
//
//}
