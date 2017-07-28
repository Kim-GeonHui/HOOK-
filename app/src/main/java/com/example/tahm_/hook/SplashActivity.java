package com.example.tahm_.hook;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by tahm_ on 2017-07-27.
 */

public class SplashActivity extends Activity {
    protected  void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);

        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent next = new Intent(getApplicationContext(), Start.class);
        startActivity(next);
        finish();

    }
}
