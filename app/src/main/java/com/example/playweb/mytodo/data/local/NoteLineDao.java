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
public interface NoteLineDao {

    @Query("SELECT * FROM " + Utils.NOTELINES_TABLE_NAME)
    List<NoteLineEntity> getAllNoteLines();

    @Query("SELECT * FROM " + Utils.NOTELINES_TABLE_NAME + " WHERE noteId = :noteId")
    List<NoteLineEntity> findNoteLineByNoteId(int noteId);

    @Insert
    void insertNoteLine(NoteLineEntity noteLineEntitie);

    @Insert
    void insertNoteLines(List<NoteLineEntity> noteLineEntities);

    @Update
    void updateNoteLine(NoteLineEntity noteLineEntity);

    @Delete
    void deleteNoteLine(NoteLineEntity noteLineEntity);

    @Query("DELETE FROM " + Utils.NOTELINES_TABLE_NAME)
    void deleteAll();
}
