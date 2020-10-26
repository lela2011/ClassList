package com.example.cleanlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    public List<WeekEntry> Dataset;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DateFormat dateFormat = new SimpleDateFormat("mm-dd");
        // Writes data into list_item layout elements at position x
        WeekEntry currentWeek = Dataset.get(position);

        String startDate = dateFormat.format(currentWeek.startDate);
        String endDate = dateFormat.format(currentWeek.endDate);

        holder.startDate.setText(startDate);
        holder.endDate.setText(endDate);
        holder.name1.setText(currentWeek.firstName);
        holder.name2.setText(currentWeek.secondName);
    }

    @Override
    public int getItemCount() {
        return Dataset.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView startDate;
        public TextView endDate;
        public TextView name1;
        public TextView name2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            startDate = itemView.findViewById(R.id.DateStart);
            endDate = itemView.findViewById(R.id.DateEnd);
            name1 = itemView.findViewById(R.id.FirstName);
            name2 = itemView.findViewById(R.id.SecondName);
        }
    }

    public Adapter(List<WeekEntry> Dataset) {
        this.Dataset = Dataset;
    }
}
