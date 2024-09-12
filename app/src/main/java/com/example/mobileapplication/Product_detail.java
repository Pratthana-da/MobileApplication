package com.example.mobileapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.widget.Toolbar;

public class Product_detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);  // เซ็ต Toolbar เป็น ActionBar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Fashion Shop");  // กำหนดชื่อในแถบด้านบน
        }



        ImageView imageView1 = findViewById(R.id.imageView1);
        imageView1.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "hat");
            startActivity(intent);
        });

        ImageView imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "t_shirt");
            startActivity(intent);
        });

        ImageView imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "trousers");
            startActivity(intent);
        });

        ImageView imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener(v -> {
            Intent intent = new Intent(Product_detail.this, Product.class);
            intent.putExtra("roomType", "shoe");
            startActivity(intent);
        });
    }
}
