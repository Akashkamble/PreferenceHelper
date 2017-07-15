package com.akash.preferencehelperdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.akash.preferencehelper.PreferenceHelper;

public class MainActivity extends AppCompatActivity {
    public static final String KEY = "Key";
    TextView sharedTextView;
    EditText sharedEdittext;
    Button add,remove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PreferenceHelper.initialize(this);
        sharedTextView = (TextView) findViewById(R.id.preferenceTv);
        sharedEdittext = (EditText) findViewById(R.id.sharedEditText);
        if (PreferenceHelper.get(KEY) == null) {
            sharedTextView.setText("Nothing in SharedPreferences");
        }
        remove = (Button) findViewById(R.id.deleteFromSharedPreference);
        add = (Button) findViewById(R.id.addToSharedPreference);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = sharedEdittext.getText().toString();
                PreferenceHelper.save(KEY, value);
                sharedTextView.setText(PreferenceHelper.get(KEY));
            }
        });
        remove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.removeKey(KEY);
                if (PreferenceHelper.get(KEY) == null) {
                    sharedTextView.setText("Nothing in SharedPreferences");
                }
            }
        });
    }
}
