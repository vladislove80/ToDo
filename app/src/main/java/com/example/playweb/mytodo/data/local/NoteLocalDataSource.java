package com.example.playweb.mytodo.data.local;

import android.support.annotation.NonNull;

import com.example.playweb.mytodo.data.NoteDataSource;
import com.example.playweb.mytodo.data.NoteLine;
import com.example.playweb.mytodo.util.AppExecutors;

import java.util.List;

/**
 * Created by Vladyslav on 27.11.2017
 */

public class NoteLocalDataSource implements NoteDataSource {

    private static NoteLocalDataSource INSTANCE;
    private NoteDao noteDao;
    private AppExecutors appExecutors;

    private NoteLocalDataSource(@NonNull AppExecutors appExecutors,
                                @NonNull NoteDao notesDao) {
        this.appExecutors = appExecutors;
        this.noteDao = noteDao;
    }

    public static synchronized NoteLocalDataSource getInstance(@NonNull AppExecutors appExecutors,
                                                  @NonNull NoteDao notesDao) {
        if (INSTANCE == null) {
                INSTANCE = new NoteLocalDataSource(appExecutors, notesDao);
        }
        return INSTANCE;
    }

    @Override
    public void getAllNoteLines(@NonNull LoadNoteLinesCallback callback) {

    }

    @Override
    public void getNoteLinesByNoteId(int noteId, @NonNull LoadNoteLinesCallback callback) {

    }

    @Override
    public void insertNoteLine(NoteLine noteLine) {

    }

    @Override
    public void insertNoteLines(List<NoteLine> noteLines) {

    }

    @Override
    public void updateNoteLine(NoteLine noteLine) {

    }

    @Override
    public void deleteNoteLine(NoteLine noteLine) {

    }

    @Override
    public void deleteNoteLines(List<NoteLine> noteLines) {

    }

    @Override
    public void getAllNotes(@NonNull LoadNotesCallback callback) {

    }

    @Override
    public void getNotesByNoteId(int noteId, @NonNull LoadNotesCallback callback) {

    }

    @Override
    public void insertNote(NoteLine noteLine) {

    }

    @Override
    public void insertNote(List<NoteLine> noteLines) {

    }

    @Override
    public void updateNote(NoteLine noteLine) {

    }

    @Override
    public void deleteNote(NoteLine noteLine) {

    }

    @Override
    public void deleteNote(List<NoteLine> noteLines) {

    }
}
