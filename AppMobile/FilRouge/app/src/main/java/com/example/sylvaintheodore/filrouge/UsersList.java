package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class UsersList extends AppCompatActivity {
    private Button btLinkMenu, btAdd;
    private ListView mListView;
    private String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent",
            "Gerard", "Hugo", "Ingrid", "Jonathan", "Kevin", "Logan",
            "Mathieu", "Noemie", "Olivia", "Philippe", "Quentin", "Romain",
            "Sophie", "Tristan", "Ulric", "Vincent", "Willy", "Xavier",
            "Yann", "Zoé"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_list);

        mListView = findViewById(R.id.lvUsers);
        btLinkMenu = findViewById(R.id.btLinkMenu);
        btAdd = findViewById(R.id.btAdd);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(UsersList.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = adapter.getItem(position);
                System.out.println(data);
                Intent intent = new Intent(UsersList.this, UserData.class);
                intent.putExtra("EXTRA_MESSAGE", data);
                startActivity(intent);
                finish();
            }
        });

        btLinkMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UsersList.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UsersList.this, AddUser.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
