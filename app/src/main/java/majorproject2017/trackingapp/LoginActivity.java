package majorproject2017.trackingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button login, createAcc, forgotPass;
    EditText etUser, etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);
        createAcc = (Button) findViewById(R.id.createAcc);
        forgotPass = (Button) findViewById(R.id.forgotPass);

        etUser = (EditText) findViewById(R.id.etUser);
        etPass = (EditText) findViewById(R.id.etPass);

        login.setOnClickListener(this);
        createAcc.setOnClickListener(this);
        forgotPass.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login:
                String username = etUser.getText().toString();
                String password = etPass.getText().toString();
                Response.Listener<String> stringListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                    }
                };
               // LoginRequest login = new LoginRequest(username, password, stringListener);
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.createAcc:
                startActivity(new Intent(this, RegisterActivity.class));
                break;
            case R.id.forgotPass:

                break;

        }
    }
}
