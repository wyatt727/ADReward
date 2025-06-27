package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.signals.SignalManager;

/* compiled from: FqInfoDao.java */
/* loaded from: classes4.dex */
public final class j extends a<com.mbridge.msdk.foundation.entity.f> {

    /* renamed from: a, reason: collision with root package name */
    private static j f2795a;

    private j(g gVar) {
        super(gVar);
    }

    public static synchronized j a(g gVar) {
        if (f2795a == null) {
            f2795a = new j(gVar);
        }
        return f2795a;
    }

    public final synchronized void a(String str) {
        try {
            String str2 = "time<" + (System.currentTimeMillis() - SignalManager.TWENTY_FOUR_HOURS_MILLIS) + " and " + CampaignEx.JSON_KEY_CAMPAIGN_UNITID + "=?";
            String[] strArr = {str};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("fq_info", str2, strArr);
            }
        } catch (Exception unused) {
        }
    }

    public final synchronized void a(com.mbridge.msdk.foundation.entity.f fVar) {
        try {
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (getWritableDatabase() == null) {
            return;
        }
        if (fVar != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", fVar.a());
            contentValues.put("time", Long.valueOf(fVar.b()));
            contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, fVar.d());
            contentValues.put("type", Integer.valueOf(fVar.c()));
            if (a(fVar.d(), fVar.a())) {
                getWritableDatabase().update("fq_info", contentValues, "id = " + fVar.a() + " AND " + CampaignEx.JSON_KEY_CAMPAIGN_UNITID + " = " + fVar.d(), null);
            } else {
                getWritableDatabase().insert("fq_info", null, contentValues);
            }
        }
    }

    private synchronized boolean a(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("select id from fq_info where unitId='" + str + "' and id='" + str2 + "'", null);
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
