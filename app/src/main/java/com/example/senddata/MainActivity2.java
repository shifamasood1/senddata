package com.example.senddata;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView nametextview,emailtextview,passwordtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        nametextview=findViewById(R.id.textView5);
        emailtextview=findViewById(R.id.textView6);
        passwordtextview=findViewById(R.id.textView7);
        String na=getIntent().getStringExtra("username");
        String em=getIntent().getStringExtra("email");
        String ps=getIntent().getStringExtra("password");

        nametextview.setText(na);
        emailtextview.setText(em);
        passwordtextview.setText(ps);
    }
}