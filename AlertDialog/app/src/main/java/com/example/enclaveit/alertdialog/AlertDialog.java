package com.example.enclaveit.alertdialog;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by enclaveit on 16/12/2016.
 */

public class AlertDialog {

    private static android.app.AlertDialog alertDialog;

    public static android.app.AlertDialog onCreateDialog(final Activity activity, String titlex, String messagex, final Context context) {
        // Initial AlertDialog and draw componet concerning inside AlertDialog
        final android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(activity);

        // Get Layout AlertDialog Android
        LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(R.layout.ui_alert, (ViewGroup) activity.findViewById(R.id.toast_layout_root));
        builder.setView(layout);
        // Set Content for AlertDailog
        Button OK = (Button)layout.findViewById(R.id.ok);
        Button Cancle = (Button)layout.findViewById(R.id.cancle);
        final EditText Email = (EditText)layout.findViewById(R.id.txtEmail);
        final EditText Pass = (EditText)layout.findViewById(R.id.txtPass);
        // Add Event for button
        OK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = Email.getText().toString();
                String pass = Pass.getText().toString();
                Log.d("INFOR","Email "+email);
                Log.d("INFOR","Pass "+pass);
            }
        });
        Cancle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.finish();
            }
        });
        android.app.AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}
