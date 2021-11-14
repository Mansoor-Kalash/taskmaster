package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button addTask;
private Button allTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addTask = (Button) findViewById(R.id.addTask);
        allTask = (Button) findViewById(R.id.allTask);
        addTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addTaskActivity();
            }
        });
        allTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allTaskActivity();
            }
        });
    }
    public void addTaskActivity(){
        Intent intent = new Intent(this,AddTask.class);
        startActivity(intent);
    }
    public void allTaskActivity(){
        Intent intent = new Intent(this,AllTask.class);
        startActivity(intent);
    }
}