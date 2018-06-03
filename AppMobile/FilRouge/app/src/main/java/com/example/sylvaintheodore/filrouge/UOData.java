package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class UOData extends AppCompatActivity {

    private TextView tvTitle, tvInfo;
    private Button btLinkMenu, btDelete, btUpdate;
    private String GroupName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uodata);

        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            GroupName= null;
        } else {
            GroupName= extras.getString("EXTRA_MESSAGE");
        }

        btLinkMenu = findViewById(R.id.btLinkMenu);
        tvTitle = findViewById(R.id.tvTitle);
        tvInfo = findViewById(R.id.tvInfo);
        btDelete = findViewById(R.id.btDelete);
        btUpdate = findViewById(R.id.btUpdate);

        tvInfo.append("Nom : "+ GroupName);
        tvInfo.append("\nMembres : ['Philibert','Catherine','Hugo','Jean','Gérard']");
        tvInfo.append("\nGroupes : ['Administration','Dirigeant']");

        btLinkMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UOData.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Suppression UO sélectionnée
                Toast toast = Toast.makeText(getApplicationContext(), "Unité Organisationnelle supprimée", Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(UOData.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UOData.this, UpdateUO.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
