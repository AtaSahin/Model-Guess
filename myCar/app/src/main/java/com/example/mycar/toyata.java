package com.example.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class toyata extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toyata);

textView=findViewById(R.id.text_view);

long duraiton= TimeUnit.MINUTES.toMillis(1);
new CountDownTimer(duraiton, 1000) {
    @Override
    public void onTick(long l) {
        //when tick
        //we convert millisecond to minute and second
        String sDuration=String.format(Locale.ENGLISH,"%01d:%01d"
        ,TimeUnit.MILLISECONDS.toMinutes(l),TimeUnit.MILLISECONDS.toSeconds(l)
        ,TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(l)));
        textView.setText(sDuration);
    }



    @Override
    public void onFinish() {
        //WHEN FINISHES..IT HIDES TEXT VIEW
textView.setVisibility((View.GONE));
//Display toast
        Toast.makeText(getApplicationContext(),"Countdown timer has ended",Toast.LENGTH_LONG).show();
    }
}.start();
    }

}