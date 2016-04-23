package com.example.ddd.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by DDD on 2016/4/21.
 */
public class BasicActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
