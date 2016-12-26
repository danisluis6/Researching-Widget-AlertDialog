package com.example.enclaveit.alertdialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by enclaveit on 16/12/2016.
 */

public class AlertDialog {

    private static android.app.AlertDialog alertDialog;

    public static android.app.AlertDialog onCreateDialog(final Activity activity, String titlex, String messagex, final Context context) {
        // Initial AlertDialog and draw componet concerning inside AlertDialog
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);

        // Get Layout AlertDialog Android
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.ui_alert, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        builder.setView(layout);
        // Set Content for AlertDailog
        Button great = (Button)layout.findViewById(R.id.great);
        // Add Event for button
        great.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.finish();
            }
        });
        android.app.AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}
