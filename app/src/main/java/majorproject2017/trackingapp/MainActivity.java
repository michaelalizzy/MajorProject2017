package majorproject2017.trackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton bMenuLogout, bMenuSOS, bMenuResources, bMenuMood, bMenuSleep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bMenuLogout = (ImageButton) findViewById(R.id.bMenuLogout);
        bMenuSOS = (ImageButton) findViewById(R.id.bMenuSOS);
        bMenuResources = (ImageButton) findViewById(R.id.bMenuResources);
        bMenuMood = (ImageButton) findViewById(R.id.bMenuMood);
        bMenuSleep = (ImageButton) findViewById(R.id.bMenuSleep);

        bMenuLogout.setOnClickListener(this);
        bMenuSOS.setOnClickListener(this);
        bMenuResources.setOnClickListener(this);
        bMenuMood.setOnClickListener(this);
        bMenuSleep.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bMenuSleep:
                startActivity(new Intent(this, SleepTrackerActivity.class));
                break;
            case R.id.bMenuMood:
                startActivity(new Intent(this, MoodTrackerActivity.class));
                break;
            case R.id.bMenuResources:
                startActivity(new Intent(this, ResourcesActivity.class));
                break;
            case R.id.bMenuSOS:
                startActivity(new Intent(this, SOSButtonActivity.class));
                break;
            case R.id.bMenuLogout:
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
