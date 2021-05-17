package sg.edu.rp.c346.id20002369.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    Button btnReset;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttonDisplayDate);
        btnDisplayTime = findViewById(R.id.buttonDisplayTime);
        btnReset = findViewById(R.id.buttonReset);
        tvDisplay = findViewById(R.id.textViewDisplay);

        btnDisplayTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tp.getCurrentMinute() < 10) {
                    tvDisplay.setText("Time is " + tp.getCurrentHour() + ":0" + tp.getCurrentMinute());
                } else {
                    tvDisplay.setText("Time is " + tp.getCurrentHour() + ":" + tp.getCurrentMinute());
                }
            });

        btnDisplayDate.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View v){
                tvDisplay.setText("Date is " + dp.getDayOfMonth() + "/" + (dp.getMonth() + 1) + "/" + dp.getYear());
            }
            });

        btnReset.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){
                tp.setCurrentHour(12);
                tp.setCurrentMinute(0);
                dp.updateDate(2020, 0, 1);
            }
            }
        });
        
    }
}