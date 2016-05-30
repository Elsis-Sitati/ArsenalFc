package com.example.elsis.arsenalfc;

import android.support.design.widget.Snackbar;
import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by elsis on 5/29/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private String names []={
            "Alexis Sanchez", "Mesut Ozil", "Hector Bellerin", "Jack Wilshere,","Aaron Ramsey",
            "Petr Czech"
    };

    private String positions []={
            "Forward","MidFielder","RightBack","MidFielder","Midfielder","Goal-Keeper"
    };
    private int images []={

        R.drawable.alexis_sanchez,R.drawable.mesut_ozil,R.drawable.hector_bellerin,R.drawable.wilshere,R.drawable.aaron,R.drawable.petr
    };

    class  ViewHolder extends RecyclerView.ViewHolder{
        public ImageView itemImage;
        public TextView itemName;
        public TextView itemPosition;


        public ViewHolder (View itemView){
            super(itemView);
            itemImage=(ImageView)itemView.findViewById(R.id.item_image);
            itemName=(TextView) itemView.findViewById(R.id.player_name);
            itemPosition=(TextView)itemView.findViewById(R.id.playing_position);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position =getAdapterPosition();

                    Snackbar.make(v, "click detcted on item "+position,Snackbar.LENGTH_LONG)
                    .setAction("Action",null).show();
                }
            });

        }

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.card_layout,viewGroup,false);
        ViewHolder viewHolder =new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder,int i) {
        viewHolder.itemName.setText(names[i]);
        viewHolder.itemPosition.setText(positions[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }
}

