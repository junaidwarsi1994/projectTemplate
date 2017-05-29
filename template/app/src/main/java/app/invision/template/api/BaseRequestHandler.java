package app.invision.template.api;

import com.loopj.android.http.RequestParams;

import app.invision.template.listeners.ObjectListener;

/**
 * Created by Lenovo on 4/19/2017.
 */

public abstract class BaseRequestHandler {

    public abstract void sendRequest(RequestType type, RequestParams params, ObjectListener completionHandler);

}

