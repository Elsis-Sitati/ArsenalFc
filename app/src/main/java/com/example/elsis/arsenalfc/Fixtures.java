package com.example.elsis.arsenalfc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Fixtures extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fixtures);

        String fixtures[]={"Arsenal vs Westham \n 22/04/2016","Arsenal vs Leicester \n 1/03/2016","Arsenal vs Tottenham \n 12/12/2016","Arsenal vs Chelsea",
        "Arsenal vs Sunderland \n 1/02/2016","Arsenal vs Swansea\n 4/5/2016","Arsenal vs Liverpool \n 17/4/2016","Arsenal vs ManchesterCity \n 4/12/2016",
                "Arsenal vs Stoke city \n 6/8/2016","Liverpool vs Arsenal \n 4/2/2016","Tottenham vs Arsenal \n 5/3/2016 ","Swansea vs Arsenal \n 8/10/2016"};

        ListAdapter theAdapter =new ArrayAdapter<String>(this,R.layout.row_layout,R.id.textView13,fixtures);
        ListView theView = (ListView) findViewById(R.id.theListView);
        theView.setAdapter(theAdapter);
        theView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String tvShowPicked = "You picked" +String.valueOf(adapterView.getItemAtPosition(position));
                Toast.makeText(Fixtures.this,tvShowPicked,Toast.LENGTH_LONG).show();
            }
        });
    }
    }

