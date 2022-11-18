package kr.ac.jbnu.se.hackathon_project;

import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ManagerActivity extends AppCompatActivity {
    Button player1,player2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager);

        player1 = findViewById(R.id.btn_player1);
        player2 = findViewById(R.id.btn_player2);



    }
}
