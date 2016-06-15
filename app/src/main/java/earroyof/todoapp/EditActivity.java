package earroyof.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class EditActivity extends AppCompatActivity {

    EditText editTextBox;
    int currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        String currentText = getIntent().getStringExtra("text");
        currentPos = getIntent().getIntExtra("position", 0);
        editTextBox = (EditText) findViewById(R.id.editText);
        editTextBox.setText(currentText);
        editTextBox.setSelection(currentText.length());
        editTextBox.requestFocus();

    }


    public void onFinishEdit(View view) {
        Intent data = new Intent();
        data.putExtra("text", editTextBox.getText().toString());
        data.putExtra("position", currentPos);
        setResult(0, data);
        finish();
    }
}
