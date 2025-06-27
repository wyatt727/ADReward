package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: CacheCampaignDao.java */
/* loaded from: classes4.dex */
public class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2786a = "com.mbridge.msdk.foundation.db.c";
    private static volatile c b;

    private c(g gVar) {
        super(gVar);
    }

    public static c a(g gVar) {
        if (b == null) {
            synchronized (c.class) {
                if (b == null) {
                    b = new c(gVar);
                }
            }
        }
        return b;
    }

    public final long a(String str, String str2, String str3, int i) {
        if (!a(str, str3)) {
            return -1L;
        }
        new ContentValues().put("state", Integer.valueOf(i));
        return getWritableDatabase().update("CacheCampaign", r4, "rid='" + str + "' AND unitid = '" + str3 + "' AND state = 0", null);
    }

    private synchronized boolean a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT rid FROM CacheCampaign WHERE rid='" + str + "' AND unitid = '" + str2 + "'", null);
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public final synchronized void a(String str, int i) {
        String str2;
        SQLiteDatabase writableDatabase;
        if (i <= 0) {
            i = 1;
        }
        try {
            str2 = "unitid = '" + str + "' AND ( (ts + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= " + i + " )";
            writableDatabase = getWritableDatabase();
        } catch (Exception e) {
            ad.b("CacheCampaignDao", e.getLocalizedMessage());
        }
        if (writableDatabase == null) {
            return;
        }
        try {
            writableDatabase.execSQL("delete from CacheCampaign where " + str2);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final synchronized void a(String str, String str2, String str3) {
        try {
            if (a(str2, str)) {
                String str4 = "unitid = '" + str + "' AND rid = '" + str2 + "'";
                SQLiteDatabase writableDatabase = getWritableDatabase();
                if (writableDatabase == null) {
                    return;
                }
                try {
                    writableDatabase.execSQL("delete from CacheCampaign where " + str4);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            ad.b("CampaignDao", e2.getLocalizedMessage());
        }
    }

    public final long a(List<CampaignEx> list, String str) {
        CampaignEx campaignEx;
        if (list != null) {
            try {
                if (list.size() == 0 || TextUtils.isEmpty(str) || (campaignEx = list.get(0)) == null) {
                    return 0L;
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("rid", campaignEx.getRequestId());
                contentValues.put("lrid", campaignEx.getLocalRequestId());
                contentValues.put("unitid", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(it.next()));
                }
                contentValues.put("campaigns", jSONArray.toString());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime == 0) {
                    candidateCacheTime = campaignEx.getPlctb();
                    if (candidateCacheTime == 0) {
                        com.mbridge.msdk.c.g gVarB = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
                        if (gVarB == null) {
                            com.mbridge.msdk.c.h.a();
                            gVarB = com.mbridge.msdk.c.i.a();
                        }
                        candidateCacheTime = gVarB.ac();
                    }
                }
                try {
                    if (af.a().a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid='" + campaignEx.getRequestId() + "' AND lrid='" + campaignEx.getLocalRequestId() + "' AND unitid = '" + str + "' AND state = 1", null);
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e2) {
                e2.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0134 A[EXC_TOP_SPLITTER, PHI: r9
      0x0134: PHI (r9v6 android.database.Cursor) = (r9v5 android.database.Cursor), (r9v7 android.database.Cursor) binds: [B:35:0x013d, B:29:0x0132] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.mbridge.msdk.foundation.b.b> a(java.lang.String r7, int r8, long r9) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.c.a(java.lang.String, int, long):java.util.List");
    }

    public final void b(String str, String str2, String str3) {
        if (a(str, str3)) {
            getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1 , show_time = " + System.currentTimeMillis() + " WHERE " + ("rid='" + str + "' AND unitid = '" + str3 + "' AND state = 1"));
        }
    }
}
