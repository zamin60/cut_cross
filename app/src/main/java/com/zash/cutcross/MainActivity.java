package com.zash.cutcross;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //--------------------------
        final Button mstart;
        final Button mAbout;

        mstart = findViewById(R.id.start);

        mstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,home_activity.class);
                Log.d("cut","button clicked");
                startActivity(intent);
            }
        });

    }

}
