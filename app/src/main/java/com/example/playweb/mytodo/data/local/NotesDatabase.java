package com.example.playweb.mytodo.data.local;

/**
 * Created by Vladyslav on 23.11.2017
 */

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

@Database(entities = {NoteEntity.class, NoteLineEntity.class}, version = 1)
public abstract class NotesDatabase extends RoomDatabase {

    private static NotesDatabase INSTANCE;

    public abstract NoteDao noteDao();
    public abstract NoteLineDao noteLineDao();

    private static final Object sLock = new Object();

    public static NotesDatabase getInstance(Context context) {
        synchronized (sLock) {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                        NotesDatabase.class, "Tasks.db")
                        .build();
            }
            return INSTANCE;
        }
    }
}
