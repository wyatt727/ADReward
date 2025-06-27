package com.mbridge.msdk.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* compiled from: DatabaseManager.java */
/* loaded from: classes4.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f2716a;
    private final String b;
    private final Object c = new Object();

    public c(b bVar, String str) {
        this.f2716a = bVar;
        this.b = str;
    }

    private static boolean a(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    public final long a(i iVar) {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            long jInsert = -1;
            if (y.a(this.f2716a)) {
                return -1L;
            }
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (a(writableDatabase)) {
                return -1L;
            }
            try {
                try {
                    d(writableDatabase);
                    ContentValues contentValues = new ContentValues(16);
                    e eVarC = iVar.c();
                    contentValues.put("name", eVarC.a());
                    contentValues.put("type", Integer.valueOf(eVarC.b()));
                    contentValues.put("time_stamp", Long.valueOf(eVarC.f()));
                    contentValues.put("properties", eVarC.d().toString());
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(eVarC.c()));
                    contentValues.put("state", Integer.valueOf(iVar.e()));
                    contentValues.put("report_count", Integer.valueOf(iVar.d()));
                    contentValues.put("uuid", eVarC.e());
                    int i = 0;
                    contentValues.put("ignore_max_timeout", Integer.valueOf(eVarC.j() ? 0 : 1));
                    if (!eVarC.k()) {
                        i = 1;
                    }
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(i));
                    contentValues.put("invalid_time", Long.valueOf(iVar.g()));
                    jInsert = writableDatabase.insert(this.b, null, contentValues);
                    c(writableDatabase);
                } catch (Exception e2) {
                    if (a.f2688a) {
                        Log.e("TrackManager", "insert: " + e2.getMessage());
                    }
                }
                return jInsert;
            } finally {
                b(writableDatabase);
            }
        }
    }

    public final List<i> a(int i) {
        SQLiteDatabase writableDatabase;
        Throwable th;
        Cursor cursorQuery;
        List<i> list;
        synchronized (this.c) {
            Cursor cursor = null;
            List<i> listB = null;
            cursor = null;
            if (y.a(this.f2716a)) {
                return null;
            }
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (a(writableDatabase)) {
                return null;
            }
            try {
                try {
                    d(writableDatabase);
                    cursorQuery = writableDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i));
                } catch (Exception e2) {
                    e = e2;
                    list = null;
                }
            } catch (Throwable th2) {
                Cursor cursor2 = cursor;
                th = th2;
                cursorQuery = cursor2;
            }
            try {
                listB = y.b(cursorQuery);
                c(writableDatabase);
                b(writableDatabase);
                y.a(cursorQuery);
            } catch (Exception e3) {
                e = e3;
                List<i> list2 = listB;
                cursor = cursorQuery;
                list = list2;
                if (a.f2688a) {
                    Log.e("TrackManager", "getAvailable: " + e.getMessage());
                }
                b(writableDatabase);
                y.a(cursor);
                listB = list;
                return listB;
            } catch (Throwable th3) {
                th = th3;
                b(writableDatabase);
                y.a(cursorQuery);
                throw th;
            }
            return listB;
        }
    }

    public final int a() {
        SQLiteDatabase writableDatabase;
        synchronized (this.c) {
            int iMax = 0;
            if (y.a(this.f2716a)) {
                return 0;
            }
            Cursor cursorQuery = null;
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e.getMessage());
                }
                writableDatabase = null;
            }
            if (a(writableDatabase)) {
                return 0;
            }
            try {
                try {
                    d(writableDatabase);
                    cursorQuery = writableDatabase.query(this.b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToNext()) {
                        iMax = Math.max(cursorQuery.getCount(), 0);
                    }
                    c(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e2) {
                    if (a.f2688a) {
                        Log.e("TrackManager", "getAvailableCount: " + e2.getMessage());
                    }
                    b(writableDatabase);
                }
                y.a(cursorQuery);
                return iMax;
            } catch (Throwable th) {
                b(writableDatabase);
                y.a(cursorQuery);
                throw th;
            }
        }
    }

    public final void a(List<i> list) {
        synchronized (this.c) {
            if (y.a(this.f2716a) || y.a((List<?>) list)) {
                return;
            }
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e.getMessage());
                }
            }
            if (a(writableDatabase)) {
                return;
            }
            try {
                try {
                    d(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        writableDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(writableDatabase);
                } catch (Exception e2) {
                    if (a.f2688a) {
                        Log.e("TrackManager", "updateReportStateReporting: " + e2.getMessage());
                    }
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public final void b(List<i> list) {
        synchronized (this.c) {
            if (y.a(this.f2716a) || y.a((List<?>) list)) {
                return;
            }
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e.getMessage());
                }
            }
            if (a(writableDatabase)) {
                return;
            }
            try {
                try {
                    d(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        writableDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(writableDatabase);
                } catch (Exception e2) {
                    if (a.f2688a) {
                        Log.e("TrackManager", "updateReportStateSuccess: " + e2.getMessage());
                    }
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public final void c(List<i> list) {
        synchronized (this.c) {
            if (y.a(this.f2716a) || y.a((List<?>) list)) {
                return;
            }
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e.getMessage());
                }
            }
            if (a(writableDatabase)) {
                return;
            }
            try {
                try {
                    d(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(iVar.e()));
                        contentValues.put("report_count", Integer.valueOf(iVar.d()));
                        writableDatabase.update(this.b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    c(writableDatabase);
                } catch (Exception e2) {
                    if (a.f2688a) {
                        Log.e("TrackManager", "updateReportStateFailed: " + e2.getMessage());
                    }
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public final int b() {
        synchronized (this.c) {
            int iDelete = -1;
            if (y.a(this.f2716a)) {
                return -1;
            }
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e.getMessage());
                }
            }
            try {
                if (a(writableDatabase)) {
                    return -1;
                }
                try {
                    d(writableDatabase);
                    iDelete = writableDatabase.delete(this.b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    c(writableDatabase);
                } catch (Exception e2) {
                    if (a.f2688a) {
                        Log.e("TrackManager", "deleteInvalidEvents: " + e2.getMessage());
                    }
                }
                return iDelete;
            } finally {
                b(writableDatabase);
            }
        }
    }

    public final void c() {
        synchronized (this.c) {
            if (y.a(this.f2716a)) {
                return;
            }
            SQLiteDatabase writableDatabase = null;
            try {
                writableDatabase = this.f2716a.getWritableDatabase();
            } catch (Exception e) {
                if (a.f2688a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e.getMessage());
                }
            }
            try {
                if (a(writableDatabase)) {
                    return;
                }
                try {
                    d(writableDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    writableDatabase.update(this.b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    c(writableDatabase);
                } catch (Exception e2) {
                    if (a.f2688a) {
                        Log.e("TrackManager", "updateReportStateForReporting: " + e2.getMessage());
                    }
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e) {
            if (a.f2688a) {
                Log.e("TrackManager", "endTransaction: ", e);
            }
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e) {
            if (a.f2688a) {
                Log.e("TrackManager", "transactionSuccess: ", e);
            }
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (y.a(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e) {
            if (a.f2688a) {
                Log.e("TrackManager", "beginTransaction: ", e);
            }
        }
    }
}
