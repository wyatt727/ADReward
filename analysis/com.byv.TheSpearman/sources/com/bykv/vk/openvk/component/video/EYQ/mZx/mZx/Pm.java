package com.bykv.vk.openvk.component.video.EYQ.mZx.mZx;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: VideoProxyDBHelper.java */
/* loaded from: classes.dex */
public class Pm extends SQLiteOpenHelper {
    public Pm(Context context) {
        super(context, "tt_open_sdk_video.db", (SQLiteDatabase.CursorFactory) null, 3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS video_http_header_t(_id INTEGER PRIMARY KEY AUTOINCREMENT,key TEXT,mime TEXT,contentLength INTEGER,flag INTEGER,extra TEXT)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        if (i == 1) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN flag INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
        } else if (i == 2) {
            sQLiteDatabase.execSQL("ALTER TABLE video_http_header_t ADD COLUMN extra TEXT DEFAULT ''");
        } else {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS video_http_header_t");
            onCreate(sQLiteDatabase);
        }
    }
}
