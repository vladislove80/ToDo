package com.example.playweb.mytodo.notes;

import android.support.annotation.NonNull;

import com.example.playweb.mytodo.data.Note;
import com.example.playweb.mytodo.data.NotesRepository;

/**
 * Created by Vladyslav on 27.11.2017
 */

public class NotesPresenter implements NotesContract.Presenter {

    private final NotesRepository notesRepository;

    private final NotesContract.View notesView;
    private boolean firstLoad = true;

    public NotesPresenter(@NonNull NotesRepository notesRepository, @NonNull NotesContract.View notesView) {
        this.notesRepository = notesRepository;
        this.notesView = notesView;
        notesView.setPresenter(this);
    }

    @Override
    public void start() {
        loadNotes();
    }

    @Override
    public void result(int requestCode, int resultCode) {
        notesView.showSuccessfullySavedMessage();
    }

    @Override
    public void loadNotes() {

    }

    @Override
    public void addNewNote() {

    }

    @Override
    public void openNoteDetails(@NonNull Note requestedNote) {

    }

    @Override
    public void clearCompletedNotes() {

    }
}
