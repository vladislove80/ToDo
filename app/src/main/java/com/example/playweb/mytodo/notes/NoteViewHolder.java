package com.example.playweb.mytodo.notes;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.playweb.mytodo.R;

/**
 * Created by Vladyslav on 27.11.2017
 */
public class NoteViewHolder extends RecyclerView.ViewHolder {
    public TextView title;
    public LinearLayout container;

    public NoteViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.note_title);
        container = itemView.findViewById(R.id.note_container);
    }
}
