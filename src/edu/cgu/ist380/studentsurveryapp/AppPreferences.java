package edu.cgu.ist380.studentsurveryapp;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.Log;

public class AppPreferences {
    
    private static final String APP_SHARED_PREFS = AppPreferences.class.getSimpleName(); //  Name of the file -.xml
    private SharedPreferences _sharedPrefs;
    private Editor _prefsEditor;

    public AppPreferences(Context context) {
        this._sharedPrefs = context.getSharedPreferences(APP_SHARED_PREFS, Activity.MODE_PRIVATE);
        this._prefsEditor = _sharedPrefs.edit();
    }

    public String getValue(String key) {
    	Log.d("APP","Value for " + key +" is "+ _sharedPrefs.getString(key,null));
        return _sharedPrefs.getString(key, null);
    }

    public void setValue(String key,String value) {
        _prefsEditor.putString(key, value);
        _prefsEditor.commit();
    }
}