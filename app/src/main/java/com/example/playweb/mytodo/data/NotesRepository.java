package com.example.playweb.mytodo.data;

import android.support.annotation.NonNull;

import java.util.List;

/**
 * Created by Vladyslav on 24.11.2017
 */

public class NotesRepository implements NoteDataSource {
    private static NotesRepository INSTANCE = null;
    private final NoteDataSource notesLocalDataSource;
    private final NoteDataSource notesRemoteDataSource;

    private NotesRepository(@NonNull NoteDataSource notesLocalDataSource,
                            @NonNull NoteDataSource notesRemoteDataSource) {
        this.notesLocalDataSource = notesLocalDataSource;
        this.notesRemoteDataSource = notesRemoteDataSource;
    }


    public static NotesRepository getInstance(NoteDataSource notesLocalDataSource, NoteDataSource notesRemoteDataSource) {
        if (INSTANCE == null) {
            INSTANCE = new NotesRepository(notesLocalDataSource, notesRemoteDataSource);
        }
        return INSTANCE;
    }

    /**
     * Gets tasks from cache, local data source (SQLite) or remote data source, whichever is
     * available first.
     * <p>
     * Note: {@link LoadNoteLinesCallback#onDataNotAvailable()} is fired if all data sources fail to
     * get the data.
     */

    @Override
    public void getAllNoteLines(@NonNull LoadNoteLinesCallback callback) {

        // Respond immediately with cache if available and not dirty

        if (false) {
            // If the cache is dirty we need to fetch new data from the network.

        } else {
            // Query the local storage if available. If not, query the network.
        }
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
