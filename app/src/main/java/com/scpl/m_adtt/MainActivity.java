package com.scpl.m_adtt;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Intent intent;
    Button btnFresh, btnRetest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inIt();
    }

    private void inIt() {

        btnFresh = (Button) findViewById(R.id.btn_fresh);
        btnRetest = (Button) findViewById(R.id.btn_retest);
        btnFresh.setOnClickListener(this);
        btnRetest.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.btn_fresh:
                intent = new Intent(MainActivity.this, FreshTestListActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left, R.anim.right);

                break;

            case R.id.btn_retest:
                intent = new Intent(MainActivity.this, RetestListActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.left, R.anim.right);
        }
    }

    @Override
    public void onBackPressed() {
        showAlert();
    }

    public void showAlert() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setTitle("Do you want to close");
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                overridePendingTransition(R.anim.backanimleft,
                                        R.anim.backanimright);
                            }
                        })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
