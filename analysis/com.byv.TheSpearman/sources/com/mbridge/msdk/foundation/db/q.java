package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.json.m4;
import com.json.t2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.an;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.net.URLEncoder;

/* compiled from: VideoReportDataDao.java */
/* loaded from: classes4.dex */
public class q extends a<com.mbridge.msdk.foundation.entity.n> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2802a = "com.mbridge.msdk.foundation.db.q";
    private static q b;

    private q(g gVar) {
        super(gVar);
    }

    public static q a(g gVar) {
        if (b == null) {
            synchronized (q.class) {
                if (b == null) {
                    b = new q(gVar);
                }
            }
        }
        return b;
    }

    public final synchronized int a() {
        int i;
        Cursor cursorRawQuery = null;
        i = 0;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from reward_report", null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    i = cursorRawQuery.getInt(0);
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (cursorRawQuery != null) {
                }
            }
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused) {
                }
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0346 A[Catch: Exception -> 0x0352, all -> 0x0355, TRY_ENTER, TRY_LEAVE, TryCatch #7 {Exception -> 0x0352, blocks: (B:101:0x0346, B:93:0x032f), top: B:121:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x034e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.List<com.mbridge.msdk.foundation.entity.n> a(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.q.a(java.lang.String):java.util.List");
    }

    public final synchronized long a(com.mbridge.msdk.foundation.entity.n nVar) {
        if (nVar != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(t2.h.W, nVar.a());
                contentValues.put("networkType", Integer.valueOf(nVar.k()));
                contentValues.put("network_str", nVar.l());
                contentValues.put("isCompleteView", Integer.valueOf(nVar.w()));
                contentValues.put("watchedMillis", Integer.valueOf(nVar.x()));
                contentValues.put(MRAIDPresenter.VIDEO_LENGTH, Integer.valueOf(nVar.p()));
                if (!TextUtils.isEmpty(nVar.r())) {
                    contentValues.put("offerUrl", nVar.r());
                }
                if (!TextUtils.isEmpty(nVar.h())) {
                    contentValues.put("reason", URLEncoder.encode(nVar.h(), m4.M));
                }
                contentValues.put("result", Integer.valueOf(nVar.m()));
                contentValues.put("duration", nVar.n());
                contentValues.put("videoSize", Long.valueOf(nVar.o()));
                contentValues.put("type", nVar.t());
                String strS = nVar.s();
                if (!TextUtils.isEmpty(strS)) {
                    contentValues.put(CampaignEx.ENDCARD_URL, strS);
                }
                String strQ = nVar.q();
                if (!TextUtils.isEmpty(strQ)) {
                    contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, strQ);
                }
                String strF = nVar.f();
                if (!TextUtils.isEmpty(strF)) {
                    contentValues.put("rid", strF);
                }
                String strG = nVar.g();
                if (!TextUtils.isEmpty(strG)) {
                    contentValues.put("rid_n", strG);
                }
                String strZ = nVar.z();
                if (!TextUtils.isEmpty(strZ)) {
                    contentValues.put("template_url", strZ);
                }
                String strV = nVar.v();
                if (!TextUtils.isEmpty(strV)) {
                    contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, strV);
                }
                String strD = nVar.d();
                if (!TextUtils.isEmpty(strD)) {
                    contentValues.put("ad_type", URLEncoder.encode(strD, m4.M));
                }
                contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, nVar.c());
                contentValues.put("campaignId", nVar.e());
                if ("2000039".equals(nVar.a())) {
                    String strA = com.mbridge.msdk.foundation.entity.n.a(nVar);
                    if (an.b(strA)) {
                        contentValues.put("h5_click_data", strA);
                    }
                }
                String strB = nVar.b();
                if (!TextUtils.isEmpty(strB)) {
                    contentValues.put("resource_type", URLEncoder.encode(strB, m4.M));
                }
                String strJ = nVar.j();
                if (!TextUtils.isEmpty(strJ)) {
                    contentValues.put("device_id", URLEncoder.encode(strJ, m4.M));
                }
                String strI = nVar.i();
                if (!TextUtils.isEmpty(strI)) {
                    contentValues.put("creative", URLEncoder.encode(strI, m4.M));
                }
                contentValues.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_AD_SPACE_T, Integer.valueOf(nVar.u()));
                return getWritableDatabase().insert("reward_report", null, contentValues);
            } catch (Exception e) {
                e.printStackTrace();
                ad.b(f2802a, e.getMessage());
            }
        }
        return -1L;
    }
}
