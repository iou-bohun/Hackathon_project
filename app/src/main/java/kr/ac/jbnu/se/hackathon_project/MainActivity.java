package kr.ac.jbnu.se.hackathon_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ArrayList<HashMap<String, String>> Data = new ArrayList<HashMap<String,String>>();
    private HashMap<String,String> input1 = new HashMap<>();
    private HashMap<String,String> input2 = new HashMap<>();
    private HashMap<String,String> input3 = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timechart);

        ListView listView = findViewById(R.id.listView);

        input1.put("match", "축구: 소프트웨어 vs 전기공학");
        input1.put("time", "몇분 남음");
        Data.add(input1);

        input2.put("match", "배구: 소프트웨어 vs 전자공학");
        input2.put("time", "몇분 남음");
        Data.add(input2);

        input3.put("match", "농구: 소프트웨어 vs 신소재공학");
        input3.put("time", "몇분 남음");
        Data.add(input3);

        SimpleAdapter simpleAdapter = new SimpleAdapter(this,Data,android.R.layout.simple_list_item_2,new String[]{"match","time"},new int[]{android.R.id.text1,android.R.id.text2});
        listView.setAdapter(simpleAdapter);
    }
}