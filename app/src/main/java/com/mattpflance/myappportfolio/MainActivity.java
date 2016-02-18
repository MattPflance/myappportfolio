package com.mattpflance.myappportfolio;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void toast(View view) {
        // Get the button that was tapped
        Button app_button = (Button) view;
        // Get the button's text
        String app_name = app_button.getText().toString();

        // Set up the toast message
        Context context = getApplicationContext();
        CharSequence toast_msg = "This button will launch my " + app_name.toLowerCase() + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, toast_msg, duration);
        toast.show();

    }

    public void launchPopularMovies(View view) {

        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.pop_movies_package));
        startActivity(launchIntent);

    }
}
