package majorproject2017.trackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SleepTrackerActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton bAdd, bDelete, bEdit, bView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_tracker);

        bAdd = (ImageButton) findViewById(R.id.bAdd);
        bView = (ImageButton) findViewById(R.id.bView);
        bEdit = (ImageButton) findViewById(R.id.bEdit);
        bDelete = (ImageButton) findViewById(R.id.bDelete);

        bAdd.setOnClickListener(this);
        bEdit.setOnClickListener(this);
        bView.setOnClickListener(this);
        bDelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bAdd:
                startActivity(new Intent(this, SleepAddActivity.class));
                break;
            case R.id.bEdit:

                break;
            case R.id.bDelete:

                break;
            case R.id.bView:

                break;
        }
    }
}
