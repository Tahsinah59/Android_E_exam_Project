package com.example.asus.helloworld;

import android.content.ContentValues;
        import android.content.Context;
        import android.content.Intent;
        import android.database.Cursor;
        import android.database.sqlite.SQLiteDatabase;
        import android.database.sqlite.SQLiteOpenHelper;

public class Storage extends SQLiteOpenHelper {

    public static  final  String STORAGE_NAME = "ROOM";
    public static  final  String TABLE_NAME = "RUTIN";
    public static Integer numberOfRow = new Integer(1);

    public static  final  String COL_0 = "keyVal";
    public static  final  String COL_1 = "answer";


    private static final int VERSION = 1;

    public Storage(Context context) {
        super(context, STORAGE_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table "+TABLE_NAME+"(keyVal INTEGER PRIMARY KEY,answer TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);
    }

    /// Insert Data into DATABASE
    public boolean insert(String temp1)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_0,numberOfRow);
        values.put(COL_1,temp1);

        long isWell = db.insert(TABLE_NAME,null,values);
        if(isWell == -1)
            return false;
        else {
            numberOfRow++;
            return true;
        }
    }

    /// Show Data from DATABASE
    public Cursor showMe()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from "+TABLE_NAME,null);
        return cursor;
    }

    //// Update data over DATABASE
    public boolean updateData(String temp0,String temp1)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(COL_0,temp0);
        values.put(COL_1,temp1);

        db.update(TABLE_NAME,values,COL_0+" = ?",new String[]{temp0});

        return  true;
    }

    //////     Delete data from DATABASE
    public void deleteData()
    {
        SQLiteDatabase db = this.getWritableDatabase();
        for(int n=0;n<5;n++) {
            numberOfRow--;
            db.delete(TABLE_NAME, COL_0 + " = ?", new String[]{numberOfRow.toString()});
        }
    }
}
