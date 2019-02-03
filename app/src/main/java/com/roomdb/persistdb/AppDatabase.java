package com.roomdb.persistdb;

import android.content.Context;

import com.roomdb.persistdb.dao.UserDao;
import com.roomdb.persistdb.entity.User;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase appDatabase = null;
    private static final String DBNAME = "myappdatabase";

    public static AppDatabase getInstance(Context context) {
        if (appDatabase == null) {

            appDatabase = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, DBNAME).build();
        }
        return appDatabase;
    }

    public abstract UserDao getUserDao();
}
