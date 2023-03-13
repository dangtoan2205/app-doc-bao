package com.example.news.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    static final String dbName = "NewsData";
    static final int dbVision = 2;
    public DbHelper(@Nullable Context context) {
        super(context, dbName, null, dbVision);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String table_news = "create table News(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, link TEXT NOT NULL)";
        db.execSQL(table_news);

        String data = "INSERT INTO News(name, link) VALUES " +
                "('', '')" +
                "('', '')" +
                "('', '')" +
                "('', '')" +
                "('', '')" +
                "('', '')" +
                "('', '')" +
                "('Dự báo thời tiết', 'https://vtv.vn/du-bao-thoi-tiet.rss')";
        db.execSQL(data);
    }

//    link vtv rss
//    https://vtv.vn/rss.htm


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        onCreate(db);
    }
}
