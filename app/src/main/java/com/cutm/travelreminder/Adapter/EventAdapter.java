package com.cutm.travelreminder.Adapter;

import android.content.Context;
import android.content.Entity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.cutm.travelreminder.R;
import com.cutm.travelreminder.database.EntityClass;

import java.util.List;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder>{

    Context context;
    List<EntityClass> entityClasses;

    public EventAdapter(Context context, List<EntityClass> entityClasses) {
        this.context = context;
        this.entityClasses = entityClasses;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.listing_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.eventText.setText(entityClasses.get(position).getEventname());
        holder.timeAndDateText.setText(entityClasses.get(position).getEventdate() + " " + entityClasses.get(position).getEventtime());
    }

    @Override
    public int getItemCount() {
        return entityClasses.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView eventText, timeAndDateText;
        private LinearLayout topLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            eventText = itemView.findViewById(R.id.event);
            timeAndDateText = itemView.findViewById(R.id.time_and_date);
            topLayout = itemView.findViewById(R.id.toplayout);
        }
    }
}
