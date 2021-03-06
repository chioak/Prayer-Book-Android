/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arashpayan.util;

import android.util.Log;

/**
 *
 * @author arash
 */
public class L {
    private static final String TAG = "PrayerBook";
    
    public static void i(String msg) {
        Log.i(TAG, msg);
    }
    
    public static void d(String msg) {
        Log.d(TAG, msg);
    }
    
    public static void w(String msg) {
        Log.w(TAG, msg);
    }
    
    public static void w(String msg, Throwable t) {
        Log.w(TAG, msg, t);
    }
    
    public static void e(String msg, Throwable t) {
        Log.e(TAG, msg, t);
    }
}
