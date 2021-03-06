package ru.job4j.todo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.util.Calendar;

public class AddActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle saved) {
        super.onCreate(saved);
        setContentView(R.layout.add);
    }

    public void save(View view) {
        EditText edit = this.findViewById(R.id.name);
        EditText desc = this.findViewById(R.id.desc);
        Item item = new Item(edit.getText().toString(), Calendar.getInstance());
        item.setDesc(desc.getText().toString());
        Store.getStore().add(item);
        Intent intent = new Intent(this.getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
