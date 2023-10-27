package com.example.android_security_22770224;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public static final String DBNAME = "LoginDB.db";

    public DbHelper( Context context) {
        super(context, "LoginDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase myDb) {
        myDb.execSQL(("create Table users(username TEXT primary key,password TEXT)"));
    }

    @Override
    public void onUpgrade(SQLiteDatabase myDb, int i, int i1) {
        myDb.execSQL("drop Table if exists users");
    }

    public Boolean insertUsers(String username , String password){
        SQLiteDatabase myDb = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("username",username);
        contentValues.put("password",password);
        long result = myDb.insert("users",null,contentValues);
        if(result==1)return false;
        else
            return true;
    }
    public Boolean checkUserName(String username){
        SQLiteDatabase myDb = this.getWritableDatabase();
        Cursor cursor = myDb.rawQuery("select * from users where username = ?",new String[] {username});
        if(cursor.getCount()>0){
            return true;
        }else
            return false;
    }

    public Boolean checkUserNamePassword(String username,String password){
        SQLiteDatabase myDb = this.getWritableDatabase();
        Cursor cursor = myDb.rawQuery("select * from users where username = ? and password = ?",new String[] {username,password});
        if(cursor.getCount()>0){
            return true;
        }else
            return false;
    }
}
