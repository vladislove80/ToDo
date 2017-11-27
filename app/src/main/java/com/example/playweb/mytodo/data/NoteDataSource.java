package com.example.playweb.mytodo.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Vladyslav on 24.11.2017
 */

public interface NoteDataSource {

    interface LoadNoteLinesCallback {

        void onLoaded(List<NoteLine> tasks);

        void onDataNotAvailable();
    }

    interface LoadNotesCallback {

        void onLoaded(List<Note> tasks);

        void onDataNotAvailable();
    }

    void getAllNoteLines(@NonNull LoadNoteLinesCallback callback);

    void getNoteLinesByNoteId(int noteId, @NonNull LoadNoteLinesCallback callback);

    void insertNoteLine(NoteLine noteLine);

    void insertNoteLines(List<NoteLine> noteLines);

    void updateNoteLine(NoteLine noteLine);

    void deleteNoteLine(NoteLine noteLine);

    void deleteNoteLines(List<NoteLine> noteLines);

    void getAllNotes(@NonNull LoadNotesCallback callback);

    void getNotesByNoteId(int noteId, @NonNull LoadNotesCallback callback);

    void insertNote(NoteLine noteLine);

    void insertNote(List<NoteLine> noteLines);

    void updateNote(NoteLine noteLine);

    void deleteNote(NoteLine noteLine);

    void deleteNote(List<NoteLine> noteLines);


}
