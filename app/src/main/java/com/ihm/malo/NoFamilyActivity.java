package com.ihm.malo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NoFamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_family);

        Button creerFamille = (Button) findViewById(R.id.ButtonCreerFamille);
        assert creerFamille != null;
        creerFamille.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_create_family);
            }
        });

    }
}
