package com.rit.sfp.helloyou;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnWelcome = (Button) findViewById(R.id.btnWelcome);
        final EditText editName = (EditText) findViewById(R.id.editName);
        final TextView greetTxt = (TextView) findViewById(R.id.greetText);
        btnWelcome.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String currentText = editName.getText().toString();
                greetTxt.setText("Hello " + editName.getText());
                editName.setText("");
            }
        });
        editName.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                editName.setText("");
            }
        });
    }


}
