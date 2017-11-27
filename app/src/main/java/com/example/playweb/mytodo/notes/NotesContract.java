package com.example.playweb.mytodo.notes;

import android.support.annotation.NonNull;

import com.example.playweb.mytodo.BasePresenter;
import com.example.playweb.mytodo.BaseView;
import com.example.playweb.mytodo.data.Note;

import java.util.List;

/**
 * Created by Vladyslav on 27.11.2017
 */

public interface NotesContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean active);

        void showNotes(List<Note> note);

        void showAddNote();

        void showNoteDetailsUi(String noteId);

        void showNoteMarkedComplete();

        void showNoteMarkedActive();

        void showCompletedNoteCleared();

        void showLoadingNoteError();

        void showNoNote();

        void showNoActiveNote();

        void showNoCompletedNote();

        void showSuccessfullySavedMessage();

        boolean isActive();

    }

    interface Presenter extends BasePresenter {
        void result(int requestCode, int resultCode);

        void loadNotes();

        void addNewNote();

        void openNoteDetails(@NonNull Note requestedNote);

        void clearCompletedNotes();

    }
}
