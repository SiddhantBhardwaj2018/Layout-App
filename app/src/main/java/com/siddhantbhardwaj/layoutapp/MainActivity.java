package com.siddhantbhardwaj.layoutapp;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Initialize UI Elements and Variables here
        Toast.makeText(this,
                "onCreate() is called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStart() {

        // Start animations or UI related tasks
        super.onStart();
        Toast.makeText(this,
                "onStart() is called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // Start sensors or location updates
        Toast.makeText(this,
                "onResume() is called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //Release resources, pause ongoing operations
        Toast.makeText(this,
                "onPause() is called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //called when activity is no longer visible
        // release resources, save data
        /*
        The onStop() method is called when the activity is no longer visible to the user. This could happen because the activity is being replaced by another activity, the user navigates away from the activity, or the device goes into a configuration change (e.g., rotation) and the activity is being paused.
         */
        Toast.makeText(this,
                "onStop() is called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // when activity is restarting after stopping it
        // restart -> start -> resume
        Toast.makeText(this,
                "onRestart() is called",
                Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //last chance to clean resources, save data before app is closed
        /*

        The onDestroy() method is called when the activity is being completely destroyed. This can happen when the user finishes the activity (e.g., by pressing the back button), or if the system needs to reclaim resources
         */
        Toast.makeText(this,
                "onDestroy() is called",
                Toast.LENGTH_LONG).show();
    }
}