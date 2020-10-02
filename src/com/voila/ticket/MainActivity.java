package com.voila.ticket;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;

import java.util.*;
import java.net.*;
import java.io.*;
import android.view.View.*;
import android.content.*;

public class MainActivity extends Activity
{
	public static TextView res;
	@Override
	public void onPointerCaptureChanged(boolean hasCapture)
	{
		// TODO: Implement this method
	}

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		res = findViewById(R.id.res);
		Intent i=new Intent(this,srv.class);
		getApplicationContext().startService(i);
    }
	public static void update(String tc, int c)
	{
		res.setText("二等座："+tc+"\n查询次数："+c);
		
	}

}
