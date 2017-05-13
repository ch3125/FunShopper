package com.ateam.funshoppers.BeaconDistance;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
       // tv.setText(tv.getText()+" "+s);
        p=new Point();
        p.x=300;
        p.y=470;
        if(p!=null){
            showPopup(BeaconDetail.this, p);
        }
}

    // The method that displays the popup.
    private void showPopup(final Activity context, Point p) {
        int popupWidth = 200;
        int popupHeight = 150;

        // Inflate the popup_layout.xml
      LinearLayout viewGroup = (LinearLayout) context.findViewById(R.id.ly);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View layout = layoutInflater.inflate(R.layout.popup_layout, viewGroup);

        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Some offset to align the popup a bit to the right, and a bit down, relative to button's position.
        int OFFSET_X = 30;
        int OFFSET_Y = 30;

        // Clear the default translucent background
        popup.setBackgroundDrawable(new BitmapDrawable());

        findViewById(R.id.ly).post(new Runnable() {
            public void run() {
                popup.showAtLocation(layout, Gravity.CENTER, 0, 0);
            }
        });

        // Displaying the popup at the specified location, + offsets.
     //   popup.showAtLocation(layout, Gravity.NO_GRAVITY, p.x + OFFSET_X, p.y + OFFSET_Y);
        // Getting a reference to Close button, and close the popup when clicked.
        Button close = (Button) layout.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                popup.dismiss();
            }
        });
        Button in = (Button) layout.findViewById(R.id.check_in);
        in.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                popup.dismiss();
                //TODO Notification Builder
                customize();
            }
        });
    }

    public void customize(){

    }

}
