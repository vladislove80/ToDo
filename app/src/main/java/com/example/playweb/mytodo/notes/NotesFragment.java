package com.example.playweb.mytodo.notes;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.playweb.mytodo.R;
import com.example.playweb.mytodo.data.Note;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vladyslav on 27.11.2017
 */

public class NotesFragment extends Fragment implements NotesContract.View {

    private NotesContract.Presenter presenter;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private TextView filteringLabelView;
    private LinearLayout tasksView;
    private View noTasksView;
    private ImageView noTaskIcon;
    private TextView noTaskMainView;
    private TextView noTaskAddView;

    public NotesFragment() {
    }

    public static NotesFragment newInstance() {
        return new NotesFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new NotesListAdapter(new ArrayList<Note>(0));
    }

    @Override
    public void onResume() {
        super.onResume();
        presenter.start();
    }

    @Override
    public void setPresenter(@NonNull NotesContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.notes_fragment, container,false);

        // Set up tasks view
        recyclerView = view.findViewById(R.id.tasks_list);
        recyclerView.setAdapter(adapter);
        filteringLabelView = view.findViewById(R.id.filteringLabel);
        tasksView = view.findViewById(R.id.tasksLL);

        // Set up  no tasks view
        noTasksView = view.findViewById(R.id.noTasks);
        noTaskIcon = view.findViewById(R.id.noTasksIcon);
        noTaskMainView = view.findViewById(R.id.noTasksMain);
        noTaskAddView = view.findViewById(R.id.noTasksAdd);
        noTaskAddView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        // Set up progress indicator
        final SwipeRefreshLayout swipeRefreshLayout =
                (SwipeRefreshLayout) view.findViewById(R.id.refresh_layout);
        swipeRefreshLayout.setColorSchemeColors(
                ContextCompat.getColor(getActivity(), R.color.colorPrimary),
                ContextCompat.getColor(getActivity(), R.color.colorAccent),
                ContextCompat.getColor(getActivity(), R.color.colorPrimaryDark)
        );
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.loadNotes();
            }
        });
        return view;
    }

    @Override
    public void setLoadingIndicator(boolean active) {

    }

    @Override
    public void showNotes(List<Note> note) {

    }

    @Override
    public void showAddNote() {

    }

    @Override
    public void showNoteDetailsUi(String noteId) {

    }

    @Override
    public void showNoteMarkedComplete() {

    }

    @Override
    public void showNoteMarkedActive() {

    }

    @Override
    public void showCompletedNoteCleared() {

    }

    @Override
    public void showLoadingNoteError() {

    }

    @Override
    public void showNoNote() {

    }

    @Override
    public void showNoActiveNote() {

    }

    @Override
    public void showNoCompletedNote() {

    }

    @Override
    public void showSuccessfullySavedMessage() {

    }

    @Override
    public boolean isActive() {
        return false;
    }
}
