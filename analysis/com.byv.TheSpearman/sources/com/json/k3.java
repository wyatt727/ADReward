package com.json;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import android.provider.BaseColumns;
import android.util.Log;
import com.json.mediationsdk.utils.IronSourceConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class k3 extends SQLiteOpenHelper implements g6 {
    private static k3 e = null;
    private static final String f = " TEXT";
    private static final String g = " INTEGER";
    private static final String h = ",";

    /* renamed from: a, reason: collision with root package name */
    private final int f1855a;
    private final int b;
    private final String c;
    private final String d;

    static abstract class a implements BaseColumns {

        /* renamed from: a, reason: collision with root package name */
        public static final String f1856a = "events";
        public static final int b = 4;
        public static final String c = "eventid";
        public static final String d = "timestamp";
        public static final String e = "type";
        public static final String f = "data";

        a() {
        }
    }

    public k3(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f1855a = 4;
        this.b = 400;
        this.c = "DROP TABLE IF EXISTS events";
        this.d = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private ContentValues a(l4 l4Var, String str) {
        if (l4Var == null) {
            return null;
        }
        ContentValues contentValues = new ContentValues(4);
        contentValues.put("eventid", Integer.valueOf(l4Var.c()));
        contentValues.put("timestamp", Long.valueOf(l4Var.d()));
        contentValues.put("type", str);
        contentValues.put("data", l4Var.a());
        return contentValues;
    }

    private synchronized SQLiteDatabase a(boolean z) throws Throwable {
        int i = 0;
        while (true) {
            try {
                if (z) {
                    return getWritableDatabase();
                }
                return getReadableDatabase();
            } catch (Throwable th) {
                i++;
                if (i >= 4) {
                    throw th;
                }
                SystemClock.sleep(i * 400);
            }
        }
    }

    public static synchronized k3 a(Context context, String str, int i) {
        if (e == null) {
            e = new k3(context, str, i);
        }
        return e;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0097 A[Catch: all -> 0x00b4, DONT_GENERATE, PHI: r11
      0x0097: PHI (r11v2 android.database.sqlite.SQLiteDatabase) = (r11v1 android.database.sqlite.SQLiteDatabase), (r11v3 android.database.sqlite.SQLiteDatabase) binds: [B:39:0x0095, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:22:0x0069, B:24:0x006f, B:25:0x0072, B:40:0x0097, B:34:0x0086, B:36:0x008c, B:38:0x0091, B:45:0x009f, B:47:0x00a5, B:49:0x00aa, B:51:0x00b0, B:52:0x00b3, B:32:0x007d), top: B:56:0x0001, inners: #3 }] */
    @Override // com.json.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized java.util.ArrayList<com.json.l4> a(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb4
            r0.<init>()     // Catch: java.lang.Throwable -> Lb4
            r1 = 0
            r2 = 0
            android.database.sqlite.SQLiteDatabase r11 = r12.a(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r6 = "type = ?"
            r3 = 1
            java.lang.String[] r7 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L79
            r7[r1] = r13     // Catch: java.lang.Throwable -> L79
            java.lang.String r10 = "timestamp ASC"
            java.lang.String r4 = "events"
            r5 = 0
            r8 = 0
            r9 = 0
            r3 = r11
            android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L79
            int r13 = r2.getCount()     // Catch: java.lang.Throwable -> L79
            if (r13 <= 0) goto L69
            r2.moveToFirst()     // Catch: java.lang.Throwable -> L79
        L28:
            boolean r13 = r2.isAfterLast()     // Catch: java.lang.Throwable -> L79
            if (r13 != 0) goto L66
            java.lang.String r13 = "eventid"
            int r13 = r2.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L79
            if (r13 >= 0) goto L37
            goto L28
        L37:
            int r13 = r2.getInt(r13)     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "timestamp"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L79
            if (r1 >= 0) goto L44
            goto L28
        L44:
            long r3 = r2.getLong(r1)     // Catch: java.lang.Throwable -> L79
            java.lang.String r1 = "data"
            int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L79
            if (r1 >= 0) goto L51
            goto L28
        L51:
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L79
            com.ironsource.l4 r5 = new com.ironsource.l4     // Catch: java.lang.Throwable -> L79
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L79
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L79
            r5.<init>(r13, r3, r6)     // Catch: java.lang.Throwable -> L79
            r0.add(r5)     // Catch: java.lang.Throwable -> L79
            r2.moveToNext()     // Catch: java.lang.Throwable -> L79
            goto L28
        L66:
            r2.close()     // Catch: java.lang.Throwable -> L79
        L69:
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb4
            if (r13 != 0) goto L72
            r2.close()     // Catch: java.lang.Throwable -> Lb4
        L72:
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb4
            if (r13 == 0) goto L9a
            goto L97
        L79:
            r13 = move-exception
            goto L7d
        L7b:
            r13 = move-exception
            r11 = r2
        L7d:
            java.lang.String r1 = "IronSource"
            java.lang.String r3 = "Exception while loading events: "
            android.util.Log.e(r1, r3, r13)     // Catch: java.lang.Throwable -> L9c
            if (r2 == 0) goto L8f
            boolean r13 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb4
            if (r13 != 0) goto L8f
            r2.close()     // Catch: java.lang.Throwable -> Lb4
        L8f:
            if (r11 == 0) goto L9a
            boolean r13 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb4
            if (r13 == 0) goto L9a
        L97:
            r11.close()     // Catch: java.lang.Throwable -> Lb4
        L9a:
            monitor-exit(r12)
            return r0
        L9c:
            r13 = move-exception
            if (r2 == 0) goto La8
            boolean r0 = r2.isClosed()     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto La8
            r2.close()     // Catch: java.lang.Throwable -> Lb4
        La8:
            if (r11 == 0) goto Lb3
            boolean r0 = r11.isOpen()     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto Lb3
            r11.close()     // Catch: java.lang.Throwable -> Lb4
        Lb3:
            throw r13     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.json.k3.a(java.lang.String):java.util.ArrayList");
    }

    @Override // com.json.g6
    public synchronized void a(List<l4> list, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    sQLiteDatabaseA = a(true);
                    try {
                        Iterator<l4> it = list.iterator();
                        while (it.hasNext()) {
                            ContentValues contentValuesA = a(it.next(), str);
                            if (sQLiteDatabaseA != null && contentValuesA != null) {
                                sQLiteDatabaseA.insert("events", null, contentValuesA);
                            }
                        }
                    } catch (Throwable th) {
                        th = th;
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            Log.e(IronSourceConstants.IRONSOURCE_CONFIG_NAME, "Exception while saving events: ", th);
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabaseA = sQLiteDatabase;
                                sQLiteDatabaseA.close();
                            }
                        } catch (Throwable th2) {
                            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
                if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            }
        }
    }

    @Override // com.json.g6
    public synchronized void b(String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        String[] strArr = {str};
        try {
            sQLiteDatabaseA = a(true);
            sQLiteDatabaseA.delete("events", "type = ?", strArr);
        } catch (Throwable th) {
            try {
                Log.e(IronSourceConstants.IRONSOURCE_CONFIG_NAME, "Exception while clearing events: ", th);
            } finally {
                if (sQLiteDatabaseA != null && sQLiteDatabaseA.isOpen()) {
                    sQLiteDatabaseA.close();
                }
            }
        }
        if (sQLiteDatabaseA.isOpen()) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }
}
