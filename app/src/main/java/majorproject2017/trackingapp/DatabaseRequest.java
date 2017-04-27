package majorproject2017.trackingapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

/**
 * Created by ke_lizzy on 4/24/17.
 */

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.Map;
import java.util.HashMap;

/**
 * Created by ke_lizzy on 4/24/17.
 */

/**public class DatabaseRequest {
    private static final String DATABASE_URL = "";
    private Map<String, String> parameters;

    public DatabaseRequest(String username, String password, Response.Listener<String> l) {
        super(Request.Method.POST, DATABASE_URL, l, null);
        parameters = new HashMap<>();
        parameters.put("Username", username);
        parameters.put("Password", password);
    }

    @Override
    public Map<String, String> getParameters() {
        return parameters;
    }
}*/