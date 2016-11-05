package com.example.app.sumnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calc = (Button)findViewById(R.id.button);
        final EditText userNum = (EditText)findViewById(R.id.editText);
        final TextView showResult = (TextView)findViewById(R.id.textView2);
        final TextView status = (TextView)findViewById(R.id.textView3);

        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //System.out.println("test") calls Log.i("custom tag", "print this") to logcat in
                    //Android Monitor
                Log.i("calc", "button clicked");

                long number = Long.parseLong(userNum.getText().toString());
                if (0 <= number && number <= 65535) {
                    long result = (number * (number + 1)) / 2;
                    showResult.setText(getString(R.string.showResult, (int) result));
                    status.setText(getString(R.string.status, number));
                }
                else {
                    showResult.setText(getString(R.string.empty));
                    status.setText(getString(R.string.textView3));
                }
            }
        });
    }
}
