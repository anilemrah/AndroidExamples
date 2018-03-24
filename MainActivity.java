package com.example.anilemrah.secondtry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button onlyButton = (Button)findViewById(R.id.onlyButton);

        onlyButton.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        TextView onlyText = (TextView)findViewById(R.id.onlyText);

                        onlyText.setText("Good Job!");
                    }
                }
        );
    }
}
