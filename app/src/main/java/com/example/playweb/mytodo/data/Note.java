package com.example.playweb.mytodo.data;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

/**
 * Created by Vladyslav on 22.11.2017
 */

public class Note {
    private int id;
    private String title;
    private List<NoteLine> noteLines;
    private boolean hasLines;
    private String noteText;
    private long creationTime;
    private long editTime;

    public Note() {
        this.creationTime = getCurrentTime();
        this.editTime = creationTime;
    }

    public void addNoteLine(@NonNull NoteLine note) {
        if (noteLines == null) {
            noteLines = new ArrayList<>();
        }
        noteLines.add(note);
        hasLines = true;
        editTime = getCurrentTime();
    }

    public int getId() {
        return id;
    }

    public long getCreationTime() {
        return creationTime;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        editTime = getCurrentTime();
    }

    public List<NoteLine> getNoteLines() {
        return Collections.unmodifiableList(noteLines);
    }

    public long getEditTime() {
        return editTime;
    }

    private long getCurrentTime() {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        return calendar.getTime().getTime();
    }

    public boolean hasNoteLines() {
        return hasLines;
    }

    public void clearNoteLines() {
        hasLines = false;
    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }
}
