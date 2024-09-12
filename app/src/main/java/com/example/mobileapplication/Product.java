package com.example.mobileapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mobileapplication.model.smarthome;

import java.util.ArrayList;
import java.util.List;
import androidx.appcompat.widget.Toolbar;

public class Product extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Fashion Shop");
        }

        String roomType = getIntent().getStringExtra("roomType");

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        List<smarthome> smarthomes = new ArrayList<>();

        if ("hat".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("หมวกสีดำ");
            smarthome1.setSmarthome_image("https://i.pinimg.com/564x/7a/1f/bd/7a1fbdaf6132c8f33c91050e9aa4681c.jpg");
            smarthome1.setSmarthome_detail("ร้านขายหมวก");
            smarthome1.setSmarthome_price("299");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("หมวกสีขาว");
            smarthome2.setSmarthome_image("https://i.pinimg.com/564x/f0/a9/c9/f0a9c960078a86cac0eb167a262ef071.jpg");
            smarthome2.setSmarthome_detail("ร้านขายหมวก");
            smarthome2.setSmarthome_price("299");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("หมวกสีชมพู");
            smarthome3.setSmarthome_image("https://i.pinimg.com/564x/4c/3d/f1/4c3df1b3b2297224a3c3a846c677ab09.jpg");
            smarthome3.setSmarthome_detail("ร้านขายหมวก");
            smarthome3.setSmarthome_price("299");
            smarthomes.add(smarthome3);

            smarthome smarthome4 = new smarthome();
            smarthome4.setSmarthome_name("หมวกสีม่วง");
            smarthome4.setSmarthome_image("https://i.pinimg.com/736x/62/e0/15/62e0151473c1f3aed194a0bcc8b89479.jpg");
            smarthome4.setSmarthome_detail("ร้านขายหมวก");
            smarthome4.setSmarthome_price("299");
            smarthomes.add(smarthome4);

        } else if ("t_shirt".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("เสื้อยืดสีดำ");
            smarthome1.setSmarthome_image("https://i.pinimg.com/564x/49/5b/e4/495be445a6423c71a4d0209954901945.jpg");
            smarthome1.setSmarthome_detail("ร้านขายเสื้อยืด");
            smarthome1.setSmarthome_price("350");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("เสื้อยืดสีขาว");
            smarthome2.setSmarthome_image("https://i.pinimg.com/564x/33/a8/9f/33a89f47b45566d48a5a2af19a2d4e69.jpg");
            smarthome2.setSmarthome_detail("ร้านขายเสื้อยืด");
            smarthome2.setSmarthome_price("350");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("เสื้อยืดสีน้ำตาล");
            smarthome3.setSmarthome_image("https://i.pinimg.com/564x/a7/eb/48/a7eb48b384456e3b38841dbc16b224a4.jpg");
            smarthome3.setSmarthome_detail("ร้านขายเสื้อยืด");
            smarthome3.setSmarthome_price("350");
            smarthomes.add(smarthome3);

            smarthome smarthome4 = new smarthome();
            smarthome4.setSmarthome_name("เสื้อยืดสีแดง");
            smarthome4.setSmarthome_image("https://i.pinimg.com/564x/fc/89/b8/fc89b8f94d64059abde3817d1c172e87.jpg");
            smarthome4.setSmarthome_detail("ร้านขายเสื้อยืดู");
            smarthome4.setSmarthome_price("350");
            smarthomes.add(smarthome4);

        } else if ("trousers".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("กางเกงสีดำ");
            smarthome1.setSmarthome_image("https://i.pinimg.com/736x/7c/0b/1f/7c0b1f94100aadafbffabc00ef81e28c.jpg");
            smarthome1.setSmarthome_detail("ร้านขายกางเกง");
            smarthome1.setSmarthome_price("359");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("กางเกงสีแดง");
            smarthome2.setSmarthome_image("https://i.pinimg.com/736x/49/2c/fb/492cfbc1e36e699c4b652e67dd3c2848.jpg");
            smarthome2.setSmarthome_detail("ร้านขายกางเกง");
            smarthome2.setSmarthome_price("359");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("กางเกงสีฟ้า");
            smarthome3.setSmarthome_image("https://i.pinimg.com/736x/8b/7b/e5/8b7be5d98438e35f8d6105a9d26f6baa.jpg");
            smarthome3.setSmarthome_detail("ร้านขายกางเกง");
            smarthome3.setSmarthome_price("359");
            smarthomes.add(smarthome3);

            smarthome smarthome4 = new smarthome();
            smarthome4.setSmarthome_name("กางเกงสีชมพู");
            smarthome4.setSmarthome_image("https://i.pinimg.com/736x/8f/42/86/8f4286fc6b64f0c8e5f8bcbf744c65cb.jpg");
            smarthome4.setSmarthome_detail("ร้านขายกางเกง");
            smarthome4.setSmarthome_price("359");
            smarthomes.add(smarthome4);

        } else if ("shoe".equals(roomType)) {
            smarthome smarthome1 = new smarthome();
            smarthome1.setSmarthome_name("รองเท้าผ้าใบสีครีม");
            smarthome1.setSmarthome_image("https://i.pinimg.com/564x/3b/fd/02/3bfd0270c5321a0ee137216630b128fb.jpg");
            smarthome1.setSmarthome_detail("ร้านขายรองเท้า");
            smarthome1.setSmarthome_price("499");
            smarthomes.add(smarthome1);

            smarthome smarthome2 = new smarthome();
            smarthome2.setSmarthome_name("รองเท้าแตะสีขาว");
            smarthome2.setSmarthome_image("https://i.pinimg.com/564x/d6/24/d9/d624d9ff2ecf92f945931c74922dd94a.jpg");
            smarthome2.setSmarthome_detail("ร้านขายรองเท้า");
            smarthome2.setSmarthome_price("259");
            smarthomes.add(smarthome2);

            smarthome smarthome3 = new smarthome();
            smarthome3.setSmarthome_name("รองเท้าส้นสูง");
            smarthome3.setSmarthome_image("https://i.pinimg.com/564x/04/5c/4d/045c4d0e735143c71142a1a34b0cec1a.jpg");
            smarthome3.setSmarthome_detail("ร้านขายรองเท้า");
            smarthome3.setSmarthome_price("359");
            smarthomes.add(smarthome3);

            smarthome smarthome4 = new smarthome();
            smarthome4.setSmarthome_name("รองเท้าผ้าใบสีเขียว");
            smarthome4.setSmarthome_image("https://i.pinimg.com/564x/12/78/7e/12787ec752f7aea2dff355ac95980452.jpg");
            smarthome4.setSmarthome_detail("ร้านขายรองเท้า");
            smarthome4.setSmarthome_price("599");
            smarthomes.add(smarthome4);
        }

        mAdapter = new MyAdptersmar(smarthomes, this);
        recyclerView.setAdapter(mAdapter);
    }
}
