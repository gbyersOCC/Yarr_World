package edu.orangecoastcollege.gbyerscs273.yarrworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //define button as instance variable
    Button speakButton;
    //

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //restoring user settings from previous section
        super.onCreate(savedInstanceState);
        //inflating (opening the layout called activity main xml code)
        setContentView(R.layout.activity_main);
        speakButton = (Button) findViewById(R.id.speakButton);
//comment

    }
}
