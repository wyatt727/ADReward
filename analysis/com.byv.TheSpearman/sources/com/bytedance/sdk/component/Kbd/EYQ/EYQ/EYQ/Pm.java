package com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.Kbd.EYQ.QQ;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DatabaseHelper.java */
/* loaded from: classes2.dex */
public class Pm extends SQLiteOpenHelper {
    final Context EYQ;

    public Pm(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.EYQ = context;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            EYQ(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    private void EYQ(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.EYQ.mZx(QQ.VwS().Pm().mZx()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.Pm.Td(QQ.VwS().Pm().EYQ()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.VwS.Td(QQ.VwS().Pm().Pm()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.EYQ.IPb.EYQ(QQ.VwS().Pm().Kbd()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.Kbd.EYQ.IPb.IPb.mZx());
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            if (i > i2) {
                mZx(sQLiteDatabase);
                EYQ(sQLiteDatabase);
            } else {
                EYQ(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private void mZx(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListTd = Td(sQLiteDatabase);
        if (arrayListTd == null || arrayListTd.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListTd.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
        }
    }

    private ArrayList<String> Td(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
