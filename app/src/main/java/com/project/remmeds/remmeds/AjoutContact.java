package com.project.remmeds.remmeds;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AjoutContact extends AppCompatActivity {
    private Button go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_contact);
        go = (Button) findViewById(R.id.gobutton);
        // add button listener
        go.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                AlertDialog alertDialog = new AlertDialog.Builder(AjoutContact.this).create();
                alertDialog.setTitle("Succès");
                alertDialog.setMessage("Nouveau contact ajouté");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show(); }
        });
    }

}
