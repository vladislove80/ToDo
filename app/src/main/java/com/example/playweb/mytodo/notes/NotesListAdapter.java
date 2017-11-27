package com.example.playweb.mytodo.notes;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.playweb.mytodo.R;
import com.example.playweb.mytodo.data.Note;
import com.example.playweb.mytodo.data.NoteLine;

import java.util.List;

/**
 * Created by Vladyslav on 27.11.2017
 */

public class NotesListAdapter extends RecyclerView.Adapter<NoteViewHolder> {

    private final List<Note> list;
    private Context context;

    public NotesListAdapter(List<Note> list) {
        this.list = list;
    }

    @Override
    public NoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context)
                .inflate(R.layout.note_holder, parent, false);

        return new NoteViewHolder(v);
    }

    @Override
    public void onBindViewHolder(NoteViewHolder holder, int position) {
        Note note = list.get(position);
        holder.title.setText(note.getTitle());
        if (note.hasNoteLines()) {
            for (NoteLine nl : note.getNoteLines()) {
                TextView htext = new TextView(context);
                htext.setText(nl.getLine());
                htext.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            }
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
