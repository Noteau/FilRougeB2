package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class GroupList extends AppCompatActivity {

    private Button btLinkMenu, btAdd;
    private ListView mListView;
    private String[] groupes = new String[]{
            "Administration", "Developpement", "Sécurité", "Gestionnaire", "Ressources Humaines", "Médical",
            "Sanitaire", "Réseau", "Dirigeant", "Comptable"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_list);

        btLinkMenu = findViewById(R.id.btLinkMenu);
        mListView = findViewById(R.id.lvGroups);
        btAdd = findViewById(R.id.btAdd);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(GroupList.this,
                android.R.layout.simple_list_item_1, groupes);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = adapter.getItem(position);
                System.out.println(data);
                Intent intent = new Intent(GroupList.this, GroupData.class);
                intent.putExtra("EXTRA_MESSAGE", data);
                startActivity(intent);
                finish();
            }
        });

        btLinkMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroupList.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(GroupList.this, AddGroup.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
