package com.example.sylvaintheodore.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class UOList extends AppCompatActivity {
    private Button btLinkMenu, btAdd;
    private ListView mListView;
    private String[] uo = new String[]{
            "Dirigeant", "Developpement", "Sécurité","Réseau" , "Ressources Humaines", "Comptable",
            "Sanitaire","Gestionnaire" ,"Administration" , "Médical"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uolist);

        btLinkMenu = findViewById(R.id.btLinkMenu);
        mListView = findViewById(R.id.lvUO);
        btAdd = findViewById(R.id.btAdd);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(UOList.this,
                android.R.layout.simple_list_item_1, uo);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String data = adapter.getItem(position);
                System.out.println(data);
                Intent intent = new Intent(UOList.this, UOData.class);
                intent.putExtra("EXTRA_MESSAGE", data);
                startActivity(intent);
                finish();
            }
        });

        btLinkMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UOList.this, Menu.class);
                startActivity(intent);
                finish();
            }
        });

        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UOList.this, AddUO.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
