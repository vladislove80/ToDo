package com.example.playweb.mytodo;

import android.app.Application;
import android.arch.persistence.room.Room;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.playweb.mytodo.data.local.NotesDatabase;
import com.example.playweb.mytodo.util.Utils;

import static android.content.ContentValues.TAG;

/**
 * Created by Vladyslav on 23.11.2017
 */

public class AppNotes extends Application {

    public static AppNotes INSTANCE;

    private NotesDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        database = createDataBase();
        INSTANCE = this;
        Log.d(TAG, "onCreate() called: Notes DB is created!");
    }

    public static AppNotes get() {
        return INSTANCE;
    }

    @NonNull
    public NotesDatabase getDatabase() {
        return (database != null)? database : createDataBase();
    }

    @NonNull
    private NotesDatabase createDataBase() {
        return Room.databaseBuilder(getApplicationContext(), NotesDatabase.class, Utils.DATABASE_NAME).build();
    }
}
