package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class UserData extends AppCompatActivity {
    private TextView tvTitle, tvInfo;
    private Button btLinkMenu, btDelete, btUpdate;
    private String UserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_data);

        Bundle extras = getIntent().getExtras();
        if(extras == null) {
            UserName= null;
        } else {
            UserName= extras.getString("EXTRA_MESSAGE");
        }

        btLinkMenu = findViewById(R.id.btLinkMenu);
        tvTitle = findViewById(R.id.tvTitle);
        tvInfo = findViewById(R.id.tvInfo);
        btDelete = findViewById(R.id.btDelete);
        btUpdate = findViewById(R.id.btUpdate);

        tvInfo.append("Nom : "+ UserName);
        tvInfo.append("\nGroupe : Administration");
        tvInfo.append("\nUnité Organisationnelle : Accueil");

        btLinkMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserData.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Suppression utilisateur sélectionné
                Toast toast = Toast.makeText(getApplicationContext(), "Utilisateur supprimée", Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(UserData.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserData.this, UpdateUser.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
