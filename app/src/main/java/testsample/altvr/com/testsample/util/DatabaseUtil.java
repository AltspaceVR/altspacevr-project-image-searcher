package testsample.altvr.com.testsample.util;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import testsample.altvr.com.testsample.vo.PhotoVo;

/**
 * Created by tejus on 4/14/2016.
 */
public class DatabaseUtil extends SQLiteOpenHelper {
    private LogUtil log = new LogUtil(DatabaseUtil.class);

    private static final int DATABASE_VERSION = 2;
    //DB and tables
    private static final String DATABASE_NAME = "imagesearcher";
    private static final String TABLE_PHOTOS = "photos";

    //Columns for Images table
    private static final String KEY_PHOTO_ID = "id";
    private static final String KEY_PHOTO = "photo";

    SQLiteDatabase mDb;

    public DatabaseUtil(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        mDb = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_IMAGES_TABLE = "CREATE TABLE " + TABLE_PHOTOS + "("
                + KEY_PHOTO_ID + " STRING PRIMARY KEY," + KEY_PHOTO + " TEXT" + ")";
        db.execSQL(CREATE_IMAGES_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PHOTOS);
        onCreate(db);
    }

    /**
     * YOUR CODE HERE
     *
     * For part 1b, you should fill in the various CRUD operations below to manipulate the db
     * returned by getWritableDatabase() to store/load photos.
     */

}
