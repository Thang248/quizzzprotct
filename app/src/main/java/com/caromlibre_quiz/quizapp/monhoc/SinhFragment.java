package com.caromlibre_quiz.quizapp.monhoc;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.caromlibre_quiz.quizapp.MainActivity;
import com.caromlibre_quiz.quizapp.R;
import com.caromlibre_quiz.quizapp.slide.ScreenSlideActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SinhFragment extends Fragment {

    ExamAdapter examAdapter;
    android.widget.ListView lv_dethi;
    java.util.ArrayList<com.caromlibre_quiz.quizapp.monhoc.Exam> arr_exam = new java.util.ArrayList<com.caromlibre_quiz.quizapp.monhoc.Exam>();

    View view;

    public SinhFragment() {
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sinh Học");
        view = inflater.inflate(R.layout.fragment_toan, container, false);
        lv_dethi = view.findViewById(R.id.lvdethi);
        arr_exam.add(new Exam("Làm Bài"));

        examAdapter=new ExamAdapter(getContext(),arr_exam);
        lv_dethi.setAdapter(examAdapter);

        lv_dethi.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(android.widget.AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(getActivity(), ScreenSlideActivity.class);
                i.putExtra("loaiMon","sinh");
                startActivity(i);
            }
        });
        return view;
    }



}
