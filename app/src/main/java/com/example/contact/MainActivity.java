package com.example.contact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact o1 = new Contact(1, "Rony", "01521331239");
    Contact o2 = new Contact(1, "Rony", "01521331239");
    Contact o3 = new Contact(1, "Rony", "01521331239");
    Contact o4 = new Contact(1, "Rony", "01521331239");
    Contact o5 = new Contact(1, "Rony", "01521331239");
    Contact o6 = new Contact(1, "Rony", "01521331239");
    Contact o7 = new Contact(1, "Rony", "01521331239");
    Contact o8 = new Contact(1, "Rony", "01521331239");
    Contact o9 = new Contact(1, "Rony", "01521331239");
    Contact o10 = new Contact(1, "Rony", "01521331239");
    Contact o11 = new Contact(1, "Rony", "01521331239");
    Contact o12 = new Contact(1, "Rony", "01521331239");

    Contact [] contacts= {o1, o2, o3, o4, o5, o6, o7, o8, o9, o10, o11, o12};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

    }
}