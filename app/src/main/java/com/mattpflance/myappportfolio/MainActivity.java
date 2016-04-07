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

    public void launchApp(View view) {
        String app_name = ((Button)view).getText().toString();
        Intent launchIntent = null;

        // No switch statement since cases need to be constant
        if (app_name.equals(getString(R.string.popular_movies))) {
            launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.popular_movies_package));
        } else if (app_name.equals(getString(R.string.alexandria))) {
            launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.alexandria_package));
        } else if (app_name.equals(getString(R.string.football_scores))) {
            launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.football_scores_package));
        } else if (app_name.equals(getString(R.string.build_free))) {
            launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.build_free_package));
        } else if (app_name.equals(getString(R.string.build_paid))) {
            launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.build_paid_package));
        } else if (app_name.equals(getString(R.string.xyz))) {
            launchIntent = getPackageManager().getLaunchIntentForPackage(getString(R.string.xyz_package));
        }

        // Just show a toast if the app doesn't exist on the phone
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            launchToast(view);
        }

    }
}
