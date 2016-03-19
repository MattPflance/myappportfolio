package com.mattpflance.myappportfolio;

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

    public void launchToast(View view) {
        // Get the name of the app to launch
        String app_name = ((Button)view).getText().toString();

        // Set up the toast message
        CharSequence toast_msg = String.format(getString(R.string.toast_text), app_name.toLowerCase());

        Toast.makeText(this, toast_msg, Toast.LENGTH_SHORT).show();
    }

    public void launchPopularMovies(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.pop_movies_package));
        startActivity(launchIntent);
    }

    public void launchAlexandria(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.alexandria_package));
        startActivity(launchIntent);
    }

    public void launchFootballScores(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.football_scores_package));
        startActivity(launchIntent);
    }
}
