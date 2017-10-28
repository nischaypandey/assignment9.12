package com.example.rohitgiri.assignment91;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= (TextView) findViewById(R.id.t1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);

        return true;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       int id=item.getItemId();
        if(id==R.id.blue)
        {
            textView.setTextColor(getColor(R.color.colorPrimaryDark));
        }
        if(id==R.id.red)
        {
            textView.setTextColor(getColor(R.color.colorAccent));
        }
        if(id==R.id.green)
        {
            textView.setTextColor(getColor(R.color.colorPrimary));
        }
            return super.onOptionsItemSelected(item);
    }
}
