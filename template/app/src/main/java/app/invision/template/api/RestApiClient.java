package app.invision.template.api;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.pixplicity.easyprefs.library.Prefs;

public class RestApiClient {


   private static AsyncHttpClient client = new AsyncHttpClient();
   private static final String BASE_URL = "Your Url";

   public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {

       RequestParams newParams = params;
       client.get(getAbsoluteUrl(url), newParams, responseHandler);
   }

    public static void getWithoutBaseUrl(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {

        RequestParams newParams = params;
        client.get(url, newParams, responseHandler);
    }

   public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {

       RequestParams newParams = params;
       client.post(getAbsoluteUrl(url), newParams, responseHandler);
   }

   public static void getWithHeader (String url, RequestParams params, AsyncHttpResponseHandler responseHandler){
       RequestParams newParams = params;
       client.addHeader("Authorization","bearer "+ Prefs.getString("token",""));
       client.get(getAbsoluteUrl(url), newParams, responseHandler);
   }


   public static void postWithHeader (String url, RequestParams params, AsyncHttpResponseHandler responseHandler){
       RequestParams newParams = params;
       client.addHeader("Authorization","bearer "+ Prefs.getString("token",""));
       client.post(getAbsoluteUrl(url), newParams, responseHandler);
   }






   private static String getAbsoluteUrl(String relativeUrl) {
       return BASE_URL + relativeUrl;
   }
}