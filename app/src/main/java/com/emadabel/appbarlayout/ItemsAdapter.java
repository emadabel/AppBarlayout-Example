package com.emadabel.appbarlayout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v7.widget.RecyclerView;;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Emad on 08/02/2018.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ListViewHolder> {

    private Context mContext;
    private ArrayList<String> mList;

    public ItemsAdapter(Context context, ArrayList<String> list) {
        mContext = context;
        mList = list;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate(R.layout.list_items, parent, false);

        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        String text = mList.get(position);
        holder.mTextView.setText(text);
    }


    @Override
    public int getItemCount() {
        return mList.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {

        final TextView mTextView;

        public ListViewHolder(View itemView) {
            super(itemView);

            mTextView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
