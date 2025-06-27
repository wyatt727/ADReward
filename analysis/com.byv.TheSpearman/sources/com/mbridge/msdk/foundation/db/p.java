package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;

/* compiled from: VideoDao.java */
/* loaded from: classes4.dex */
public final class p extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static p f2801a;

    private p(g gVar) {
        super(gVar);
    }

    public static synchronized p a(g gVar) {
        if (f2801a == null) {
            f2801a = new p(gVar);
        }
        return f2801a;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.mbridge.msdk.foundation.entity.m a(java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.p.a(java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    public final synchronized com.mbridge.msdk.foundation.entity.m a(String str, String str2) {
        Cursor cursorRawQuery = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM video" + (" WHERE video_url = '" + str + "'"), null);
                if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                    while (cursorRawQuery.moveToNext()) {
                        mVar.b(cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
                        mVar.a(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("video_state")));
                        mVar.b(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("pregeress_size")));
                        mVar.b(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("total_size")));
                        mVar.a(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("video_path")));
                        mVar.a(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("video_download_start")) * 1000);
                    }
                }
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Exception unused) {
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e.getLocalizedMessage());
            }
            if (cursorRawQuery != null) {
            }
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return mVar;
    }

    public final synchronized void b(String str) {
        String str2;
        try {
            str2 = "video_url = '" + str + "'";
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete("video", str2, null);
    }

    public final synchronized void a(String str, long j) {
        ContentValues contentValues;
        if (j == 0) {
            return;
        }
        try {
            contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j / 1000));
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (b(str, "")) {
            getWritableDatabase().update("video", contentValues, "video_url = '" + str + "'", null);
            return;
        }
        return;
    }

    public final synchronized long a(CampaignEx campaignEx, long j, String str, int i) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            if (getWritableDatabase() == null) {
                return -1L;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("unitid", campaignEx.getCampaignUnitId());
            contentValues.put("id", campaignEx.getId());
            contentValues.put("package_name", campaignEx.getPackageName());
            contentValues.put("app_name", campaignEx.getAppName());
            contentValues.put("app_desc", campaignEx.getAppDesc());
            contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
            contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
            contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
            contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
            contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
            contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
            contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
            contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
            contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
            contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
            contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
            contentValues.put("star", Double.valueOf(campaignEx.getRating()));
            contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
            contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
            contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
            contentValues.put("ad_call", campaignEx.getAdCall());
            contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
            contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
            contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
            contentValues.put("total_size", Long.valueOf(j));
            contentValues.put("video_state", Integer.valueOf(i));
            contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("ad_bid_token", campaignEx.getBidToken());
            if (!TextUtils.isEmpty(str)) {
                contentValues.put("video_path", str);
            }
            if (b(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                return 0L;
            }
            return getWritableDatabase().insert("video", null, contentValues);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e.getLocalizedMessage());
            }
            return -1L;
        }
    }

    private synchronized boolean b(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str2)) {
            str3 = "SELECT id FROM video WHERE video_url = '" + str + "'";
        } else {
            str3 = "SELECT id FROM video WHERE video_url = '" + str + "' AND id = " + str2;
        }
        Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, null);
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("VideoDao", e.getLocalizedMessage());
                }
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("VideoDao", e2.getLocalizedMessage());
                }
            }
        }
        return false;
    }

    public final synchronized long a(String str, long j, int i) {
        int iUpdate = -1;
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pregeress_size", Long.valueOf(j));
        contentValues.put("video_state", Integer.valueOf(i));
        if (b(str, "")) {
            String str2 = "video_url = '" + str + "'";
            synchronized (new Object()) {
                iUpdate = getWritableDatabase().update("video", contentValues, str2, null);
            }
        }
        return iUpdate;
    }

    public final synchronized long b(String str, long j) {
        int iUpdate = -1;
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("total_size", Long.valueOf(j));
        if (b(str, "")) {
            String str2 = "video_url = '" + str + "'";
            synchronized (new Object()) {
                iUpdate = getWritableDatabase().update("video", contentValues, str2, null);
            }
        }
        return iUpdate;
    }
}
