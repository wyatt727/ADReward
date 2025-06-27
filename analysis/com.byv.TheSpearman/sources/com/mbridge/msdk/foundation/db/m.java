package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import org.json.JSONObject;

/* compiled from: ReplaceTempDao.java */
/* loaded from: classes4.dex */
public final class m extends a {

    /* renamed from: a, reason: collision with root package name */
    private static String f2798a = "ReplaceTempDao";
    private static m b;

    private m(g gVar) {
        super(gVar);
    }

    public static m a(g gVar) {
        if (b == null) {
            synchronized (f.class) {
                if (b == null) {
                    b = new m(gVar);
                }
            }
        }
        return b;
    }

    public final void a(String str, JSONObject jSONObject) {
        try {
            if (getWritableDatabase() == null) {
                return;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("d_key", str);
            contentValues.put("d_value", jSONObject.toString());
            contentValues.put("time", Long.valueOf(System.currentTimeMillis()));
            if (!b(str)) {
                getWritableDatabase().insert("c_replace_temp", null, contentValues);
            } else {
                getWritableDatabase().update("c_replace_temp", contentValues, "d_key = '" + str + "'", null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean b(String str) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT d_value FROM c_replace_temp WHERE d_key='" + str + "'", null);
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
        if (cursorRawQuery == null) {
            return false;
        }
        try {
            cursorRawQuery.close();
            return false;
        } catch (Exception unused2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "SELECT * FROM c_replace_temp WHERE d_key = '"
            r0.append(r2)
            r0.append(r4)
            java.lang.String r4 = "'"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.database.sqlite.SQLiteDatabase r0 = r3.getReadableDatabase()
            android.database.Cursor r4 = r0.rawQuery(r4, r1)
            if (r4 == 0) goto L4d
            int r0 = r4.getCount()     // Catch: java.lang.Throwable -> L4b
            if (r0 <= 0) goto L4d
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4b
            r0.<init>()     // Catch: java.lang.Throwable -> L4b
            r1 = r0
        L34:
            boolean r0 = r4.moveToNext()     // Catch: java.lang.Throwable -> L4b
            if (r0 == 0) goto L69
            java.lang.String r0 = "d_value"
            int r0 = r4.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L4b
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Throwable -> L4b
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L4b
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4b
            r1 = r2
            goto L34
        L4b:
            r0 = move-exception
            goto L53
        L4d:
            if (r4 == 0) goto L69
            r4.close()     // Catch: java.lang.Throwable -> L4b java.lang.Exception -> L69
            goto L69
        L53:
            java.lang.String r2 = com.mbridge.msdk.foundation.db.m.f2798a     // Catch: java.lang.Throwable -> L62
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L62
            com.mbridge.msdk.foundation.tools.ad.b(r2, r0)     // Catch: java.lang.Throwable -> L62
            if (r4 == 0) goto L6c
        L5e:
            r4.close()     // Catch: java.lang.Exception -> L6c
            goto L6c
        L62:
            r0 = move-exception
            if (r4 == 0) goto L68
            r4.close()     // Catch: java.lang.Exception -> L68
        L68:
            throw r0
        L69:
            if (r4 == 0) goto L6c
            goto L5e
        L6c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.m.a(java.lang.String):org.json.JSONObject");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject a() {
        /*
            r8 = this;
            r0 = 604800000(0x240c8400, float:3.046947E-17)
            long r0 = (long) r0
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch: java.lang.Exception -> L26
            if (r0 != 0) goto L10
            goto L2a
        L10:
            android.database.sqlite.SQLiteDatabase r0 = r8.getWritableDatabase()     // Catch: java.lang.Exception -> L26
            java.lang.String r1 = "c_replace_temp"
            java.lang.String r4 = "time<?"
            r5 = 1
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Exception -> L26
            r6 = 0
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L26
            r5[r6] = r2     // Catch: java.lang.Exception -> L26
            r0.delete(r1, r4, r5)     // Catch: java.lang.Exception -> L26
            goto L2a
        L26:
            r0 = move-exception
            r0.printStackTrace()
        L2a:
            android.database.sqlite.SQLiteDatabase r0 = r8.getReadableDatabase()
            java.lang.String r1 = "SELECT * FROM c_replace_temp"
            r2 = 0
            android.database.Cursor r0 = r0.rawQuery(r1, r2)
            if (r0 == 0) goto L6e
            int r1 = r0.getCount()     // Catch: java.lang.Throwable -> L69
            if (r1 <= 0) goto L6e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L69
            r1.<init>()     // Catch: java.lang.Throwable -> L69
        L42:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L67
            if (r2 == 0) goto L65
            java.lang.String r2 = "d_key"
            int r2 = r0.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r2 = r0.getString(r2)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = "d_value"
            int r3 = r0.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L67
            java.lang.String r3 = r0.getString(r3)     // Catch: java.lang.Throwable -> L67
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L67
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L67
            r1.put(r2, r4)     // Catch: java.lang.Throwable -> L67
            goto L42
        L65:
            r2 = r1
            goto L8a
        L67:
            r2 = move-exception
            goto L74
        L69:
            r1 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L74
        L6e:
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.lang.Throwable -> L69
            goto L8a
        L74:
            java.lang.String r3 = com.mbridge.msdk.foundation.db.m.f2798a     // Catch: java.lang.Throwable -> L83
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L83
            com.mbridge.msdk.foundation.tools.ad.b(r3, r2)     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L90
            r0.close()     // Catch: java.lang.Exception -> L90
            goto L90
        L83:
            r1 = move-exception
            if (r0 == 0) goto L89
            r0.close()     // Catch: java.lang.Exception -> L89
        L89:
            throw r1
        L8a:
            if (r0 == 0) goto L8f
            r0.close()     // Catch: java.lang.Exception -> L8f
        L8f:
            r1 = r2
        L90:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.m.a():org.json.JSONObject");
    }
}
