package com.djordje.museum;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup rgLanguage = findViewById(R.id.rgLanguage);

        Button next = findViewById(R.id.btnNext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rbSelected = findViewById(rgLanguage.getCheckedRadioButtonId());
                Log.i("RadioButton value", rbSelected.getText()+" ");
                SetLocalization(LanguageToLocalCode(rbSelected.getText().toString()));
            }
        });
    }

    //Changing localization
    private void SetLocalization(String language)
    {
        if(language.equals(""))
            return;
        Locale myLocale = new Locale(language);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        Intent refresh = new Intent(this, ChooseRoomActivity.class);
        startActivity(refresh);
    }

    //Changing language name to local code
    private String LanguageToLocalCode(String language)
    {
        String code = "";
        switch (language)
        {
            case "English":
                code = "en";
                break;

            case "Srpski":
                code = "sr";
                break;
        }
        return code;
    }
}
