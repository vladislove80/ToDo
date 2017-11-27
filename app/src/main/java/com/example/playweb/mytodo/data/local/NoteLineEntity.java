package com.example.playweb.mytodo.data.local;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Vladyslav on 23.11.2017
 */

@Entity
public class NoteLineEntity {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "noteId")
    private int noteId;

    @ColumnInfo(name = "isDone")
    private boolean isDone;

    @ColumnInfo(name = "line")
    private String line;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNoteId() {
        return noteId;
    }

    public void setNoteId(int noteId) {
        this.noteId = noteId;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "NoteLineEntity{" +
                "id=" + id +
                ", noteId=" + noteId +
                ", isDone=" + isDone +
                ", line='" + line + '\'' +
                '}';
    }
}
