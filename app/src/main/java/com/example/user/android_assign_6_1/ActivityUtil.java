package com.example.user.android_assign_6_1;

import android.content.Context;
import android.content.Intent;

/**
 * Created by USER on 09-04-2018.
 */

class ActivityUtil {
    private Context context;
    /*private can access withing this class
    * Context allows access to application-specific resources and classes*/
    public ActivityUtil(Context context) {
        this.context = context;//giving reference to context using this keyword
    }

    public void startSecondActivity() {
        context.startActivity(new Intent(context, SecondActivity.class));
        //here by using intent starts secondActivity
    }
}