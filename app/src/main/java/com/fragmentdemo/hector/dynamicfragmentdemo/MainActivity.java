package com.fragmentdemo.hector.dynamicfragmentdemo;

//import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    /** Called when the activity is first created. */

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        HelloFragment hello = new HelloFragment();
        fragmentTransaction.add(R.id.fragment_container, hello);
        fragmentTransaction.commit();

        loadButtonLabels();
/*
        Button btnLoad = (Button) findViewById(R.id.btn_load);

        OnClickListener listener = new OnClickListener() {

            @Override
            public void onClick(View v) {

				FragmentManager fragmentManager = getFragmentManager();
				FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
				HelloFragment hello = new HelloFragment();
                //SecondFragment hello = new SecondFragment();
				fragmentTransaction.add(R.id.fragment_container, hello, "HELLO");
                fragmentTransaction.commit();

            }
        };

        btnLoad.setOnClickListener(listener);
*/
/*
        Button btnRemove = (Button) findViewById(R.id.btn_remove);
        
        OnClickListener listener2 = new OnClickListener() {
			
			@Override
			public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Removing", Toast.LENGTH_LONG).show();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                //fragmentTransaction.remove(getFragmentManager().findFragmentById(R.id.fragment_container));
                SecondFragment second = new SecondFragment();
                fragmentTransaction.replace(R.id.fragment_container, second);
                //HelloFragment hello = new HelloFragment();
                //fragmentTransaction.remove(hello);
                fragmentTransaction.commit();
                //fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                //fragmentTransaction = null;
			}
		};

        btnRemove.setOnClickListener(listener2);
*/

        OnClickListener listener2 = new OnClickListener() {

            @Override
            public void onClick(View v) {
               // Toast.makeText(getApplicationContext(), "Playing", Toast.LENGTH_LONG).show();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                //fragmentTransaction.remove(getFragmentManager().findFragmentById(R.id.fragment_container));
                SecondFragment second = new SecondFragment();
                fragmentTransaction.replace(R.id.fragment_container, second);
                //fragmentTransaction.add(R.id.fragment_container, second, "Second");
                //HelloFragment hello = new HelloFragment();
                //fragmentTransaction.remove(hello);
                fragmentTransaction.commit();
                //fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_CLOSE);
                //fragmentTransaction = null;

                start_quiz();
            }
        };

        fab.setOnClickListener(listener2);
    }

    public void start_quiz() {
        Toast.makeText(getApplicationContext(), "Starting quiz", Toast.LENGTH_LONG).show();
        String[] array = this.getResources().getStringArray(R.array.chords_array);
        String randomStr = array[new Random().nextInt(array.length)];
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void loadButtonLabels() {

        b1 = (Button) findViewById(R.id.note1);
        b2 = (Button) findViewById(R.id.note2);
        b3 = (Button) findViewById(R.id.note3);
        b4 = (Button) findViewById(R.id.note4);
        b5 = (Button) findViewById(R.id.note5);
        b6 = (Button) findViewById(R.id.note6);
        b7 = (Button) findViewById(R.id.note7);
        b8 = (Button) findViewById(R.id.note8);
        b9 = (Button) findViewById(R.id.note9);
        b10 = (Button) findViewById(R.id.note10);
        b11 = (Button) findViewById(R.id.note11);
        b12 = (Button) findViewById(R.id.note12);

        //t1.setText(Html.fromHtml("<sub>" + "A" + "</sub><sup>" + "#" + "</sup>"));
        b1.setText(Html.fromHtml("A"));
        b2.setText(Html.fromHtml("A" + "</small></sub><sup><small>" + "#" + "</small></sup>"));
        b3.setText(Html.fromHtml("B"));
        b4.setText(Html.fromHtml("C"));
        b5.setText(Html.fromHtml("C" + "</small></sub><sup><small>" + "#" + "</small></sup>"));
        b6.setText(Html.fromHtml("D"));
        b7.setText(Html.fromHtml("D" + "</small></sub><sup><small>" + "#" + "</small></sup>"));
        b8.setText(Html.fromHtml("E"));
        b9.setText(Html.fromHtml("F"));
        b10.setText(Html.fromHtml("F" + "</small></sub><sup><small>" + "#" + "</small></sup>"));
        b11.setText(Html.fromHtml("G"));
        b12.setText(Html.fromHtml("G" + "</small></sub><sup><small>" + "#" + "</small></sup>"));

    }
}