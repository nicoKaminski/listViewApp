package com.murek.listviewapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.murek.listviewapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private String nombres [] = {"Nico", "Ian", "Santi", "Gaston", "Daro", "Belen", "Barbara", "Pitu", "Maya", "Chille", "Johana"};
    private String edades [] = {"35", "8", "16", "36", "35", "37", "31", "82", "9", "12", "38"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item_nombres, nombres);
        binding.lv1.setAdapter(adapter);

        binding.lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                binding.tv1.setText(nombres[position] + " tiene " + edades[position] + " años");
            }
        });
    }
}
