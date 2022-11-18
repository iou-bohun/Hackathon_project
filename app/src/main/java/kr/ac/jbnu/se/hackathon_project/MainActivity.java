package kr.ac.jbnu.se.hackathon_project;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ListViewAdapter listViewAdapter;
    ListView listView;
    FirebaseDatabase db;
    DatabaseReference myRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timechart);

        listViewAdapter = new ListViewAdapter();
        listView = findViewById(R.id.listView);

        listView.setAdapter(listViewAdapter);

        db = FirebaseDatabase.getInstance();
        myRef = db.getReference().child("Match");

        getValue();
    }

    private void getValue(){
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()){
                    String event = dataSnapshot.child("event").getValue(String.class);
                    String player1 = dataSnapshot.child("player1").getValue(String.class);
                    String player2 = dataSnapshot.child("player2").getValue(String.class);
                    String place = dataSnapshot.child("place").getValue(String.class);
                    String time = dataSnapshot.child("time").getValue(String.class);

                    Toast.makeText(MainActivity.this, event, Toast.LENGTH_SHORT).show();

                    listViewAdapter.add(event, player1, player2, place, time);
                }

                listViewAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}