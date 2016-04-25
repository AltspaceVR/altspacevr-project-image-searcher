package testsample.altvr.com.testsample.util;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Tejus Kudari on 4/13/2016.
 */
public class LogUtil {
    /**
     * Turn debugging on or off
     */
    private static final boolean DEBUG = true;

    /**
     * Tag to be used for static calls
     */
    private static final String sTAG = "LogUtil";

    private StringBuilder stringBuilder = new StringBuilder();

    private String TAG = sTAG;


    public LogUtil(String tag){
        TAG = tag;
    }

    public LogUtil(Class<?> clazz){
        TAG = clazz.getSimpleName();
    }

    public void d(String... log){
        if (DEBUG) {
            Log.d(TAG, TextUtils.join(" : ", log));
        }
    }

    public void w(String... log){
        if (DEBUG) {
            Log.w(TAG, TextUtils.join(" : ", log));
        }
    }

    public void e(String... log) {
        if (DEBUG) {
            Log.e(TAG, TextUtils.join(" : ", log));
        }
    }

    public void e(Throwable tr, String... log){
        if (DEBUG) {
            Log.e(TAG,TextUtils.join(" : ", log), tr);
        }
    }

    public static void log(String log){
        if (DEBUG) {
            Log.d(sTAG,log);
        }
    }

    public static void logW(String log){
        if (DEBUG) {
            Log.w(sTAG,log);
        }
    }

    public static void logW(String log, Throwable tr){
        if (DEBUG) {
            Log.w(sTAG, log, tr);
        }
    }

    public static void logE(String log){
        if (DEBUG) {
            Log.e(sTAG,log);
        }
    }

    public static void logE(String log, Throwable tr){
        if (DEBUG) {
            Log.e(sTAG,log,tr);
        }
    }
}
