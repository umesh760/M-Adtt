package com.scpl.m_adtt.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.scpl.m_adtt.R;
import com.scpl.m_adtt.dto.FreshTestDto;

import java.util.ArrayList;

/**
 * Created by Umesh on 30/03/2017.
 */

public class FreshTestListAdapter extends RecyclerView.Adapter<FreshTestListAdapter.FreshTestListHolder> {


    private ArrayList<FreshTestDto> listData;
    private LayoutInflater inflater;
    Context mContext;

    public FreshTestListAdapter(ArrayList<FreshTestDto> listItem, Context context){

        this.listData=listItem;
        this.inflater = LayoutInflater.from(context);
        this.mContext= context;
    }

    @Override
    public FreshTestListAdapter.FreshTestListHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item,parent,false);

        return new FreshTestListHolder(view);
    }

    @Override
    public void onBindViewHolder(FreshTestListAdapter.FreshTestListHolder holder, int position) {
        FreshTestDto item = listData.get(position);
        holder.txtTitle.setText(item.getCandidateName());
        holder.txtReferenceId.setText(item.getReferenceId());
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class FreshTestListHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView txtTitle;
        private TextView txtReferenceId;
       // private ImageView icon;
        private View container;


        public FreshTestListHolder(View itemView) {
            super(itemView);

            txtTitle = (TextView)itemView.findViewById(R.id.lbl_item_title);
            txtReferenceId = (TextView)itemView.findViewById(R.id.lbl_item_ref_id);
          //  icon = (ImageView) itemView.findViewById(R.id.im_item_icon);
           container = itemView.findViewById(R.id.cont_item_root);
           // icon.setOnClickListener(this);
            container.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            int id= view.getId();

            switch (id){


            /*    case R.id.im_item_icon:
                    Toast.makeText(mContext,"Icon Clicked",Toast.LENGTH_LONG).show();
                    break;
            */    case R.id.cont_item_root:
                    Toast.makeText(mContext,"Item Clicked",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

}
