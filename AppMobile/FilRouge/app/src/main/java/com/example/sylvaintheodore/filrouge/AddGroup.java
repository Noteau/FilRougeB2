package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddGroup extends AppCompatActivity {
    private Button btValidation, btLinkMenu;
    private EditText edName, edType, edUO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_group);

        btValidation = findViewById(R.id.btValidation);
        btLinkMenu = findViewById(R.id.btLinkMenu);
        edName = findViewById(R.id.edName);
        edType = findViewById(R.id.edType);
        edUO = findViewById(R.id.edUO);

        btLinkMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AddGroup.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btValidation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO Modification avec champ name et type

                Toast toast = Toast.makeText(getApplicationContext(), "Groupe Créé", Toast.LENGTH_LONG);
                toast.show();

                Intent intent = new Intent(AddGroup.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
