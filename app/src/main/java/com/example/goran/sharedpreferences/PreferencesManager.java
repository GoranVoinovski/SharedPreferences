package com.example.goran.sharedpreferences;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

import com.google.gson.Gson;

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

    public static String getLastName(Context context){
        return getPreferences(context).getString("lastname","No lastname");
    }

    public static void setLastName(Context context, String lastName){
        getPreferences(context).edit().putString("lastname", lastName).apply();

    }

    public static String getAge(Context context){
        return getPreferences(context).getString("age","");
    }

    public static void setAge(Context context, String age){
        getPreferences(context).edit().putString("age", age).apply();

    }

    public static boolean getPol(Context context){
        return getPreferences(context).getBoolean("gender",true);
    }

    public static void setPol(Context context, boolean masko){
        getPreferences(context).edit().putBoolean("gender", masko).apply();

    }

    public static void addUser(User model, Context c){

        Gson gson = new Gson();
        String mapString = gson.toJson(model);
        getPreferences(c).edit().putString("User", mapString).apply();


    }

    public static User getUser(Context c){

        return new Gson().fromJson(getPreferences(c).getString("User", ""), User.class);

    }
}
