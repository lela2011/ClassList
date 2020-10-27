package com.example.cleanlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.cleanlist.databinding.ActivityMainBinding;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public List<WeekEntry> Dataset;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Dataset.add(new WeekEntry(LocalDate.of(2020, 10, 26), LocalDate.of(2020, 11, 1), "Benedikt", "Nicolas"));
        Dataset.add(new WeekEntry(LocalDate.of(2020, 11, 2), LocalDate.of(2020, 11, 8), "Alex", "Manuel"));
        Dataset.add(new WeekEntry(LocalDate.of(2020, 11, 9), LocalDate.of(2020, 11, 15), "Luca", "Jens"));
        Dataset.add(new WeekEntry(LocalDate.of(2020, 11, 16), LocalDate.of(2020, 11, 22), "Patrick", "Sascha"));
        Dataset.add(new WeekEntry(LocalDate.of(2020, 11, 23), LocalDate.of(2020, 11, 29), "Marco", "Janis"));
        Dataset.add(new WeekEntry(LocalDate.of(2020, 11, 30), LocalDate.of(2020, 12, 6), "Damian", "Marcel"));
        Dataset.add(new WeekEntry(LocalDate.of(2020, 12, 7), LocalDate.of(2020, 12, 13), "Dario", "Jara"));
        Dataset.add(new WeekEntry(LocalDate.of(2020, 12, 14), LocalDate.of(2020, 12, 20), "Simon B.", "Benedikt"));
        Dataset.add(new WeekEntry(LocalDate.of(2021, 1, 4), LocalDate.of(2021, 1, 10), "Nicolas", "Alex"));
        Dataset.add(new WeekEntry(LocalDate.of(2021, 1, 11), LocalDate.of(2021, 1, 17), "Manuel", "Luca"));
        Dataset.add(new WeekEntry(LocalDate.of(2021, 1, 18), LocalDate.of(2021, 1, 14), "Jens", "Patrick"));
    }
}