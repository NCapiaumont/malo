package com.ihm.malo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        TextView inscription = (TextView) findViewById(R.id.inscriptionButton);
        assert inscription != null;
        inscription.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change to activity_no_family
                setContentView(R.layout.activity_no_family);
            }
        });
    }
}
