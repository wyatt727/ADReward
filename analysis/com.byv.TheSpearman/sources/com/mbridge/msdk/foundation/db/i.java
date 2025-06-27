package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.vungle.ads.internal.signals.SignalManager;

/* compiled from: DailyPlayCapDao.java */
/* loaded from: classes4.dex */
public class i extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2794a = "com.mbridge.msdk.foundation.db.i";
    private static i b;

    private i(g gVar) {
        super(gVar);
    }

    public static i a(g gVar) {
        if (b == null) {
            synchronized (i.class) {
                if (b == null) {
                    b = new i(gVar);
                }
            }
        }
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ce A[EXC_TOP_SPLITTER, PHI: r1
      0x00ce: PHI (r1v4 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v5 android.database.Cursor) binds: [B:37:0x00d8, B:30:0x00cc] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.i.a(java.lang.String):void");
    }

    private synchronized boolean b(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT play_time FROM dailyplaycap WHERE unit_id='" + str + "'", null);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private synchronized void c(String str) {
        try {
        } catch (Throwable unused) {
            ad.c(f2794a, "resetTimeAndTimestamp error");
        }
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("first_insert_timestamp", (Integer) 0);
        contentValues.put("play_time", (Integer) 0);
        getWritableDatabase().update("dailyplaycap", contentValues, "unit_id = '" + str + "'", null);
    }

    public final boolean a(String str, int i) {
        Cursor cursorRawQuery = null;
        boolean z = false;
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM dailyplaycap where unit_id ='" + str + "'", null);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0 && cursorRawQuery.moveToFirst()) {
                long j = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("first_insert_timestamp"));
                long j2 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("play_time"));
                if (j != 0) {
                    if (System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS > j) {
                        c(str);
                    } else if (i > 0 && j2 >= i) {
                        z = true;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                ad.c(f2794a, "isOverCap is error" + th);
                if (cursorRawQuery != null) {
                }
            } catch (Throwable th2) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable unused) {
                    }
                }
                throw th2;
            }
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Throwable unused2) {
            }
        }
        return z;
    }
}
