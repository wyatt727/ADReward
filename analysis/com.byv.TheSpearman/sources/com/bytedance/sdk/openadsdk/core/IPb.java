package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.AbstractCursor;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DBHelper.java */
/* loaded from: classes2.dex */
public class IPb {
    private static final Object Td = new Object();
    private Td EYQ;
    private Context mZx;

    IPb(Context context) {
        try {
            this.mZx = context == null ? hu.EYQ() : context.getApplicationContext();
            if (this.EYQ == null) {
                this.EYQ = new Td();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context Td() {
        Context context = this.mZx;
        return context == null ? hu.EYQ() : context;
    }

    /* compiled from: DBHelper.java */
    public class Td {
        private SQLiteDatabase mZx = null;

        public Td() {
        }

        private synchronized void Kbd() {
            try {
                synchronized (IPb.Td) {
                    SQLiteDatabase sQLiteDatabase = this.mZx;
                    if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
                        IPb iPb = IPb.this;
                        SQLiteDatabase writableDatabase = iPb.new EYQ(iPb.Td()).getWritableDatabase();
                        this.mZx = writableDatabase;
                        writableDatabase.setLockingEnabled(false);
                    }
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("DBHelper", th.getMessage());
                if (IPb()) {
                    throw th;
                }
            }
        }

        public SQLiteDatabase EYQ() {
            Kbd();
            return this.mZx;
        }

        public synchronized void EYQ(String str) throws SQLException {
            try {
                Kbd();
                this.mZx.execSQL(str);
            } catch (Throwable th) {
                if (IPb()) {
                    throw th;
                }
            }
        }

        public synchronized Cursor EYQ(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
            Cursor cursorQuery;
            try {
                Kbd();
                cursorQuery = this.mZx.query(str, strArr, str2, strArr2, str3, str4, str5);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("DBHelper", th.getMessage());
                mZx mzx = new mZx();
                if (IPb()) {
                    throw th;
                }
                cursorQuery = mzx;
            }
            return cursorQuery;
        }

        public synchronized int EYQ(String str, ContentValues contentValues, String str2, String[] strArr) {
            int iUpdate;
            try {
                Kbd();
                iUpdate = this.mZx.update(str, contentValues, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("DBHelper", e.getMessage());
                if (IPb()) {
                    throw e;
                }
                iUpdate = 0;
            }
            return iUpdate;
        }

        public synchronized long EYQ(String str, String str2, ContentValues contentValues) {
            long jReplace;
            try {
                Kbd();
                jReplace = this.mZx.replace(str, str2, contentValues);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("DBHelper", e.getMessage());
                if (IPb()) {
                    throw e;
                }
                jReplace = -1;
            }
            return jReplace;
        }

        public synchronized int EYQ(String str, String str2, String[] strArr) {
            int iDelete;
            try {
                Kbd();
                iDelete = this.mZx.delete(str, str2, strArr);
            } catch (Exception e) {
                com.bytedance.sdk.component.utils.pi.EYQ("DBHelper", e.getMessage());
                if (IPb()) {
                    throw e;
                }
                iDelete = 0;
            }
            return iDelete;
        }

        public synchronized void mZx() {
            Kbd();
            SQLiteDatabase sQLiteDatabase = this.mZx;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.beginTransaction();
        }

        public synchronized void Td() {
            Kbd();
            SQLiteDatabase sQLiteDatabase = this.mZx;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.setTransactionSuccessful();
        }

        public synchronized void Pm() {
            Kbd();
            SQLiteDatabase sQLiteDatabase = this.mZx;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.endTransaction();
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x000e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private synchronized boolean IPb() {
            /*
                r1 = this;
                monitor-enter(r1)
                android.database.sqlite.SQLiteDatabase r0 = r1.mZx     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto Le
                boolean r0 = r0.inTransaction()     // Catch: java.lang.Throwable -> L10
                if (r0 == 0) goto Le
                r0 = 1
            Lc:
                monitor-exit(r1)
                return r0
            Le:
                r0 = 0
                goto Lc
            L10:
                r0 = move-exception
                monitor-exit(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.IPb.Td.IPb():boolean");
        }
    }

    /* compiled from: DBHelper.java */
    private class EYQ extends SQLiteOpenHelper {
        final Context EYQ;

        public EYQ(Context context) {
            super(context, "ttopensdk.db", (SQLiteDatabase.CursorFactory) null, 11);
            this.EYQ = context;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                EYQ(sQLiteDatabase, this.EYQ);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.pi.EYQ("DBHelper", th.getMessage());
            }
        }

        private void EYQ(SQLiteDatabase sQLiteDatabase, Context context) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.Pm.EYQ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.QQ.Td());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.pi.EYQ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.tsL.EYQ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.nWX.mZx.EYQ());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.KO.Td());
            sQLiteDatabase.execSQL(com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.Td());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.EYQ.Td.Td());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.nWX.EYQ());
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            if (i > i2) {
                try {
                    Td(sQLiteDatabase);
                    EYQ(sQLiteDatabase, IPb.this.mZx);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.pi.mZx(th.getMessage());
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0037 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0040 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0011  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0012 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0016 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0002, B:4:0x0005, B:5:0x000e, B:7:0x0012, B:8:0x0016, B:9:0x0021, B:10:0x002c, B:11:0x0037, B:12:0x0040), top: B:21:0x0002 }] */
        @Override // android.database.sqlite.SQLiteOpenHelper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            /*
                r0 = this;
                if (r2 <= r3) goto L5
                r0.Td(r1)     // Catch: java.lang.Throwable -> L43
            L5:
                com.bytedance.sdk.openadsdk.core.IPb r3 = com.bytedance.sdk.openadsdk.core.IPb.this     // Catch: java.lang.Throwable -> L43
                android.content.Context r3 = com.bytedance.sdk.openadsdk.core.IPb.mZx(r3)     // Catch: java.lang.Throwable -> L43
                r0.EYQ(r1, r3)     // Catch: java.lang.Throwable -> L43
                switch(r2) {
                    case 1: goto L40;
                    case 2: goto L37;
                    case 3: goto L2c;
                    case 4: goto L21;
                    case 5: goto L16;
                    case 6: goto L12;
                    default: goto L11;
                }     // Catch: java.lang.Throwable -> L43
            L11:
                goto L43
            L12:
                r0.EYQ(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L16:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.mZx.tsL.EYQ()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.EYQ(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L21:
                java.lang.String r3 = com.bytedance.sdk.component.adexpress.EYQ.mZx.mZx.Td()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.EYQ(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L2c:
                java.lang.String r3 = com.bytedance.sdk.openadsdk.mZx.pi.EYQ()     // Catch: java.lang.Throwable -> L43
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.EYQ(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L37:
                java.lang.String r3 = "DROP TABLE IF EXISTS 'ad_video_info';"
                r1.execSQL(r3)     // Catch: java.lang.Throwable -> L43
                r0.EYQ(r1)     // Catch: java.lang.Throwable -> L43
                goto L43
            L40:
                r0.EYQ(r1)     // Catch: java.lang.Throwable -> L43
            L43:
                r3 = 11
                if (r2 >= r3) goto L58
                r0.mZx(r1)     // Catch: java.lang.Throwable -> L4e
                com.bytedance.sdk.openadsdk.nWX.mZx.EYQ(r1)     // Catch: java.lang.Throwable -> L4e
                goto L58
            L4e:
                r1 = move-exception
                java.lang.String r1 = r1.getMessage()
                java.lang.String r2 = "DBHelper"
                com.bytedance.sdk.component.utils.pi.EYQ(r2, r1)
            L58:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.IPb.EYQ.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
        }

        private void EYQ(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.Pm.mZx());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.QQ.Pm());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.pi.mZx());
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.mZx.tsL.mZx());
        }

        private void mZx(SQLiteDatabase sQLiteDatabase) throws SQLException {
            sQLiteDatabase.execSQL(com.bytedance.sdk.openadsdk.core.ugen.EYQ.Td.Pm());
        }

        private void Td(SQLiteDatabase sQLiteDatabase) throws SQLException {
            ArrayList<String> arrayListPm = Pm(sQLiteDatabase);
            if (arrayListPm == null || arrayListPm.size() <= 0) {
                return;
            }
            Iterator<String> it = arrayListPm.iterator();
            while (it.hasNext()) {
                sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s ;", it.next()));
            }
        }

        private ArrayList<String> Pm(SQLiteDatabase sQLiteDatabase) {
            ArrayList<String> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
                if (cursorRawQuery != null) {
                    while (cursorRawQuery.moveToNext()) {
                        String string = cursorRawQuery.getString(0);
                        if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                            arrayList.add(string);
                        }
                    }
                }
            } catch (Exception unused) {
                if (cursorRawQuery != null) {
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return arrayList;
        }
    }

    public Td EYQ() {
        return this.EYQ;
    }

    /* compiled from: DBHelper.java */
    private class mZx extends AbstractCursor {
        @Override // android.database.AbstractCursor, android.database.Cursor
        public String[] getColumnNames() {
            return new String[0];
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getCount() {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public double getDouble(int i) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public float getFloat(int i) {
            return 0.0f;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public int getInt(int i) {
            return 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public long getLong(int i) {
            return 0L;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public short getShort(int i) {
            return (short) 0;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public String getString(int i) {
            return null;
        }

        @Override // android.database.AbstractCursor, android.database.Cursor
        public boolean isNull(int i) {
            return true;
        }

        private mZx() {
        }
    }
}
