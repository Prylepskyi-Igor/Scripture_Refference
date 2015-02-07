package com.igorengineer.scripturerefference;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.igorengineer.scripturerefference.R;


public class Refference extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refference);

        setupButton();
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

    private void setupButton() {
        Button btn = (Button)findViewById(R.id.display);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText bookView = (EditText) findViewById(R.id.book);
                final String book = bookView.getText().toString();

                EditText chapterView = (EditText) findViewById(R.id.chapter);
                final String chapter = chapterView.getText().toString();

                EditText verseView = (EditText) findViewById(R.id.verse);
                final String verse = verseView.getText().toString();

                Intent intent = new Intent(getApplicationContext(), Result.class);
                intent.putExtra("book", book);
                intent.putExtra("chapter", chapter);
                intent.putExtra("verse", verse);

                startActivity(intent);
            }
        });
    }
}