package com.ateam.funshoppers.BeaconDistance;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.ateam.funshoppers.R;

public class BeaconDetail extends AppCompatActivity {
    TextView tv;
    Point p;
    AlertDialog.Builder loginDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_detail);
        String s = getIntent().getStringExtra("url");
      //  tv=(TextView)findViewById(R.id.textView4);
        if (s.contains("Beacon:")){
            int index=s.indexOf("Beacon:");
            int index2=s.indexOf(":",index);
            s=s.substring(index2+1);
        }

        displayDialogWindow(s);
}
    public void displayDialogWindow(String s) {
        if(loginDialog==null) {
            loginDialog = new AlertDialog.Builder(new ContextThemeWrapper(this, android.R.style.Theme_DeviceDefault_Light_Dialog));
            LayoutInflater factory = LayoutInflater.from(this);
            final View f = factory.inflate(R.layout.popup_layout, null);

            // loginDialog.setTitle("Please enter your name and email");
            loginDialog.setView(f);

            Button close = (Button) f.findViewById(R.id.close);
            TextView tv = (TextView) f.findViewById(R.id.bname);
            tv.setText(s);
            close.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    onBackPressed();
                }
            });
            Button in = (Button) f.findViewById(R.id.check_in);
            in.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    customize();
                }
            });


            loginDialog.show();
        }

    }

                // The method that displays the popup.

    public void customize(){





    }

}
