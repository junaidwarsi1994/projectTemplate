package app.invision.template.api;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Lenovo on 4/20/2017.
 */

public interface JsonHandler {

    public void success(JSONObject jsonObject);
    public void success(JSONArray jsonArray);
    public void error(Error e, String errorMsg);
}
