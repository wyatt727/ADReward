package com.mbridge.msdk.newreward.function.e;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.newreward.function.common.DatabaseUtils;
import com.mbridge.msdk.newreward.function.common.JSONUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeTaskManager;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: CampaignTable.java */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f3357a;
    private final Object b = new Object();

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f3357a = sQLiteDatabase;
    }

    public final void b(int i, String str, String str2, String str3, boolean z, String str4, long j) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        double d = com.mbridge.msdk.newreward.function.h.a.d(str4);
        synchronized (this.b) {
            try {
                try {
                    cursorQuery = this.f3357a.query(FirebaseAnalytics.Param.CAMPAIGN, null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3}, null, null, null);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "insert: ", e);
                    }
                    sQLiteDatabase = this.f3357a;
                }
                if (cursorQuery != null && cursorQuery.getCount() > 0) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "insert:  already exist");
                    }
                    DatabaseUtils.closeCursor(cursorQuery);
                    return;
                }
                DatabaseUtils.beginTransaction(this.f3357a);
                ContentValues contentValues = new ContentValues();
                contentValues.put("ad_type", Integer.valueOf(i));
                contentValues.put("app_id", com.mbridge.msdk.foundation.controller.c.m().k());
                contentValues.put("placement_id", str);
                contentValues.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                contentValues.put("local_id", str3);
                contentValues.put("state", (Integer) 0);
                contentValues.put("bid_token", str4);
                contentValues.put("invalid_time", Long.valueOf(j));
                contentValues.put("header_bidding", Integer.valueOf(z ? 1 : 0));
                contentValues.put("load_start_time", Long.valueOf(System.currentTimeMillis()));
                contentValues.put("ecppv", Double.valueOf(d));
                long jInsert = this.f3357a.insert(FirebaseAnalytics.Param.CAMPAIGN, null, contentValues);
                if (MBridgeConstans.DEBUG) {
                    ad.a("CampaignTable", "insert result:  " + jInsert);
                }
                DatabaseUtils.setTransactionSuccessful(this.f3357a);
                sQLiteDatabase = this.f3357a;
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } finally {
                DatabaseUtils.endTransaction(this.f3357a);
            }
        }
    }

    public final void a(final com.mbridge.msdk.newreward.function.d.a.b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(bVar);
            }
        });
    }

    public final void b(com.mbridge.msdk.newreward.function.d.a.b bVar) {
        SQLiteDatabase sQLiteDatabase;
        if (bVar == null) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: mBridgeCampaigns is null");
                return;
            }
            return;
        }
        List<com.mbridge.msdk.newreward.function.d.a.a> listS = bVar.s();
        if (listS == null || listS.isEmpty()) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: campaignList is null or empty");
                return;
            }
            return;
        }
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "insert: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f3357a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("request_id", bVar.d());
                    contentValues.put("session_id", bVar.i());
                    contentValues.put("system_id", bVar.j());
                    contentValues.put("backup_id", bVar.k());
                    contentValues.put("state", Integer.valueOf(bVar.h()));
                    contentValues.put("template", Integer.valueOf(bVar.m()));
                    contentValues.put("invalid_time", Long.valueOf(bVar.n()));
                    contentValues.put("invalid_time_2", Long.valueOf(bVar.o()));
                    contentValues.put("invalid_time_backup", Long.valueOf(bVar.p()));
                    contentValues.put("show_count", Integer.valueOf(bVar.r()));
                    contentValues.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID, bVar.l());
                    contentValues.put("token_rule", Integer.valueOf(bVar.E()));
                    contentValues.put("data", bVar.t().toString());
                    long jUpdate = this.f3357a.update(FirebaseAnalytics.Param.CAMPAIGN, contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(bVar.a()), com.mbridge.msdk.foundation.controller.c.m().k(), bVar.b(), bVar.c(), bVar.e()});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateCampaign result:  " + jUpdate);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f3357a);
                    sQLiteDatabase = this.f3357a;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateCampaign: ", e);
                    }
                    sQLiteDatabase = this.f3357a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th) {
                DatabaseUtils.endTransaction(this.f3357a);
                throw th;
            }
        }
    }

    public final void a(final int i, final String str, final String str2, final boolean z, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.3
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> listA = a.this.a(i, str, str2, z);
                if (listA == null || listA.isEmpty()) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                        return;
                    }
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a(listA);
                }
            }
        });
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i, String str, String str2, boolean z) {
        Cursor cursorQuery;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.b) {
            try {
                cursorQuery = this.f3357a.query(FirebaseAnalytics.Param.CAMPAIGN, null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state in (401,404,405)", new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z ? 1 : 0)}, null, null, "load_start_time desc");
                try {
                    try {
                        List<com.mbridge.msdk.newreward.function.d.a.b> listA = a(cursorQuery);
                        if ((listA == null || listA.size() == 0) && MBridgeConstans.DEBUG) {
                            ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                        }
                        DatabaseUtils.closeCursor(cursorQuery);
                        return listA;
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorQuery;
                        DatabaseUtils.closeCursor(cursor);
                        throw th;
                    }
                } catch (Exception e) {
                    e = e;
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "find: ", e);
                    }
                    DatabaseUtils.closeCursor(cursorQuery);
                    return null;
                }
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final List<com.mbridge.msdk.newreward.function.d.a.b> a(int i, String str, String str2, boolean z, int i2) {
        Cursor cursorQuery;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "find: database is not available");
            }
            return null;
        }
        synchronized (this.b) {
            try {
                try {
                    cursorQuery = this.f3357a.query(FirebaseAnalytics.Param.CAMPAIGN, null, "ad_type=? and app_id=? and placement_id=? and unit_id=? and header_bidding=? and state=? and invalid_time>?", new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(z ? 1 : 0), String.valueOf(3), String.valueOf(System.currentTimeMillis())}, null, null, "load_start_time desc", String.valueOf(i2 <= 0 ? Integer.MAX_VALUE : i2));
                    try {
                        List<com.mbridge.msdk.newreward.function.d.a.b> listA = a(cursorQuery);
                        if ((listA == null || listA.size() == 0) && MBridgeConstans.DEBUG) {
                            ad.b("CampaignTable", "find: mBridgeCampaigns is null or empty");
                        }
                        DatabaseUtils.closeCursor(cursorQuery);
                        return listA;
                    } catch (Exception e) {
                        e = e;
                        if (MBridgeConstans.DEBUG) {
                            ad.a("CampaignTable", "find: ", e);
                        }
                        DatabaseUtils.closeCursor(cursorQuery);
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = null;
                    DatabaseUtils.closeCursor(cursor);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th2) {
                th = th2;
                DatabaseUtils.closeCursor(cursor);
                throw th;
            }
        }
    }

    public final void b(int i, String str, String str2, String str3, int i2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "updateState: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f3357a);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", Integer.valueOf(i2));
                    int iUpdate = this.f3357a.update(FirebaseAnalytics.Param.CAMPAIGN, contentValues, "ad_type=? and app_id=? and placement_id=? and unit_id=? and local_id=?", new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, str3});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateState result:  " + iUpdate);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f3357a);
                    sQLiteDatabase = this.f3357a;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "updateState: ", e);
                    }
                    sQLiteDatabase = this.f3357a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th) {
                DatabaseUtils.endTransaction(this.f3357a);
                throw th;
            }
        }
    }

    public final void b(final int i, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.7
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c(i, str, str2);
            }
        });
    }

    public final void c(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearLoadCheckCampaigns: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f3357a);
                    int iDelete = this.f3357a.delete(FirebaseAnalytics.Param.CAMPAIGN, "ad_type=? and app_id=? and placement_id=? and unit_id=? and state in (0,405,401,404);", new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearLoadCheckCampaigns result:  " + iDelete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f3357a);
                    sQLiteDatabase = this.f3357a;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearLoadCheckCampaigns: ", e);
                    }
                    sQLiteDatabase = this.f3357a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th) {
                DatabaseUtils.endTransaction(this.f3357a);
                throw th;
            }
        }
    }

    public final void d(int i, String str, String str2) {
        SQLiteDatabase sQLiteDatabase;
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "clearUnInvalidCampaign: database is not available");
                return;
            }
            return;
        }
        synchronized (this.b) {
            try {
                try {
                    DatabaseUtils.beginTransaction(this.f3357a);
                    int iDelete = this.f3357a.delete(FirebaseAnalytics.Param.CAMPAIGN, a(), new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())});
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearUnInvalidCampaign result:  " + iDelete);
                    }
                    DatabaseUtils.setTransactionSuccessful(this.f3357a);
                    sQLiteDatabase = this.f3357a;
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "clearUnInvalidCampaign: ", e);
                    }
                    sQLiteDatabase = this.f3357a;
                }
                DatabaseUtils.endTransaction(sQLiteDatabase);
            } catch (Throwable th) {
                DatabaseUtils.endTransaction(this.f3357a);
                throw th;
            }
        }
    }

    public final List<String> e(int i, String str, String str2) {
        Cursor cursorQuery;
        Cursor cursor = null;
        if (!DatabaseUtils.isDatabaseAvailable(this.f3357a)) {
            if (MBridgeConstans.DEBUG) {
                ad.b("CampaignTable", "database is not available");
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.b) {
            try {
                try {
                    cursorQuery = this.f3357a.query(FirebaseAnalytics.Param.CAMPAIGN, null, a(), new String[]{String.valueOf(i), com.mbridge.msdk.foundation.controller.c.m().k(), str, str2, String.valueOf(System.currentTimeMillis())}, null, null, null, null);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            if (cursorQuery != null) {
                try {
                } catch (Exception e2) {
                    e = e2;
                    cursor = cursorQuery;
                    if (MBridgeConstans.DEBUG) {
                        ad.a("CampaignTable", "find: ", e);
                    }
                    DatabaseUtils.closeCursor(cursor);
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    DatabaseUtils.closeCursor(cursor);
                    throw th;
                }
                if (cursorQuery.getCount() > 0) {
                    int columnIndex = cursorQuery.getColumnIndex("local_id");
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            arrayList.add(string);
                        }
                    }
                    DatabaseUtils.closeCursor(cursorQuery);
                    return arrayList;
                }
            }
            DatabaseUtils.closeCursor(cursorQuery);
            return null;
        }
    }

    private static String a() {
        return "ad_type=? and app_id=? and placement_id=? and unit_id=? and (state in (6,402,406,403,8,7) or invalid_time<? )";
    }

    private static List<com.mbridge.msdk.newreward.function.d.a.b> a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (cursor2 == null || cursor.getCount() <= 0) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int columnIndex = cursor2.getColumnIndex("ad_type");
            int columnIndex2 = cursor2.getColumnIndex("app_id");
            int columnIndex3 = cursor2.getColumnIndex("placement_id");
            int columnIndex4 = cursor2.getColumnIndex(MBridgeConstans.PROPERTIES_UNIT_ID);
            int columnIndex5 = cursor2.getColumnIndex("request_id");
            int columnIndex6 = cursor2.getColumnIndex("local_id");
            int columnIndex7 = cursor2.getColumnIndex("bid_token");
            int columnIndex8 = cursor2.getColumnIndex("header_bidding");
            int columnIndex9 = cursor2.getColumnIndex("load_start_time");
            int columnIndex10 = cursor2.getColumnIndex("backup_id");
            int columnIndex11 = cursor2.getColumnIndex("state");
            int columnIndex12 = cursor2.getColumnIndex("template");
            int columnIndex13 = cursor2.getColumnIndex("invalid_time");
            int columnIndex14 = cursor2.getColumnIndex("invalid_time_2");
            ArrayList arrayList2 = arrayList;
            int columnIndex15 = cursor2.getColumnIndex("invalid_time_backup");
            int columnIndex16 = cursor2.getColumnIndex("ecppv");
            int columnIndex17 = cursor2.getColumnIndex("session_id");
            int i = columnIndex14;
            int columnIndex18 = cursor2.getColumnIndex("system_id");
            int i2 = columnIndex13;
            int columnIndex19 = cursor2.getColumnIndex("show_count");
            int columnIndex20 = cursor2.getColumnIndex(com.mbridge.msdk.foundation.entity.b.JSON_KEY_PARENT_SESSION_ID);
            int columnIndex21 = cursor2.getColumnIndex("data");
            int columnIndex22 = cursor2.getColumnIndex("token_rule");
            while (cursor.moveToNext()) {
                int i3 = columnIndex22;
                int i4 = columnIndex;
                int i5 = columnIndex2;
                int i6 = columnIndex3;
                int i7 = columnIndex4;
                com.mbridge.msdk.newreward.function.d.a.b bVar = new com.mbridge.msdk.newreward.function.d.a.b(cursor2.getInt(columnIndex), cursor2.getString(columnIndex2), cursor2.getString(columnIndex3), cursor2.getString(columnIndex4));
                bVar.a(cursor2.getString(columnIndex5));
                bVar.b(cursor2.getString(columnIndex6));
                String string = cursor2.getString(columnIndex7);
                bVar.c(string);
                boolean z = true;
                if (cursor2.getInt(columnIndex8) != 1) {
                    z = false;
                }
                bVar.a(z);
                bVar.e(cursor2.getLong(columnIndex9));
                bVar.d(cursor2.getString(columnIndex17));
                bVar.e(cursor2.getString(columnIndex18));
                bVar.f(cursor2.getString(columnIndex10));
                bVar.a(cursor2.getInt(columnIndex11));
                bVar.b(cursor2.getInt(columnIndex12));
                int i8 = columnIndex18;
                int i9 = columnIndex17;
                int i10 = i2;
                bVar.b(cursor2.getLong(i10));
                i2 = i10;
                int i11 = i;
                bVar.c(cursor2.getLong(i11));
                i = i11;
                int i12 = columnIndex15;
                bVar.d(cursor2.getLong(i12));
                columnIndex15 = i12;
                int i13 = columnIndex16;
                bVar.a(cursor2.getDouble(i13));
                int i14 = columnIndex19;
                bVar.c(cursor2.getInt(i14));
                columnIndex16 = i13;
                int i15 = columnIndex20;
                bVar.g(cursor2.getString(i15));
                bVar.i(cursor2.getInt(i3));
                int i16 = columnIndex21;
                JSONObject jSONObject = JSONUtils.parse(cursor2.getString(i16));
                bVar.a(jSONObject);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(bVar);
                CampaignUnit campaignUnit = CampaignUnit.parseCampaignUnit(jSONObject, string);
                if (campaignUnit != null) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    if (ads != null) {
                        for (CampaignEx campaignEx : ads) {
                            int i17 = i16;
                            int i18 = i14;
                            campaignEx.setRequestId(bVar.d());
                            campaignEx.setLocalRequestId(bVar.e());
                            com.mbridge.msdk.newreward.function.d.a.a aVar = new com.mbridge.msdk.newreward.function.d.a.a(bVar);
                            aVar.a(campaignEx);
                            int i19 = i15;
                            aVar.b(campaignEx.getAppName());
                            aVar.c(campaignEx.getRequestIdNotice());
                            aVar.a(campaignEx.getId());
                            arrayList4.add(aVar);
                            bVar.h(campaignEx.getCMPTEntryUrl());
                            bVar.f(campaignEx.getMof_tplid());
                            bVar.h(campaignEx.getVcn());
                            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
                            if (rewardTemplateMode != null) {
                                bVar.g(rewardTemplateMode.b());
                            }
                            i14 = i18;
                            i16 = i17;
                            i15 = i19;
                        }
                        columnIndex21 = i16;
                        int i20 = i14;
                        int i21 = i15;
                        bVar.b(ads);
                        bVar.a(arrayList4);
                        cursor2 = cursor;
                        arrayList2 = arrayList3;
                        columnIndex18 = i8;
                        columnIndex17 = i9;
                        columnIndex19 = i20;
                        columnIndex22 = i3;
                        columnIndex = i4;
                        columnIndex2 = i5;
                        columnIndex3 = i6;
                        columnIndex4 = i7;
                        columnIndex20 = i21;
                    }
                }
                cursor2 = cursor;
                arrayList2 = arrayList3;
                columnIndex21 = i16;
                columnIndex20 = i15;
                columnIndex18 = i8;
                columnIndex17 = i9;
                columnIndex22 = i3;
                columnIndex = i4;
                columnIndex3 = i6;
                columnIndex4 = i7;
                columnIndex19 = i14;
                columnIndex2 = i5;
            }
            return arrayList2;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            ad.a("CampaignTable", "parseCampaignTable: ", e);
            return null;
        }
    }

    public final void a(final int i, final String str, final String str2, final String str3, final boolean z, final String str4, final long j) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.1
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i, str, str2, str3, z, str4, j);
            }
        });
    }

    public final void a(final int i, final String str, final String str2, final boolean z, final int i2, final b bVar) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.4
            @Override // java.lang.Runnable
            public final void run() {
                List<com.mbridge.msdk.newreward.function.d.a.b> listA = a.this.a(i, str, str2, z, i2);
                if (listA == null || listA.size() == 0) {
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                        return;
                    }
                    return;
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    bVar3.a(listA);
                }
            }
        });
    }

    public final void a(final int i, final String str, final String str2, final String str3, final int i2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.5
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b(i, str, str2, str3, i2);
            }
        });
    }

    public final void a(final int i, final String str, final String str2) {
        MBridgeTaskManager.campaignTableExecute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.e.a.6
            @Override // java.lang.Runnable
            public final void run() {
                a.this.d(i, str, str2);
            }
        });
    }
}
