package com.my.tracker.obfuscated;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;

/* loaded from: classes4.dex */
final class i0 {
    static long x = -1;
    private final SQLiteDatabase b;
    private final SQLiteStatement d;
    private final SQLiteStatement e;
    private final SQLiteStatement f;
    private final SQLiteStatement g;
    private final SQLiteStatement h;
    private final SQLiteStatement i;
    private final SQLiteStatement j;
    private final SQLiteStatement k;
    private final SQLiteStatement l;
    private final SQLiteStatement m;
    private final SQLiteStatement n;
    private final SQLiteStatement o;
    private final SQLiteStatement p;
    private final SQLiteStatement q;
    private final SQLiteStatement r;
    private final SQLiteStatement s;
    private final SQLiteStatement t;
    private final SQLiteStatement u;
    private final SQLiteStatement v;
    private final SQLiteStatement w;

    /* renamed from: a, reason: collision with root package name */
    private final String[] f4233a = new String[1];
    private final h c = new h();

    static abstract class a implements Closeable {

        /* renamed from: a, reason: collision with root package name */
        final Cursor f4234a;

        a(Cursor cursor) {
            this.f4234a = cursor;
        }

        final boolean a() {
            return this.f4234a.moveToNext();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            try {
                this.f4234a.close();
            } catch (Throwable th) {
                z0.b("AbstractReader error: error while closing cursor", th);
            }
        }

        protected void finalize() throws Throwable {
            super.finalize();
            close();
        }
    }

    static final class b extends a {
        b(Cursor cursor) {
            super(cursor);
        }

        String b() {
            return this.f4234a.getString(1);
        }

        long c() {
            return this.f4234a.getLong(0);
        }

        String d() {
            return this.f4234a.getString(2);
        }

        String e() {
            return this.f4234a.getString(3);
        }

        int f() {
            return this.f4234a.getInt(4);
        }

        long g() {
            return this.f4234a.getLong(5);
        }
    }

    static final class c extends a {
        c(Cursor cursor) {
            super(cursor);
        }

        byte[] b() {
            return this.f4234a.getBlob(3);
        }

        long c() {
            return this.f4234a.getLong(0);
        }

        long d() {
            return this.f4234a.getLong(4);
        }

        long e() {
            return this.f4234a.getLong(1);
        }
    }

    static final class d extends a {
        d(Cursor cursor) {
            super(cursor);
        }

        long b() {
            return this.f4234a.getLong(1);
        }
    }

    static final class e extends a {
        e(Cursor cursor) {
            super(cursor);
        }

        String b() {
            return this.f4234a.getString(1);
        }

        long c() {
            return this.f4234a.getLong(0);
        }

        String d() {
            return this.f4234a.getString(2);
        }

        long e() {
            return this.f4234a.getLong(3);
        }
    }

    static final class f extends a {
        f(Cursor cursor) {
            super(cursor);
        }

        long b() {
            return this.f4234a.getLong(0);
        }

        String c() {
            return this.f4234a.getString(1);
        }

        long d() {
            return this.f4234a.isNull(2) ? i0.x : this.f4234a.getLong(2);
        }

        long e() {
            return this.f4234a.getLong(3);
        }
    }

    static final class g extends a {
        g(Cursor cursor) {
            super(cursor);
        }

        long b() {
            return this.f4234a.getLong(2);
        }

        long c() {
            return this.f4234a.getLong(1);
        }

        boolean d() {
            return this.f4234a.isNull(2);
        }
    }

    static final class h implements SQLiteDatabase.CursorFactory {

        /* renamed from: a, reason: collision with root package name */
        long f4235a;
        byte[] b;

        h() {
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            sQLiteQuery.bindLong(1, this.f4235a);
            sQLiteQuery.bindBlob(2, this.b);
            return new SQLiteCursor(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    private i0(SQLiteDatabase sQLiteDatabase) {
        this.b = sQLiteDatabase;
        this.d = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events(type, major, body) VALUES (?, ?, ?)");
        this.e = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_events_timestamps(eid, ts) VALUES (?, ?)");
        this.f = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions(name, ts_start) VALUES (?, ?)");
        this.g = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_sessions_timestamps(sid, ts_start, ts_end) VALUES (?, ?, ?)");
        this.h = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_params(key, value) VALUES (?, ?)");
        this.i = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_raw_purchases(data, signature, ts) VALUES (?, ?, ?)");
        this.j = sQLiteDatabase.compileStatement("INSERT OR IGNORE INTO table_huawei_appgallery_raw_purchases(data, signature, signature_algorithm, source, ts) VALUES (?, ?, ?, ?, ?)");
        this.k = sQLiteDatabase.compileStatement("UPDATE table_events SET ts_skipped=?  WHERE id=?");
        this.l = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_start=?, ts_skipped=?  WHERE id=?");
        this.m = sQLiteDatabase.compileStatement("UPDATE table_params SET value=?  WHERE key=?");
        this.n = sQLiteDatabase.compileStatement("UPDATE table_sessions SET ts_skipped=0");
        this.o = sQLiteDatabase.compileStatement("DELETE FROM table_events");
        this.s = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps WHERE rowid IN (SELECT rowid FROM table_events_timestamps WHERE eid=?  ORDER BY ts LIMIT ?)");
        this.p = sQLiteDatabase.compileStatement("DELETE FROM table_events_timestamps");
        this.q = sQLiteDatabase.compileStatement("DELETE FROM table_sessions WHERE ts_start IS NULL");
        this.t = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps WHERE rowid IN (SELECT rowid FROM table_sessions_timestamps WHERE sid=?  ORDER BY ts_start LIMIT ?)");
        this.r = sQLiteDatabase.compileStatement("DELETE FROM table_sessions_timestamps");
        this.u = sQLiteDatabase.compileStatement("DELETE FROM table_params WHERE key=?");
        this.v = sQLiteDatabase.compileStatement("DELETE FROM table_raw_purchases WHERE id=?");
        this.w = sQLiteDatabase.compileStatement("DELETE FROM table_huawei_appgallery_raw_purchases WHERE id=?");
    }

    static i0 a(String str, Context context) {
        try {
            String str2 = "mytracker_" + str + ".db";
            SQLiteDatabase sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
            if (sQLiteDatabaseOpenOrCreateDatabase == null) {
                z0.b("MyTrackerDatabase error: can't open database");
                return null;
            }
            if (sQLiteDatabaseOpenOrCreateDatabase.getVersion() != 9) {
                sQLiteDatabaseOpenOrCreateDatabase.close();
                context.deleteDatabase(str2);
                sQLiteDatabaseOpenOrCreateDatabase = context.openOrCreateDatabase(str2, 0, null);
                sQLiteDatabaseOpenOrCreateDatabase.setVersion(9);
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events(id INTEGER PRIMARY KEY AUTOINCREMENT, type INTEGER NOT NULL, major INTEGER NOT NULL, body BLOB NOT NULL, ts_skipped INTEGER NOT NULL DEFAULT 0, UNIQUE(type, body))");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_eventsmajor ON table_events(major)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_events_timestamps(eid INTEGER NOT NULL, ts INTEGER NOT NULL)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_events_timestampseid ON table_events_timestamps(eid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_params(key TEXT PRIMARY KEY, value INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_paramskey ON table_params(key)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions(id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL UNIQUE, ts_start INTEGER, ts_skipped INTEGER NOT NULL DEFAULT 0)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessionsname ON table_sessions(name)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_sessions_timestamps(sid INTEGER NOT NULL, ts_start INTEGER NOT NULL, ts_end INTEGER)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE INDEX IF NOT EXISTS table_sessions_timestampssid ON table_sessions_timestamps(sid)");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, ts INTEGER NOT NULL )");
                sQLiteDatabaseOpenOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS table_huawei_appgallery_raw_purchases(id INTEGER PRIMARY KEY AUTOINCREMENT, data TEXT NOT NULL, signature TEXT NOT NULL, signature_algorithm TEXT NOT NULL, source INTEGER NOT NULL, ts INTEGER NOT NULL )");
            }
            return new i0(sQLiteDatabaseOpenOrCreateDatabase);
        } catch (Throwable th) {
            z0.b("MyTrackerDatabase error: exception occurred while initialization database", th);
            return null;
        }
    }

    long a(int i, byte[] bArr, boolean z) {
        this.d.bindLong(1, i);
        this.d.bindLong(2, z ? 1L : 0L);
        this.d.bindBlob(3, bArr);
        return this.d.executeInsert();
    }

    long a(long j, long j2) {
        this.s.bindLong(1, j);
        this.s.bindLong(2, j2);
        return this.s.executeUpdateDelete();
    }

    long a(long j, byte[] bArr) {
        h hVar = this.c;
        hVar.f4235a = j;
        hVar.b = bArr;
        Cursor cursorRawQueryWithFactory = this.b.rawQueryWithFactory(hVar, "SELECT COUNT(*)  FROM table_events WHERE type=?  AND body=?", null, null);
        try {
            if (!cursorRawQueryWithFactory.moveToNext()) {
                cursorRawQueryWithFactory.close();
                return 0L;
            }
            long j2 = cursorRawQueryWithFactory.getLong(0);
            cursorRawQueryWithFactory.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQueryWithFactory != null) {
                try {
                    cursorRawQueryWithFactory.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    long a(String str, long j) {
        this.f.bindString(1, str);
        this.f.bindLong(2, j);
        return this.f.executeInsert();
    }

    long a(String str, String str2, long j) {
        this.i.bindString(1, str);
        this.i.bindString(2, str2);
        this.i.bindLong(3, j);
        return this.i.executeInsert();
    }

    long a(String str, String str2, String str3, int i, long j) {
        this.j.bindString(1, str);
        this.j.bindString(2, str2);
        this.j.bindString(3, str3);
        this.j.bindLong(4, i);
        this.j.bindLong(5, j);
        return this.j.executeInsert();
    }

    f a(String str) {
        String[] strArr = this.f4233a;
        strArr[0] = str;
        return new f(this.b.rawQuery("SELECT id, name, ts_start, ts_skipped FROM table_sessions WHERE name=?  LIMIT 1", strArr));
    }

    void a() {
        this.n.execute();
    }

    void a(long j) {
        this.w.bindLong(1, j);
        this.w.execute();
    }

    void a(long j, long j2, long j3) {
        if (j2 != x) {
            this.l.bindLong(1, j2);
        } else {
            this.l.bindNull(1);
        }
        this.l.bindLong(2, j3);
        this.l.bindLong(3, j);
        this.l.execute();
    }

    void a(long j, long j2, boolean z, long j3) {
        this.g.bindLong(1, j);
        this.g.bindLong(2, j2);
        SQLiteStatement sQLiteStatement = this.g;
        if (z) {
            sQLiteStatement.bindNull(3);
        } else {
            sQLiteStatement.bindLong(3, j3);
        }
        this.g.execute();
    }

    void a(String str, Long l) {
        SQLiteStatement sQLiteStatement;
        if (l == null) {
            this.u.bindString(1, str);
            sQLiteStatement = this.u;
        } else {
            long jLongValue = l.longValue();
            this.h.bindString(1, str);
            this.h.bindLong(2, jLongValue);
            if (this.h.executeInsert() != x) {
                return;
            }
            this.m.bindLong(1, jLongValue);
            this.m.bindString(2, str);
            sQLiteStatement = this.m;
        }
        sQLiteStatement.execute();
    }

    long b(long j, long j2) {
        this.t.bindLong(1, j);
        this.t.bindLong(2, j2);
        return this.t.executeUpdateDelete();
    }

    c b(long j, byte[] bArr) {
        h hVar = this.c;
        hVar.f4235a = j;
        hVar.b = bArr;
        return new c(this.b.rawQueryWithFactory(hVar, "SELECT id, type, major, body, ts_skipped FROM table_events WHERE type=?  AND body=?  LIMIT 1", null, null));
    }

    Long b(String str) {
        String[] strArr = this.f4233a;
        strArr[0] = str;
        Cursor cursorRawQuery = this.b.rawQuery("SELECT value FROM table_params WHERE key=?", strArr);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return null;
            }
            Long lValueOf = Long.valueOf(cursorRawQuery.getLong(0));
            cursorRawQuery.close();
            return lValueOf;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void b() {
        this.o.execute();
    }

    void b(long j) {
        this.v.bindLong(1, j);
        this.v.execute();
    }

    long c(long j) {
        this.f4233a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.b.rawQuery("SELECT COUNT(*) FROM table_events_timestamps WHERE eid=?", this.f4233a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void c() {
        this.p.execute();
    }

    void c(long j, long j2) {
        this.e.bindLong(1, j);
        this.e.bindLong(2, j2);
        this.e.execute();
    }

    d d(long j) {
        this.f4233a[0] = String.valueOf(j);
        return new d(this.b.rawQuery("SELECT eid, ts FROM table_events_timestamps WHERE eid=?", this.f4233a));
    }

    void d() {
        this.q.execute();
    }

    void d(long j, long j2) {
        this.k.bindLong(1, j2);
        this.k.bindLong(2, j);
        this.k.execute();
    }

    long e(long j) {
        this.f4233a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE type=?", this.f4233a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    void e() {
        this.r.execute();
    }

    long f() {
        Cursor cursorRawQuery = this.b.rawQuery("SELECT COUNT(*) FROM table_huawei_appgallery_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    long f(long j) {
        this.f4233a[0] = String.valueOf(j);
        Cursor cursorRawQuery = this.b.rawQuery("SELECT COUNT(*) FROM table_sessions_timestamps WHERE sid=?", this.f4233a);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j2 = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j2;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    b g() {
        return new b(this.b.rawQuery("SELECT id, data, signature, signature_algorithm, source, ts FROM table_huawei_appgallery_raw_purchases", null));
    }

    g g(long j) {
        this.f4233a[0] = String.valueOf(j);
        return new g(this.b.rawQuery("SELECT sid, ts_start, ts_end FROM table_sessions_timestamps WHERE sid=?", this.f4233a));
    }

    c h() {
        return new c(this.b.rawQuery("SELECT id, type, major, body, ts_skipped FROM table_events", null));
    }

    long i() {
        Cursor cursorRawQuery = this.b.rawQuery("SELECT COUNT(*) FROM table_raw_purchases", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    e j() {
        return new e(this.b.rawQuery("SELECT id, data, signature, ts FROM table_raw_purchases", null));
    }

    long k() {
        Cursor cursorRawQuery = this.b.rawQuery("SELECT COUNT(*)  FROM table_events WHERE major=1", null);
        try {
            if (!cursorRawQuery.moveToNext()) {
                cursorRawQuery.close();
                return 0L;
            }
            long j = cursorRawQuery.getLong(0);
            cursorRawQuery.close();
            return j;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
