package com.ateam.funshoppers.BeaconDistance;

import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.ateam.funshoppers.Main_navigation.PaymentMode;
import com.ateam.funshoppers.R;

public class BeaconDetail extends AppCompatActivity {
    TextView tv;
    Point p;
    AlertDialog loginDialog;
    Button close,close1,close2;
    CollapsingToolbarLayout collapsingToolbarLayout;
    AppBarLayout appBar;
    Toolbar toolbar;
    String s="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beacon_detail);
        if(getIntent().getStringExtra("url")!=null){
         s = getIntent().getStringExtra("url");}
      //  tv=(TextView)findViewById(R.id.textView4);
        if(!s.equals("")){
        if (s.contains("Beacon:")){
            int index=s.indexOf("Beacon:");
            int index2=s.indexOf(":",index);
            s=s.substring(index2+1);
            displayDialogWindow(s);
        }}
        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.collapsing_toolbar);
        appBar=(AppBarLayout)findViewById(R.id.appbar);
        toolbar=(Toolbar)findViewById(R.id.tool_bar);
        setuptoolbar();
        close=(Button)findViewById(R.id.close);
        close1=(Button)findViewById(R.id.close1);
        close2=(Button)findViewById(R.id.close2);

        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BeaconDetail.this, PaymentMode.class);
                startActivity(intent);

            }
        });
        close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BeaconDetail.this, PaymentMode.class);
                startActivity(intent);
            }
        });
        close2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BeaconDetail.this, PaymentMode.class);
                startActivity(intent);
            }
        });

}
    private void setuptoolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
        //collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(primary));
        // collapsingToolbarLayout.setStatusBarScrimColor(palette.getDarkMutedColor(primaryDark));




    }
    public void displayDialogWindow(final String s) {
        if(loginDialog==null) {
            loginDialog = new AlertDialog.Builder(this).create();
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

                    loginDialog.dismiss();
                    customize(s);
                }
            });


            loginDialog.show();
        }

    }


    public void customize(String s){
        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
        mBuilder.setSmallIcon(R.drawable.raol);
        mBuilder.setContentTitle(s);
        mBuilder.setContentText("Check out latest deals on your favourite products");
        Intent resultIntent = new Intent(this, BeaconDetail.class);
        TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
        stackBuilder.addParentStack(BeaconDetail.class);

// Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

// notificationID allows you to update the notification later on.
        mNotificationManager.notify(1, mBuilder.build());

    }

}
