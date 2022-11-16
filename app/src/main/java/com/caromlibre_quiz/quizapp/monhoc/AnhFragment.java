package com.caromlibre_quiz.quizapp.monhoc;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.caromlibre_quiz.quizapp.MainActivity;
import com.caromlibre_quiz.quizapp.R;
import com.caromlibre_quiz.quizapp.slide.ScreenSlideActivity;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class AnhFragment extends Fragment {

    ExamAdapter examAdapter;
    ListView lv_dethi;
    ArrayList<Exam> arr_exam = new ArrayList<Exam>();
    View view;

    public AnhFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Tiếng Anh");
        view = inflater.inflate(R.layout.fragment_toan, container, false);
        lv_dethi = view.findViewById(R.id.lvdethi);
        arr_exam.add(new Exam("Làm Bài"));

        examAdapter=new ExamAdapter(getContext(),arr_exam);
        lv_dethi.setAdapter(examAdapter);

        lv_dethi.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), ScreenSlideActivity.class);
                i.putExtra("loaiMon","anh");
                startActivity(i);
            }
        });
        return view;
    }



}
