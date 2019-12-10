package com.dnz.local.fib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button next;
    TextView count, number;

    int x = 0;
    int y = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.btn_find_nxt);
        count = findViewById(R.id.fib_count);
        number = findViewById(R.id.fib_number);

        next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String numberVal = fib();
                String countText = Integer.toString(Integer.parseInt( (String) count.getText()) + 1);

                count.setText(countText);
                number.setText(numberVal);
            }
        });

    }

    private String fib(){
        int result = x + y;
        x = y;
        y = result;

        return Integer.toString(result);
    }
}
