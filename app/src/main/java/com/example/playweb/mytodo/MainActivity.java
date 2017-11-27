package com.example.playweb.mytodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.playweb.mytodo.notes.NotesFragment;
import com.example.playweb.mytodo.notes.NotesPresenter;
import com.example.playweb.mytodo.util.Utils;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private NotesPresenter notesPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*NotesHardcodeExample.setHardcodeDatabase();
        NotesHardcodeExample.requestToDbWithDelaySecs(3, new NotesHardcodeExample.Callback() {
            @Override
            public void onSuccess(final List<NoteLineEntity> noteLineEntityList) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (NoteLineEntity entity: noteLineEntityList) {
                            Log.d(TAG, entity.toString());
                        }
                    }
                });
            }
        });*/

        NotesFragment tasksFragment =
                (NotesFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (tasksFragment == null) {
            // Create the fragment
            tasksFragment = NotesFragment.newInstance();
            Utils.addFragmentToActivity(
                    getSupportFragmentManager(), tasksFragment, R.id.contentFrame);
        }

        notesPresenter = new NotesPresenter(
                Injection.provideNoteRepository(getApplicationContext()), tasksFragment
        );
    }
}
