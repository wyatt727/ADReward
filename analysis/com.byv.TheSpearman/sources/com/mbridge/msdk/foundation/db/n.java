package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* compiled from: ReportErrorDao.java */
/* loaded from: classes4.dex */
public class n extends a {

    /* renamed from: a, reason: collision with root package name */
    private static n f2799a;

    private n(g gVar) {
        super(gVar);
    }

    public static n a(g gVar) {
        if (f2799a == null) {
            synchronized (n.class) {
                if (f2799a == null) {
                    f2799a = new n(gVar);
                }
            }
        }
        return f2799a;
    }

    public final synchronized void a(String str, String str2, long j) {
        if (str == null) {
            str = "";
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().execSQL("DELETE from reporterror where url='" + str2 + "' and data='" + str + "' and time_stamp" + t2.i.b + j + " or count > 5 ");
    }

    public final synchronized int a() {
        int i;
        Cursor cursorQuery = null;
        i = 0;
        try {
            try {
                cursorQuery = getReadableDatabase().query("reporterror", new String[]{" count(*) "}, null, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    i = cursorQuery.getInt(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorQuery != null) {
                }
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #5 {, blocks: (B:27:0x00a1, B:19:0x0092, B:34:0x00ab, B:35:0x00ae), top: B:44:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.l> a(int r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            r0 = 5
            r1 = 0
            r12.b(r0)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            android.database.sqlite.SQLiteDatabase r2 = r12.getReadableDatabase()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r3 = "reporterror"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            r0.append(r13)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r13 = ""
            r0.append(r13)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            java.lang.String r10 = r0.toString()     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            android.database.Cursor r13 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L98
            if (r13 == 0) goto L90
            int r0 = r13.getCount()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
            if (r0 <= 0) goto L90
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
            r0.<init>()     // Catch: java.lang.Exception -> L8b java.lang.Throwable -> La7
        L34:
            boolean r1 = r13.moveToNext()     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            if (r1 == 0) goto L87
            java.lang.String r1 = "url"
            int r1 = r13.getColumnIndex(r1)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r1 = r13.getString(r1)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r2 = "data"
            int r2 = r13.getColumnIndex(r2)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r2 = r13.getString(r2)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r3 = "method"
            int r3 = r13.getColumnIndex(r3)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r3 = r13.getString(r3)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r4 = "unitId"
            int r4 = r13.getColumnIndex(r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r4 = r13.getString(r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r5 = "count"
            int r5 = r13.getColumnIndex(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            int r5 = r13.getInt(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            java.lang.String r6 = "time_stamp"
            int r6 = r13.getColumnIndex(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            long r6 = r13.getLong(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            com.mbridge.msdk.foundation.entity.l r8 = new com.mbridge.msdk.foundation.entity.l     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r8.<init>(r1, r3, r2, r4)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            int r5 = r5 + 1
            r8.a(r5)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r8.a(r6)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            r0.add(r8)     // Catch: java.lang.Exception -> L89 java.lang.Throwable -> La7
            goto L34
        L87:
            r1 = r0
            goto L90
        L89:
            r1 = move-exception
            goto L9c
        L8b:
            r0 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L9c
        L90:
            if (r13 == 0) goto La5
            r13.close()     // Catch: java.lang.Throwable -> Laf
            goto La5
        L96:
            r0 = move-exception
            goto La9
        L98:
            r13 = move-exception
            r0 = r1
            r1 = r13
            r13 = r0
        L9c:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> La7
            if (r13 == 0) goto La4
            r13.close()     // Catch: java.lang.Throwable -> Laf
        La4:
            r1 = r0
        La5:
            monitor-exit(r12)
            return r1
        La7:
            r0 = move-exception
            r1 = r13
        La9:
            if (r1 == 0) goto Lae
            r1.close()     // Catch: java.lang.Throwable -> Laf
        Lae:
            throw r0     // Catch: java.lang.Throwable -> Laf
        Laf:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.n.a(int):java.util.List");
    }

    private synchronized int b(int i) {
        try {
        } catch (Exception unused) {
            return -1;
        }
        return getWritableDatabase().rawQuery("DELETE from reporterror where count >= " + i, null).getCount();
    }

    public final synchronized int a(String str) {
        try {
            String[] strArr = {str};
            if (getWritableDatabase() == null) {
                return -1;
            }
            return getWritableDatabase().delete("reporterror", "url=?", strArr);
        } catch (Exception unused) {
            return -1;
        }
    }

    public final synchronized long a(com.mbridge.msdk.foundation.entity.l lVar) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", lVar.f());
            contentValues.put("method", lVar.b());
            contentValues.put("data", lVar.a());
            contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, lVar.e());
            contentValues.put("time_stamp", Long.valueOf(lVar.c()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            if (b(lVar.a(), lVar.f(), lVar.c())) {
                return getWritableDatabase().rawQuery("UPDATE reporterror SET count = " + lVar.d() + " where url='" + lVar.f() + "' and data='" + lVar.a() + "' and time_stamp" + t2.i.b + lVar.c(), null).getCount();
            }
            contentValues.put("count", Integer.valueOf(lVar.d()));
            return getWritableDatabase().insert("reporterror", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized boolean b(String str, String str2, long j) {
        if (str == null) {
            str = "";
        }
        try {
            if (getWritableDatabase() == null) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("select * from reporterror where url='");
            sb.append(str2);
            sb.append("' and ");
            sb.append("data");
            sb.append("='");
            sb.append(str);
            sb.append("' and ");
            sb.append("time_stamp");
            sb.append(t2.i.b);
            sb.append(j);
            return getReadableDatabase().rawQuery(sb.toString(), null).getCount() > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public final synchronized int b() {
        int count;
        Cursor cursorQuery = null;
        count = 0;
        try {
            try {
                cursorQuery = getReadableDatabase().query("reporterror", new String[]{" count(*) "}, null, null, null, null, null, null);
                count = cursorQuery.getCount();
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorQuery != null) {
                }
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return count;
    }
}
