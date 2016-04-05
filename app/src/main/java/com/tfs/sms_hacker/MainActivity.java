package com.tfs.sms_hacker;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SendMessage(View view)
    {            HackingClass hackingClass = new HackingClass();
        try {

//            hackingClass.sendSMS("03370363728", "Hey",this);
            Toast.makeText(MainActivity.this, "Message Send" , Toast.LENGTH_SHORT).show();
        }
        catch (Exception ex)
        {
            Toast.makeText(MainActivity.this, ex.toString() , Toast.LENGTH_SHORT).show();
        }

    }
}
