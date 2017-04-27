package majorproject2017.trackingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button registerButton;
    EditText etRegUser, etRegPass, etRegConfPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        registerButton = (Button) findViewById(R.id.registerButton);

        etRegUser = (EditText) findViewById(R.id.etRegUser);
        etRegPass = (EditText) findViewById(R.id.etPass);
        etRegConfPass = (EditText) findViewById(R.id.etRegConfPass);

        registerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.registerButton:

                break;
        }
    }
}
