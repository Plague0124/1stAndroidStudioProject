package com.example.secondcoming;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                    Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                    return insets;
                });
            /* this is a comment please work don't give up on me */
            Button button = findViewById(R.id.button);
            TextView myText = findViewById(R.id.textView);
            EditText textInput = findViewById(R.id.textInput);

            button.setOnClickListener(view -> {
                String text = textInput.getText().toString().trim();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            });
    }
}
