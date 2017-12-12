package com.example.goran.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by goran on 12.12.17.
 */

public class PreferencesManager {


    private static SharedPreferences getPreferences(Context c) {

        return c.getApplicationContext().getSharedPreferences("MySharedPreferencesFile", Activity.MODE_PRIVATE);
    }

    public static String getFirstName(Context context){
        return getPreferences(context).getString("firstname","No name");
    }

    public static void setFirstName(Context context, String firstName){
        getPreferences(context).edit().putString("firstname", firstName).apply();

    }
}
