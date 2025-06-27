package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.aj;

/* compiled from: CampaignClickDao.java */
/* loaded from: classes4.dex */
public class d extends a<JumpLoaderResult> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2787a = "d";
    private static d b;

    private d(g gVar) {
        super(gVar);
    }

    public static synchronized d a(g gVar) {
        if (b == null) {
            b = new d(gVar);
        }
        return b;
    }

    public final synchronized void a() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - ts) > cti", null);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(f2787a, e.getMessage());
            }
        }
    }

    public final synchronized long a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            String strA = aj.a(campaignEx.getJumpResult());
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", campaignEx.getId());
            contentValues.put("unitid", str);
            contentValues.put("result", strA);
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
            contentValues.put("package_name", campaignEx.getPackageName());
            com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            contentValues.put("ts", Long.valueOf(System.currentTimeMillis()));
            if (gVarB != null && gVarB.Z() > 0) {
                contentValues.put("cpei", Integer.valueOf(gVarB.Z() * 1000));
            }
            if (gVarB != null && gVarB.aa() > 0) {
                contentValues.put("cpoci", Integer.valueOf(gVarB.aa() * 1000));
            }
            if (c(campaignEx.getId(), str)) {
                String str2 = "id = " + campaignEx.getId() + " AND unitid = " + str;
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                return getWritableDatabase().update("campaignclick", contentValues, str2, null);
            }
            return getWritableDatabase().insert("campaignclick", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(f2787a, e.getMessage());
            }
            return -1L;
        }
    }

    public final synchronized boolean a(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id='" + str + "' AND unitid='" + str2 + "' AND cti + ts > " + System.currentTimeMillis(), null);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b(f2787a, e.getMessage());
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[Catch: all -> 0x006d, PHI: r11
      0x004b: PHI (r11v4 android.database.Cursor) = (r11v3 android.database.Cursor), (r11v6 android.database.Cursor) binds: [B:29:0x0060, B:19:0x0049] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:14:0x0042, B:20:0x004b, B:36:0x0069, B:37:0x006c), top: B:44:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[Catch: all -> 0x006d, TRY_ENTER, TryCatch #2 {, blocks: (B:14:0x0042, B:20:0x004b, B:36:0x0069, B:37:0x006c), top: B:44:0x0002 }] */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.mbridge.msdk.click.entity.JumpLoaderResult b(java.lang.String r11, java.lang.String r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getReadableDatabase()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            java.lang.String r2 = "campaignclick"
            r3 = 0
            java.lang.String r4 = "id=? AND unitid=?"
            r5 = 2
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r6 = 0
            r5[r6] = r11     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r11 = 1
            r5[r11] = r12     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r11 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L51
            if (r11 == 0) goto L49
            int r12 = r11.getCount()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L65
            if (r12 <= 0) goto L49
            boolean r12 = r11.moveToFirst()     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L65
            if (r12 == 0) goto L49
            java.lang.String r12 = "result"
            int r12 = r11.getColumnIndex(r12)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L65
            java.lang.String r12 = r11.getString(r12)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L65
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L65
            if (r1 != 0) goto L49
            java.lang.Object r12 = com.mbridge.msdk.foundation.tools.aj.a(r12)     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L65
            com.mbridge.msdk.click.entity.JumpLoaderResult r12 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r12     // Catch: java.lang.Exception -> L47 java.lang.Throwable -> L65
            if (r11 == 0) goto L45
            r11.close()     // Catch: java.lang.Throwable -> L6d
        L45:
            monitor-exit(r10)
            return r12
        L47:
            r12 = move-exception
            goto L53
        L49:
            if (r11 == 0) goto L63
        L4b:
            r11.close()     // Catch: java.lang.Throwable -> L6d
            goto L63
        L4f:
            r12 = move-exception
            goto L67
        L51:
            r12 = move-exception
            r11 = r0
        L53:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L60
            java.lang.String r1 = com.mbridge.msdk.foundation.db.d.f2787a     // Catch: java.lang.Throwable -> L65
            java.lang.String r12 = r12.getMessage()     // Catch: java.lang.Throwable -> L65
            com.mbridge.msdk.foundation.tools.ad.b(r1, r12)     // Catch: java.lang.Throwable -> L65
        L60:
            if (r11 == 0) goto L63
            goto L4b
        L63:
            monitor-exit(r10)
            return r0
        L65:
            r12 = move-exception
            r0 = r11
        L67:
            if (r0 == 0) goto L6c
            r0.close()     // Catch: java.lang.Throwable -> L6d
        L6c:
            throw r12     // Catch: java.lang.Throwable -> L6d
        L6d:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.d.b(java.lang.String, java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    private synchronized boolean c(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id='" + str + "' AND unitid= '" + str2 + "'", null);
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            cursorRawQuery.close();
            return true;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return false;
    }
}
