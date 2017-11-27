package com.example.playweb.mytodo.data.remote;

import android.support.annotation.NonNull;

import com.example.playweb.mytodo.data.NoteDataSource;
import com.example.playweb.mytodo.data.NoteLine;

import java.util.List;

/**
 * Created by Vladyslav on 27.11.2017
 */

public class NoteRemoteDataSource implements NoteDataSource {
    private static NoteRemoteDataSource INSTANCE;

    // Prevent direct instantiation.
    private NoteRemoteDataSource() {}

    public static NoteRemoteDataSource getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new NoteRemoteDataSource();
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
