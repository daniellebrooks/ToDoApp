package com.codepath.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String todo = getIntent().getStringExtra("todo");
        editText =(EditText) findViewById(R.id.editText2);
        editText.setText(todo);

    }

    public void onSaveItem(View v) {
        EditText editTodo = (EditText) findViewById(R.id.editText2);
        Intent data = new Intent();
        data.putExtra("editedTodo", editTodo.getText().toString());
        setResult(RESULT_OK, data);
        this.finish();

    }

}
