package com.rengwuxian.materialedittext.sample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.rengwuxian.materialedittext.MaterialEditText;

/**
 * Created by milan on 14/08/17.
 */

public class NewActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        MaterialEditText bottomTextEt2 = (MaterialEditText) findViewById(R.id.bottomTextEt2);

        bottomTextEt2.setError("sfdf");
    }
}
