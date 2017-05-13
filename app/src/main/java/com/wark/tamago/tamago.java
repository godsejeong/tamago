package com.wark.tamago;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.CollationElementIterator;

public class tamago extends AppCompatActivity {
    int click=50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamago);
        final Button button = (Button) findViewById(R.id.egg);
        final TextView textView= (TextView) findViewById(R.id.text);
        final Button button2 =(Button) findViewById(R.id.restart);
    button2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            click=50;
            button.setBackgroundResource(R.drawable.egg);
            textView.setText("click" + click + "!!");
        }
    });
    button.setOnClickListener(new View.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        @Override
        public void onClick(View v) {

            if (click > 30) {
                click -= 1;
                textView.setText("click" + click + "!!");
            }else if(click>15 && click<=30){
                click -= 1;
                button.setBackgroundResource(R.drawable.egg_1);
                textView.setText("click" + click + "!!");
            }else if(click<=15 && click>1){
                click -= 1;
                button.setBackgroundResource(R.drawable.egg_2);
                textView.setText("click" + click + "!!");
            }
            else{
                button.setBackgroundResource(R.drawable.egg_3);
                textView.setText("End!!");
            }
        }
    });
    }
}