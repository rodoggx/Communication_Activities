package com.example.communicationactivities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private TextView mTextViewUser;
    private TextView mTextViewPW;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        mTextViewUser = (TextView) findViewById(R.id.User);
        mTextViewPW = (TextView) findViewById(R.id.PW);

        String User = getIntent().getStringExtra("User");
        String PW = getIntent().getStringExtra("PW");

        mTextViewUser.setText(User);
        mTextViewPW.setText(PW);
    }
}
