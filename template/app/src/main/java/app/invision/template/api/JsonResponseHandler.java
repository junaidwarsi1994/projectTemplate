package app.invision.template.api;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;

import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.json.JSONArray;
import org.json.JSONObject;

import app.invision.template.utils.AppUtils;
import cz.msebera.android.httpclient.Header;

/**
 * Created by Lenovo on 4/20/2017.
 */

public class JsonResponseHandler {

    private static String TAG = "JsonResponseHandler";
    private static Context context;
    private static ProgressDialog dialog;

    public JsonResponseHandler(Context context){
        this.context = context;
        dialog = AppUtils.showLoadingDialog(context);
    }

    public static void get(String url, RequestParams params , final JsonHandler listener){
        dialog.show();
        RestApiClient.get(url,params,new JsonHttpResponseHandler(){


            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                //super.onSuccess(statusCode, headers, response);
                Log.d(TAG,"onSucess: "+response);
                listener.success(response);
                dialog.dismiss();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                //super.onSuccess(statusCode, headers, response);
                Log.d(TAG, "onSuccess: " + response);
                listener.success(response);
                dialog.dismiss();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                //super.onFailure(statusCode, headers, throwable, errorResponse);
                if (errorResponse == null)
                    listener.error(new Error(throwable),null);
                else
                    listener.error(new Error(throwable),errorResponse.toString());
                Log.d(TAG, "onFailure: " + errorResponse);
                dialog.dismiss();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
               // super.onFailure(statusCode, headers, throwable, errorResponse);
                if (errorResponse == null)
                    listener.error(new Error(throwable),null);
                else
                    listener.error(new Error(throwable),errorResponse.toString());
                Log.d(TAG, "onFailure: " + errorResponse);
                dialog.dismiss();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
               // super.onFailure(statusCode, headers, responseString, throwable);
                if (responseString == null)
                    listener.error(new Error(throwable),null);
                else
                    listener.error(new Error(throwable),responseString);
                Log.d(TAG, "onFailure: " + responseString);
                dialog.dismiss();
            }
        });

    }

    public static  void post (String url, RequestParams params , final JsonHandler listener){
       dialog.show();
        RestApiClient.post(url,params,new JsonHttpResponseHandler(){


            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONArray response) {
                //super.onSuccess(statusCode, headers, response);
                Log.d(TAG,"onSucess: "+response);
                listener.success(response);
                dialog.dismiss();
            }

            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                //super.onSuccess(statusCode, headers, response);
                Log.d(TAG, "onSuccess: " + response);
                listener.success(response);
                 dialog.dismiss();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                //super.onFailure(statusCode, headers, throwable, errorResponse);
                if (errorResponse == null)
                    listener.error(new Error(throwable),null);
                else
                    listener.error(new Error(throwable),errorResponse.toString());
                Log.d(TAG, "onFailure: " + errorResponse);
               dialog.dismiss();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONArray errorResponse) {
                // super.onFailure(statusCode, headers, throwable, errorResponse);
                if (errorResponse == null)
                    listener.error(new Error(throwable),null);
                else
                    listener.error(new Error(throwable),errorResponse.toString());
                Log.d(TAG, "onFailure: " + errorResponse);
                dialog.dismiss();
            }

            @Override
            public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                // super.onFailure(statusCode, headers, responseString, throwable);
                if (responseString == null)
                    listener.error(new Error(throwable),null);
                else
                    listener.error(new Error(throwable),responseString);
                Log.d(TAG, "onFailure: " + responseString);
                dialog.dismiss();
            }
        });

    }
}
