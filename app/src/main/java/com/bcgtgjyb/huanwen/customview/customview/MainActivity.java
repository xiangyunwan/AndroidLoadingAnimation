package com.bcgtgjyb.huanwen.customview.customview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bcgtgjyb.huanwen.customview.mylibrary.FiveLine;
import com.bcgtgjyb.huanwen.customview.mylibrary.TaiJiButton;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TaiJiButton taiJiButton;
    private FiveLine fiveLine1;
    private FiveLine fiveLine2;
//    private Loding58View loading58;
//    private LinearLayout addView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        loading58 = new Loding58View(this);
        setContentView(R.layout.activity_main);
//        addView = (LinearLayout)findViewById(R.id.add);
//        addView.addView(loading58);
        init();
    }

    private void init() {
        taiJiButton = (TaiJiButton) findViewById(R.id.taiJiButton);
        fiveLine1 = (FiveLine) findViewById(R.id.fiveLine1);
        fiveLine2 = (FiveLine) findViewById(R.id.fiveLine2);
        fiveLine2.initLine(new float[]{0,0.2f,0.4f,0.6f,0.8f});

//        taiJiButton.setVelocity(5000);
        taiJiButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!taiJiButton.isLoading()) {
                    taiJiButton.startLoad();
                }
            }
        });


        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (taiJiButton != null && taiJiButton.isLoading()) {
                    taiJiButton.stopLoad();
                }
            }
        });
    }
}
