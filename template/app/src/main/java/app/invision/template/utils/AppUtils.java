package app.invision.template.utils;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by Junaid-Invision on 5/29/2017.
 */
public class AppUtils {

    public static ProgressDialog showLoadingDialog(Context context){
        ProgressDialog progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading..");
        return progressDialog;
    }
}
