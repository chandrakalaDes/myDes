package com.fsemicolon.mydes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        final GridView homeGridView = findViewById(R.id.home_grid_view);

        final ArrayList<HomeGridClass> gridCategories = new ArrayList<>();

        gridCategories.add(new HomeGridClass(R.drawable.manual,"Manual"));

        gridCategories.add(new HomeGridClass(R.drawable.dictionary,"Dictionary"));

        gridCategories.add(new HomeGridClass(R.drawable.calander,"Calendar"));

        gridCategories.add(new HomeGridClass(R.drawable.question,"FAQ"));


        HomeAdapter homeAdapter = new HomeAdapter(this,gridCategories);

        homeGridView.setAdapter(homeAdapter);


        homeGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                HomeGridClass homeGridClass = gridCategories.get(position);

                Intent intent = new Intent(HomeActivity.this,DepartmentManualActivity.class);
                switch (position)
                {
                    case 0:
                        intent = new Intent(HomeActivity.this,DepartmentManualActivity.class);

                        break;

                    case 1:

                        intent = new Intent(HomeActivity.this,DictionaryActivity.class);

                        break;

                    case 2:

                        intent = new Intent(HomeActivity.this,CalendarActivity.class);

                        break;

                    case 3:
                        intent = new Intent(HomeActivity.this,QuestionnarieActivity.class);

                        break;

                        default: break;


                }

                startActivity(intent);


            }
        });























    }





}