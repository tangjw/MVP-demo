package com.tjw.mvp_demo.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.tjw.mvp_demo.App;

/**
 * SharedPreferences 封装, 需设置mContext为Application
 * Created by tang-jw on 2016/6/16.
 */
public class SPUtils {
	
	private static App app = App.app;
//	private static Context app = App.app.getApplicationContext();
	
	public static void setBoolean(String key, boolean value) {
		setBoolean("config", key, value);
	}
	
	public static boolean getBoolean(String key, boolean defValue) {
		return getBoolean("config", key, defValue);
	}
	
	public static String getString(String key, String defValue) {
		return getString("config", key, defValue);
	}
	
	public static void setString(String key, String value) {
		setString("config", key, value);
	}
	
	public static int getInt(String key, int defValue) {
		return getInt("config", key, defValue);
	}
	
	public static void setInt(String key, int value) {
		setInt("config", key, value);
	}
	
	
	public static boolean getBoolean(String name, String key, boolean defValue) {
		SharedPreferences sp = app.getSharedPreferences(name, Context.MODE_PRIVATE);
		return sp.getBoolean(key, defValue);
	}
	
	public static void setBoolean(String name, String key, boolean value) {
		SharedPreferences sp = app.getSharedPreferences(name, Context.MODE_PRIVATE);
		sp.edit().putBoolean(key, value).apply();
	}
	
	public static String getString(String name, String key, String defValue) {
		SharedPreferences sp = app.getSharedPreferences(name, Context.MODE_PRIVATE);
		return sp.getString(key, defValue);
	}
	
	public static void setString(String name, String key, String value) {
		SharedPreferences sp = app.getSharedPreferences(name, Context.MODE_PRIVATE);
		sp.edit().putString(key, value).apply();
	}
	
	public static int getInt(String name, String key, int defValue) {
		SharedPreferences sp = app.getSharedPreferences(name, Context.MODE_PRIVATE);
		return sp.getInt(key, defValue);
	}
	
	public static void setInt(String name, String key, int value) {
		SharedPreferences sp = app.getSharedPreferences(name, Context.MODE_PRIVATE);
		sp.edit().putInt(key, value).apply();
	}
	
}
