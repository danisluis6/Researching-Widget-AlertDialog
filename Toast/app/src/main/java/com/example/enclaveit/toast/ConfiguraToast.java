package com.example.enclaveit.toast;

import android.app.Activity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by enclaveit on 16/12/2016.
 */

public class ConfiguraToast {

    public static Toast makeToast(Activity activity, String xtitle,String xtest, int duraion ){
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.ui_toast, (ViewGroup) activity.findViewById(R.id.toast_layout_id));

        /// Init components TextView
        // Get data and set

        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(duraion);
        toast.setView(layout);
        toast.setGravity(Gravity.CENTER, 0, 0);
        return toast;
    }
}
