package com.example.enclaveit.alertdialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by enclaveit on 16/12/2016.
 */

public class AlertDialog {

    private static android.app.AlertDialog alertDialog;

    public static android.app.AlertDialog onCreateDialog(final Activity activity, String titlex, String messagex, final Context context) {
        /**
         * Initial AlertDialog and draw componet concerning inside AlertDialog
         */
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);

        // Set title for AlertDialog
        builder.setTitle(titlex);

        // Set dialog message
        builder.setMessage(messagex)
        .setCancelable(false)
        // Add action buttons
        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                activity.finish();
            }
        })
        .setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        android.app.AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}
