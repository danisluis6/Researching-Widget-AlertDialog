package com.example.enclaveit.app_meida.lib;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.enclaveit.alertdialog.R;

/**
 * Created by enclaveit on 16/12/2016.
 */

public class AlertDialog {

    private static android.app.AlertDialog alertDialog;

    public static android.app.AlertDialog onCreateDialog(Activity activity, String titlex, String content, final Context context) {
        /**
         * Initial AlertDialog and draw componet concerning inside AlertDialog
         */
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);
        /**
         * Get the layout inflater from user interface graphic
         */
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.ui_alert, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        /**
         * Inflate and set the layout for the dialog
         * Pass null as the parent view because its going in the dialog layout
         */
        builder.setView(layout);

        /// Init components TextView
        ImageView image = (ImageView) layout.findViewById(R.id.alert);
        TextView title = (TextView) layout.findViewById(R.id.title);
        TextView text = (TextView) layout.findViewById(R.id.text);

        // Get data and set
//        title.setText(titlex);
//        text.setText(content);

        // Add action buttons
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        builder.setNegativeButton("Cancle", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
        android.app.AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}
