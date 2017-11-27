package com.example.playweb.mytodo;

import android.util.Log;

import com.example.playweb.mytodo.data.local.NoteLineEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by Vladyslav on 23.11.2017
 */

public class NotesHardcodeExample {
    private static String TAG = NotesHardcodeExample.class.getSimpleName();

    public static final int CORE_POOL_SIZE = 1;

    private static final String[] lines = {
            "Купить", "Продать", "Не забыть", "Расписание", "Предметы", "Дни рождения в этом месяце", "Распорядок на день", "Оплатить", "Чеки", "Чики Пуки"
    };

    private NotesHardcodeExample() {
        //empty private constructor
    }

    public interface Callback {
        void onSuccess(List<NoteLineEntity> noteLineEntityList);
    }

    private static List<NoteLineEntity> setNoteLines() {
        List<NoteLineEntity> list = new ArrayList<>();
        boolean isDone = false;

        for (String line : lines) {
            NoteLineEntity nle = new NoteLineEntity();
            nle.setNoteId((line.length() > 7)? 1:0);
            nle.setDone(isDone);
            nle.setLine(line);
            list.add(nle);
        }

        return list;
    }

    public static void setHardcodeDatabase() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d(TAG, "setHardcodeDatabase() called, db != null");
                AppNotes.get().getDatabase().noteLineDao().deleteAll();
                AppNotes.get().getDatabase().noteLineDao().insertNoteLines(setNoteLines());
            }
        }).start();
    }

    public static void requestToDbWithDelaySecs(int secs, final Callback callback) {
        final ScheduledExecutorService executor = Executors.newScheduledThreadPool(CORE_POOL_SIZE);
        executor.schedule(new Runnable() {
            @Override
            public void run() {
                final List<NoteLineEntity> noteLines = AppNotes.get().getDatabase().noteLineDao().getAllNoteLines();
                Log.d(TAG, "run() called. List<NoteLineEntity> != null");
                callback.onSuccess(noteLines);
            }
        }, secs*1000, TimeUnit.MILLISECONDS);
    }
}
