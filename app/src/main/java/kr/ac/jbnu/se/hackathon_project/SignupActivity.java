package kr.ac.jbnu.se.hackathon_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.Nullable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignupActivity extends AppCompatActivity {

    EditText name, department, student_number, pw;
    Button submit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        name = findViewById(R.id.edt_SignUpName);
        department = findViewById(R.id.edt_SignUpDepartment);
        student_number = findViewById(R.id.edt_SignUpStudentNumber);
        pw = findViewById(R.id.edt_SignUpPassword);

        submit = findViewById(R.id.btn_Signup);
        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                String studentName_string = name.getText().toString();
                String password_string = pw.getText().toString();
                String department_string = department.getText().toString();
                String studentNumber_string = student_number.getText().toString();

//                Intent intent = new Intent(SignupActivity.this, userInfo.class);
//                intent.putExtra("studentName_string", studentName_string);
//                intent.putExtra("password_string",password_string);
//                intent.putExtra("department_string",department_string);
//                intent.putExtra("studentNumber_string",studentNumber_string);

                Intent intent1 = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(intent1);

            }
        });


    }

}
