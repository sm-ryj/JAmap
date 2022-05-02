package org.techtown.jamap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class typeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
        Button backmain = (Button) findViewById(R.id.backmain);
        Button button_register = (Button) findViewById(R.id.button_register);
        backmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(typeActivity.this, MainActivity.class));
            }
        });
        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(this, "등록이 완료되었습니다.", Toast.LENGTH_SHORT).show();
            }

            //+ 여기서 등록이 되었다는 팝업창 추가로 띄워주기

        });
        TextView typeTV = findViewById(R.id.textView7);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                typeTV.append(button1.getText());
            }
        });
    }
}