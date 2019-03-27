package com.example.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        mEditText = (EditText) findViewById(R.id.editText);
        if (savedInstanceState != null) {
            mShowCount.setText(savedInstanceState.getString("text"));
            mCount = savedInstanceState.getInt("mCount");
        }
    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("mShowCount",mShowCount.getText().toString());
        outState.putInt("mCount",mCount);
    }

    public void count(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
