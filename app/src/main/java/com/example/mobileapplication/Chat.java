package com.example.mobileapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.widget.Toolbar;

public class Chat extends AppCompatActivity {

    private TextView textView;
    private EditText etInputText;
    private Button bSend;
    private Button bSend1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Fashion Shop");
        }

        String smarthomename = getIntent().getStringExtra("smarthomename");

        // เชื่อมต่อ UI components
        textView = findViewById(R.id.sellerNameTextView);
        etInputText = findViewById(R.id.etInputText);
        bSend = findViewById(R.id.bSend);
        bSend1 = findViewById(R.id.bSend1);

        textView.setText("Chat with " + smarthomename);

        bSend.setOnClickListener(v -> {
            String message = etInputText.getText().toString();
            if (!message.isEmpty()) {
                textView.append("\n" + message);
                etInputText.setText("");
            }
        });

        bSend1.setOnClickListener(v -> {
            Intent intent = new Intent(Chat.this, ve.class);
            startActivity(intent);
        });
    }
}