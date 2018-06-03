package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etUsername;
    private EditText etPswd;
    private Button btSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPswd = findViewById(R.id.etPassword);
        btSubmit = findViewById(R.id.btSubmit);

        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = etUsername.getText().toString();
                String pswd = etPswd.getText().toString();

                if (!user.equals("") && !pswd.equals("")){
                    if (user.equals("admin") && pswd.equals("password")){
                        Toast toast = Toast.makeText(getApplicationContext(), "Connexion", Toast.LENGTH_LONG);
                        toast.show();
                        Intent intent = new Intent(MainActivity.this, Menu.class);
                        startActivity(intent);
                        finish();

                    }
                    else{
                        Toast toast = Toast.makeText(getApplicationContext(), "Username ou mot de passe incorrect", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Un ou plusieurs champs sont incomplets", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });
    }
}
