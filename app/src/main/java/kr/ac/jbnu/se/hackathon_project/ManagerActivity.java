package kr.ac.jbnu.se.hackathon_project;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class ManagerActivity extends AppCompatActivity {
    Button player1,player2;
    private DatabaseReference mDatabase;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager);
        UserInfo user = new UserInfo();


        player1 = findViewById(R.id.btn_player1);
        player2 = findViewById(R.id.btn_player2);
        mDatabase = FirebaseDatabase.getInstance().getReference();




    }
}
