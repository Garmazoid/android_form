package com.example.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //private EditText input1;
    //private EditText input2;
    //private Button calculatePu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        Button confirm = findViewById(R.id.butConfirm);
        confirm.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = "  Your profile\n";
                text += "FIO: " + ((EditText)findViewById(R.id.FIO)).getText() + "\n";
                text += "Age: " + ((EditText)findViewById(R.id.Age)).getText() + "\n";
                text += "Salary: " + ((TextView)findViewById(R.id.Salary)).getText() + "\n";
                text += "1st question: " + ((RadioButton)findViewById(R.id.radioButton1_3)).isChecked() + "\n";
                text += "2st question: " + "You are gay." + "\n";
                text += "3st question: " + "Nice choice.";
                ((TextView)findViewById(R.id.Profile)).setText(text);
                //Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });



        SeekBar salarySeekBar = findViewById(R.id.salarySeek);
        TextView salaryTextView = findViewById(R.id.Salary);
        salarySeekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                salaryTextView.setText(String.valueOf(progress*100 + 500) + "$");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

    }

    /*
        @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.my_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();
        if(id == R.id.menu_item_1) {
            Toast.makeText(this, "Hello 1", Toast.LENGTH_LONG).show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */

}