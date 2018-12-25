package com.djordje.museum;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.TextView;

public class RoomActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        int index = -1;

        Intent intent = getIntent();
        if(intent.getExtras() != null)
            index = (int)intent.getExtras().get("index");


        Room room = new Room(index);
        TextView tvText = findViewById(R.id.tvText);
        tvText.setText(room.text);
    }

}
