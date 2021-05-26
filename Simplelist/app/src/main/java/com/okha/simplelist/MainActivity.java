package com.okha.simplelist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView plList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       plList= findViewById(R.id.tv_pl_names);

       String[] names = {"Java", "Piton", "Ruby", "JavaScript", "Matlab",
       "C", "C++", "Swift", "Objective C", "Haskell", "Lisp", "Rust", "Html"};

       plList.setText("");//создаем пустой текст (удаляется первая сторкаThe list will be here )
       for (String name: names) {
           plList.append(name+ "\n");//каждый раз присоединяем к строке элемент из массива
       }
    }
}