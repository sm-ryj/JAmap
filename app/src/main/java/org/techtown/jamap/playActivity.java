package org.techtown.jamap;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class playActivity extends AppCompatActivity {

    Button backmain, goyoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        backmain = (Button) findViewById(R.id.backButton);
        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(playActivity.this, MainActivity.class));
            }
        });

        Uri youtube_uri = Uri.parse("https://www.youtube.com/");
        Intent youtube_intent = new Intent(Intent.ACTION_VIEW, youtube_uri);
        goyoutube = (Button) findViewById(R.id.youtubeButton);
        goyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(youtube_intent);
            }
        });
    }
}