package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateUser extends AppCompatActivity {
    private Button btValidation, btLinkMenu;
    private EditText edUsername, edGroupUser, edUOUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_user);

        btValidation = findViewById(R.id.btValidation);
        btLinkMenu = findViewById(R.id.btLinkMenu);
        edUsername = findViewById(R.id.edUsername);
        edGroupUser = findViewById(R.id.edGroupUser);
        edUOUser = findViewById(R.id.edUOUser);

        btLinkMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UpdateUser.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btValidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Modification avec champ username, groupe et uo

                Toast toast = Toast.makeText(getApplicationContext(), "Utilisateur Modifié", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(UpdateUser.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
