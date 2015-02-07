package com.igorengineer.scripturerefference;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class Result extends ActionBarActivity {
    String book;
    String chapter;
    String verse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refference);

        setStrings();

        String message = "Your favorite scripture is: \""
                + book + " " + chapter + ":" + verse + "\"";
        TextView textView = (TextView)findViewById(R.id.book);
        textView.setText(message);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_refference, menu);
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

    public void setStrings() {
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            book    = extras.getString("book");
            chapter = extras.getString("chapter");
            verse   = extras.getString("verse");
        }
    }
}