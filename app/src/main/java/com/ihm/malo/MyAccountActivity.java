package com.ihm.malo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_account);
        Button annuler = (Button) findViewById(R.id.cancel_update_button);
        Button confirmer = (Button) findViewById(R.id.commit_update_button);

        annuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commitOrCancelUpDate();
            }
        });

        confirmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                commitOrCancelUpDate();
            }
        });
    }

        private void cancelUpDate(){
        setContentView(R.layout.activity_calendar);
    }
    private void commitOrCancelUpDate(){

        setContentView(R.layout.activity_calendar);
    }

}

