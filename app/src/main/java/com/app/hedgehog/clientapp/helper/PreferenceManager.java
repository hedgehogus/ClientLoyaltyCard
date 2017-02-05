package com.app.hedgehog.clientapp.helper;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by hedgehogus on 05.02.2017.
 */

public class PreferenceManager {

    private static PreferenceManager preferenceManager;
    private Context context;
    private static final String PREF_NAME = "details";
    private static final String CURRENT_USER_LOGIN = "login";
    private static final String CURRENT_USER_PASS = "pass";

    private PreferenceManager(Context context){
        this.context = context;
    }

    public static PreferenceManager getInstance(Context context){
        if (preferenceManager == null){
            preferenceManager = new PreferenceManager(context);
        }
        return preferenceManager;
    }

    public String getCurrentUserLogin(){
        SharedPreferences sPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sPref.getString(CURRENT_USER_LOGIN, "");
    }

    public String getCurrentUserPass(){
        SharedPreferences sPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        return sPref.getString(CURRENT_USER_PASS, "");
    }

    public void setCurrentUserLogin(String login){
        SharedPreferences sPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(CURRENT_USER_LOGIN, login);
    }

    public void setCurrentUserPass(String pass){
        SharedPreferences sPref = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        ed.putString(CURRENT_USER_PASS, pass);
    }


}
