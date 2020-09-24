package com.geektech.myhw21;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "TAG";
    private EditText editText;
    private EditText editText2;
    private EditText editText3;
    private TextView textViewResult;
    int a, b, c, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate");
        init ();
    }

    private void init() {
        textViewResult = findViewById(R.id.Result);
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
    }

    public void clickButtonOperation(View view) {
        String sum1 = editText.getText().toString();
        String sum2 = editText2.getText().toString();
        String sum3 = editText3.getText().toString();
        a = Integer.parseInt(sum1);
        b = Integer.parseInt(sum2);
        c = Integer.parseInt(sum3);
        result = a + b;
        result /= c;

    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Результат", result);
        Log.d(TAG, "onSafeInstatesState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        result = savedInstanceState.getInt("Результат", result);
        String sumResult = Integer.toString(result);
        textViewResult.setText(sumResult);
        Log.d(TAG, "onRestoreInstanceState" + result);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart" + result);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume" + result);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause" + result);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop" + result);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy" + result);
    }
}