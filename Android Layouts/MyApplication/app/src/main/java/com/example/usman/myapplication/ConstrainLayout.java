package com.example.usman.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.ArrayList;

public class ConstrainLayout extends AppCompatActivity {

    Button save;
    ArrayList<String> addArray = new ArrayList<String>();
    EditText email;
    EditText password;
    CheckBox check;
    RadioButton male;
    RadioButton female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.constrain_main);

        email =  (EditText)findViewById(R.id.cEmail);                       //id of button or text field
        password =  (EditText)findViewById(R.id.cPass);
        check = (CheckBox) findViewById(R.id.cTerms);
        male = (RadioButton) findViewById(R.id.cMale);
        female = (RadioButton) findViewById(R.id.cFemale);

        save = (Button)findViewById(R.id.cButton);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getemail = email.getText().toString();
                String getpassword = password.getText().toString();


                if(check.isChecked()) {
                    if (male.isChecked()) {
                        Toast.makeText(getBaseContext(), "Email : " + getemail + "\n" + "Password : " + getpassword +
                                "\n" + "Gender : " + "Male" +
                                "\n" + "Terms and Conditons : " + "Checked", Toast.LENGTH_LONG).show();
                    }
                    else if (female.isChecked()) {
                        Toast.makeText(getBaseContext(), "Email : " + getemail + "\n" + "Password : " + getpassword +
                                "\n" + "Gender : " + "female" +
                                "\n" + "Terms and Conditons : " + "Checked", Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getBaseContext(), "Email : " + getemail + "\n" + "Password : " + getpassword +
                                "\n" + "Gender : " + " Not Specified" +
                                "\n" + "Terms and Conditons : " + "Checked", Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    Toast.makeText(getBaseContext(), "User Should Accept Terms and Conditions ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}