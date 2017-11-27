package com.example.playweb.mytodo.data.local;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.playweb.mytodo.util.Utils;

import java.util.List;

/**
 * Created by Vladyslav on 23.11.2017
 */

@Dao
public interface NoteDao {

    @Query("SELECT * FROM " + Utils.NOTES_TABLE_NAME)
    List<NoteEntity> getAllNote();

    @Query("SELECT * FROM " + Utils.NOTES_TABLE_NAME + " WHERE title LIKE :title LIMIT 1")
    NoteEntity findByNoteTitle(String title);

    @Insert
    void insertNote(NoteEntity noteEntity);

    @Update
    void updateNote(NoteEntity noteEntity);

    @Delete
    void deleteNote(NoteEntity noteEntity);
}
