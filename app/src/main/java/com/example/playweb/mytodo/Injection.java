package com.example.playweb.mytodo;

import android.content.Context;
import android.support.annotation.NonNull;

import com.example.playweb.mytodo.data.NotesRepository;
import com.example.playweb.mytodo.data.local.NoteLocalDataSource;
import com.example.playweb.mytodo.data.local.NotesDatabase;
import com.example.playweb.mytodo.data.remote.NoteRemoteDataSource;
import com.example.playweb.mytodo.util.AppExecutors;

/**
 * Created by Vladyslav on 24.11.2017
 */

public class Injection {
    public static NotesRepository provideNoteRepository(@NonNull Context context) {
        NotesDatabase database = NotesDatabase.getInstance(context);
        return NotesRepository.getInstance(
                NoteLocalDataSource.getInstance(new AppExecutors(), database.noteDao()),
                NoteRemoteDataSource.getInstance()
        );
    }
}
