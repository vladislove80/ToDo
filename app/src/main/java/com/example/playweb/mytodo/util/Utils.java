package com.example.playweb.mytodo.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by Vladyslav on 24.11.2017
 */

public class Utils {
    public static final String DATABASE_NAME = "notes_database";
    public static final String NOTELINES_TABLE_NAME = "NoteLineEntity";
    public static final String NOTES_TABLE_NAME = "NoteEntity";

    /**
     * The {@code fragment} is added to the container view with id {@code frameId}. The operation is
     * performed by the {@code fragmentManager}.
     *
     */
    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                            @NonNull Fragment fragment, int frameId) {
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(frameId, fragment);
        ft.commit();
    }
}
