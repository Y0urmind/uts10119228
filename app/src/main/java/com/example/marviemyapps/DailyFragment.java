package com.example.marviemyapps;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;




import java.util.ArrayList;

/*
 *     Tanggal Pengerjaan : 19/5/2022
 *     Nim : 10119228
 *     Nama : Marvie Bastian Sampul
 */

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DailyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DailyFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    public DailyFragment() {
        // Required empty public constructor
    }

    public static DailyFragment newInstance(String param1, String param2) {
        DailyFragment fragment = new DailyFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String mParam1 = getArguments().getString(ARG_PARAM1);
            String mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    RecyclerView recyclerViewDaily;
    ArrayList<DailyModel> dailyModel;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_daily, container, false);



        // s
        recyclerViewDaily = root.findViewById(R.id.recview_daily);
        recyclerViewDaily.setLayoutManager(new LinearLayoutManager(getContext()));

        dailyModel = new ArrayList<>();

        DailyModel daily_1 = new DailyModel(R.drawable.daily_eat, "main game", "main game ketika senggang");
        dailyModel.add(daily_1);
        DailyModel daily_2 = new DailyModel(R.drawable.daily_movie, "membuat musik", "freelancer dalam dunia musik");
        dailyModel.add(daily_2);

        recyclerViewDaily.setAdapter(new DailyAdapter(dailyModel));


        return root;
    }
}
