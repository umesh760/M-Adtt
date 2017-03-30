package com.scpl.m_adtt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.scpl.m_adtt.adapter.FreshTestListAdapter;
import com.scpl.m_adtt.dto.FreshTestDto;

import java.util.ArrayList;

/**
 * Created by Umesh on 30/03/2017.
 */

public class FreshTestListActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    FreshTestListAdapter freshTestListAdapter;

    ArrayList<FreshTestDto> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh_test_list);


        mList = new ArrayList<FreshTestDto>();

        FreshTestDto item = new FreshTestDto();
        item.setCandidateName("First Candidate");
        item.setReferenceId("100");
        mList.add(item);
        FreshTestDto item1 = new FreshTestDto();
        item1.setCandidateName("Second Candidate");
        item1.setReferenceId("101");
        mList.add(item1);
        FreshTestDto item2 = new FreshTestDto();
        item2.setCandidateName("Third Candidate");
        item2.setReferenceId("103");
        mList.add(item2);

        FreshTestDto item3 = new FreshTestDto();
        item3.setCandidateName("Fourth Candidate");
        item3.setReferenceId("104");
        mList.add(item3);


        FreshTestDto item4 = new FreshTestDto();
        item4.setCandidateName("Fifth Candidate");
        item4.setReferenceId("105");
        mList.add(item4);


        FreshTestDto item5 = new FreshTestDto();
        item5.setCandidateName("Sixth Candidate");
        item5.setReferenceId("106");
        mList.add(item5);

        FreshTestDto item6 = new FreshTestDto();
        item6.setCandidateName("Seventh Candidate");
        item6.setReferenceId("107");
        mList.add(item6);




        recyclerView = (RecyclerView) findViewById(R.id.rec_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        freshTestListAdapter = new FreshTestListAdapter(mList, this);
        recyclerView.setAdapter(freshTestListAdapter);

    }
}
