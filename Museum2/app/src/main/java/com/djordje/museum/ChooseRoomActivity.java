
package com.djordje.museum;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class ChooseRoomActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_room);

        ImageButton imgBtnRoom1 = findViewById(R.id.imgBtnRoom1);
        ImageButton imgBtnRoom2 = findViewById(R.id.imgBtnRoom2);
        ImageButton imgBtnRoom3 = findViewById(R.id.imgBtnRoom3);
        ImageButton imgBtnRoom4 = findViewById(R.id.imgBtnRoom4);

        imgBtnRoom1.setOnClickListener(this);
        imgBtnRoom2.setOnClickListener(this);
        imgBtnRoom3.setOnClickListener(this);
        imgBtnRoom4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int roomIndex = Integer.parseInt(v.getTransitionName());

        Intent intent = new Intent(this, RoomActivity.class);
        intent.putExtra("index", roomIndex);
        startActivity(intent);
    }
}
