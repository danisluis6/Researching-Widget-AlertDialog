package com.example.enclaveit.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        relativeLayout = (RelativeLayout)this.findViewById(R.id.activity_main);
        relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConfiguraToast.makeToast(MainActivity.this,"Your title","Your Message", Toast.LENGTH_LONG).show();
            }
        });
    }
}
