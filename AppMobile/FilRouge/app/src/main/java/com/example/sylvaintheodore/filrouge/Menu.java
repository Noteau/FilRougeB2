package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity {
    private Button btUser;
    private Button btGroup;
    private Button btOU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btUser = findViewById(R.id.btUser);
        btGroup = findViewById(R.id.btGroup);
        btOU = findViewById(R.id.btOU);

        btUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Connexion Utilisateurs", Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(Menu.this, UsersList.class);
                startActivity(intent);
                finish();
            }
        });

        btGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Connexion Groupes", Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(Menu.this, GroupList.class);
                startActivity(intent);
                finish();
            }
        });

        btOU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), "Connexion Unités Organisationnelles", Toast.LENGTH_LONG);
                toast.show();
                Intent intent = new Intent(Menu.this, UOList.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
