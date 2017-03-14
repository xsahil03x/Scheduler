package com.savelife.serviceexample;

import android.app.Service;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Handler;
import android.os.IBinder;
import android.widget.Toast;

import java.io.FileInputStream;
import java.util.Calendar;
import java.util.Date;

public class UpdateService extends Service {
    static String userStartTime = "";
    static String userStopTime = "";
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startService(new Intent(UpdateService.this, UpdateService.class));
                if(userStartTime == "") {
                    try {
                        FileInputStream from_fin = openFileInput("userStartTime");
                        int i;
                        String time = "";
                        while ((i = from_fin.read()) != -1) {
                            time = time + Character.toString((char) i);
                        }
                        userStartTime = time;
                        from_fin.close();
                    } catch (Exception e) {
                    }
                }
                if(userStopTime == "") {
                    try {
                        FileInputStream to_fin = openFileInput("userStopTime");
                        int i;
                        String time = "";
                        while ((i = to_fin.read()) != -1) {
                            time = time + Character.toString((char) i);
                        }
                        userStopTime = time;
                        to_fin.close();
                } catch (Exception e) {
                    }
                    }

                Calendar c=Calendar.getInstance();
                c.setTime(new Date());
                String s_time = Integer.toString(c.get(Calendar.HOUR))+":"+Integer.toString(c.get(Calendar.MINUTE))+":"+Integer.toString(c.get(Calendar.AM_PM));
                if(s_time.equals(userStartTime))
                {
                    final AudioManager audioManager=(AudioManager)getSystemService(getApplicationContext().AUDIO_SERVICE);
                    audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                    Toast.makeText(getApplicationContext(),"Silent Mode Activated",Toast.LENGTH_LONG).show();
                }
                if(s_time.equals(userStopTime))
                {
                    final AudioManager audioManager=(AudioManager)getSystemService(getApplicationContext().AUDIO_SERVICE);
                    audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                    Toast.makeText(getApplicationContext(),"Ringer Mode Activated",Toast.LENGTH_LONG).show();
                }
            }
        }, 10000);
        return START_STICKY;
    }





    public UpdateService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.

        throw new UnsupportedOperationException("Not yet implemented");
    }
}
