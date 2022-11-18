package kr.ac.jbnu.se.hackathon_project;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import kr.ac.jbnu.se.hackathon_project.SignupActivity;

public class LoginActivity extends AppCompatActivity {

    Button signup;
    Button singin;

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.login);

        //회원가입 버튼
        signup = findViewById(R.id.btn_join);
        singin = findViewById(R.id.btn_SignIn);

        signup.setOnClickListener(v->{
            Intent intent = new Intent(this, SignupActivity.class);
            startActivity(intent);
        });

        singin.setOnClickListener(v->{
            Intent intent1 = new Intent(this, MainActivity.class);
            startActivity(intent1);
        });



    }
}
