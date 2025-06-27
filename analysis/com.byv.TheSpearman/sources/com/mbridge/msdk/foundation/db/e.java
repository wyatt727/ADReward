package com.mbridge.msdk.foundation.db;

import android.database.Cursor;

/* compiled from: CampaignClickTimeDao.java */
/* loaded from: classes4.dex */
public class e extends a<com.mbridge.msdk.foundation.entity.e> {

    /* renamed from: a, reason: collision with root package name */
    private static e f2788a;

    private e(g gVar) {
        super(gVar);
    }

    public static e a(g gVar) {
        if (f2788a == null) {
            synchronized (e.class) {
                if (f2788a == null) {
                    f2788a = new e(gVar);
                }
            }
        }
        return f2788a;
    }

    public final synchronized int a() {
        int i;
        Cursor cursorRawQuery = null;
        i = 0;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from click_time", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    i = cursorRawQuery.getInt(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorRawQuery != null) {
                }
            }
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135 A[Catch: all -> 0x014d, PHI: r1
      0x0135: PHI (r1v4 android.database.Cursor) = (r1v3 android.database.Cursor), (r1v5 android.database.Cursor) binds: [B:34:0x0140, B:26:0x0133] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:4:0x0003, B:21:0x012c, B:27:0x0135, B:41:0x0149, B:42:0x014c), top: B:47:0x0003 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.e> a(int r28) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.e.a(int):java.util.List");
    }
}
