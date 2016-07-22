package com.example.communicationactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG";
    private EditText mEditTextUser;
    private EditText mEditTextPW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
       mEditTextUser = (EditText) findViewById(R.id.input1);
       mEditTextPW = (EditText) findViewById(R.id.input2);

        Log.d(TAG, "Login: " + mEditTextUser.getText() + " " + mEditTextPW.getText());

        Intent intent = new Intent(this, DetailsActivity.class);

        intent.putExtra("User", mEditTextUser.getText().toString());
        intent.putExtra("PW", mEditTextPW.getText().toString());

        startActivity(intent);

    }
}
