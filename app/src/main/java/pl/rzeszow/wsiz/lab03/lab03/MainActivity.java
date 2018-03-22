package pl.rzeszow.wsiz.lab03.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox);

        RadioButton rbOpcja1 = (RadioButton) findViewById(R.id..rbOpcja1);​
        RadioButton rbOpcja2 = (RadioButton) findViewById(R.id.r​bOpcja2); ​
        RadioButton rbOpcja3 = (RadioButton) findViewById(R.id.​rbOpcja3);

        String[] planety = {"Merkury","Wenus","Ziemia","Mars","Jowisz","Saturn","Uran","Neptun"};
        spinner = findViewById(R.id.spinner);

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item, planety);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); spinner.setAdapter(adapter);

        View.OnClickListener listener = ​new ​View.OnClickListener() {
            @Override​
            public void ​ onClick(View v) {​
                RadioButton radioButton = (RadioButton) v;
                if​ (radioButton.isChecked()) {​
                        Log.​i(​"TAG"​, ​"Zaznaczona opcja: " ​+ radioButton.getText()); ​
                }
            }
        };

        rbOpcja1.setOnClickListener(listener);
        rbOpcja2.setOnClickListener(listener);
        rbOpcja3.setOnClickListener(listener);


    }
}
