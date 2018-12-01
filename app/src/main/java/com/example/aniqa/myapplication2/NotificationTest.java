package com.example.aniqa.myapplication2;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotificationTest extends AppCompatActivity {
    Button simple,bigText,bigPicture,notificationAction,blank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_test);
        simple=findViewById(R.id.button1);
        bigText=findViewById(R.id.button2);
        bigPicture=findViewById(R.id.button3);
        notificationAction=findViewById(R.id.button4);
        blank=findViewById(R.id.button5);

        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                simpleN();
            }
        });
        bigText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bigTextN();

            }
        });
        bigPicture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              bigPictureN();
            }
        });

        notificationAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             notificationActionN();
            }
        });


    }

    private void simpleN() {
        int nId=0;
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
        .setSmallIcon(R.drawable.angel)
        .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.angel))
        .setContentTitle("Android Course")
        .setContentText("brief description of android course")
        .setAutoCancel(true)
        .setDefaults(NotificationCompat.DEFAULT_ALL);
    Uri path= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
    builder.setSound(path);
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());


    }

    private void bigTextN() {
        int nId=1;
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.buddha)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.angel))
                .setContentTitle("Android Course Big Picture")
                .setStyle(new NotificationCompat.BigTextStyle().bigText("i am big text"))
                .setAutoCancel(true);
        Uri path= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());

    }

    private void bigPictureN() {
        int nId=2;
        Bitmap picture =BitmapFactory.decodeResource(getResources(), R.drawable.flower);
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.flower)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.angel))
                .setContentTitle("Android Course Big Picture")
                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(picture))
                .setAutoCancel(true);
        Uri path= RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());


    }

    private void notificationActionN() {

        int nId=4;
        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.flower)
                .setLargeIcon(BitmapFactory.decodeResource(getResources(), R.drawable.buddha))
                .setContentTitle("Android Course")
                .setStyle(new NotificationCompat.BigTextStyle().bigText("Click to visit google"))
                .setAutoCancel(true)
                .setDefaults(NotificationCompat.DEFAULT_ALL);

        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://wwww.google.com"));
        PendingIntent pendingIntent=PendingIntent.getActivity(this, 0,intent,0);
        builder.addAction(R.drawable.car, "VIEW", pendingIntent);

        Uri path = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        builder.setSound(path);
        NotificationManager notificationManager=(NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(nId,builder.build());

    }
}
