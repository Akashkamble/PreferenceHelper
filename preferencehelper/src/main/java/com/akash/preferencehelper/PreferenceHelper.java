package com.akash.preferencehelper;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by akash on 15-07-2017.
 */

public class PreferenceHelper {
    private static Context context=null;
    private static SharedPreferences preferences;
    private static SharedPreferences.Editor editor;

    public PreferenceHelper(){
    }
    public static Context getContext(){
        return context;
    }
    public static void initialize(Context ctx){
        if(context==null){
            context=ctx;
        }

        if(null==preferences){
            preferences= PreferenceManager.getDefaultSharedPreferences(context);
        }

        if(null==editor){
            editor=preferences.edit();
        }
    }

    public static void save(String key,String value){
        editor.putString(key,value);
        editor.commit();
    }
    public static void save(String key,int value){
        save(key,String.valueOf(value));
    }
    public static void save(String key,float value){
        save(key,String.valueOf(value));
    }
    public static void save(String key,long value){
        save(key,String.valueOf(value));
    }

    public static String get(String key){
        return preferences.getString(key,(String) null);
    }

    public static Boolean contains(String key){
        return Boolean.valueOf(preferences.contains(key));
    }

    public static void removeKey(String key){
        editor.remove(key);
        editor.commit();
    }
}
