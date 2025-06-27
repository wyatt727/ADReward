package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;

/* compiled from: LoadTimeDao.java */
/* loaded from: classes4.dex */
public class l extends a<com.mbridge.msdk.foundation.entity.h> {

    /* renamed from: a, reason: collision with root package name */
    private static l f2797a;

    private l(g gVar) {
        super(gVar);
    }

    public static l a(g gVar) {
        if (f2797a == null) {
            synchronized (l.class) {
                if (f2797a == null) {
                    f2797a = new l(gVar);
                }
            }
        }
        return f2797a;
    }

    public final synchronized int a() {
        int i;
        Cursor cursorRawQuery = null;
        i = 0;
        try {
            try {
                cursorRawQuery = getReadableDatabase().rawQuery("select count(*) from load_stat", null);
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

    public final synchronized void a(com.mbridge.msdk.foundation.entity.h hVar) {
        if (getWritableDatabase() == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("time", hVar.b());
        contentValues.put(CampaignEx.JSON_KEY_AD_SOURCE_ID, Integer.valueOf(hVar.a()));
        contentValues.put("adNum", Integer.valueOf(hVar.c()));
        contentValues.put(CampaignEx.JSON_KEY_CAMPAIGN_UNITID, hVar.d());
        contentValues.put("fb", Integer.valueOf(hVar.e()));
        contentValues.put("hb", Integer.valueOf(hVar.h()));
        contentValues.put("timeout", Integer.valueOf(hVar.i()));
        contentValues.put("network_type", Integer.valueOf(hVar.g()));
        contentValues.put("network_type_str", hVar.f());
        getWritableDatabase().insert("load_stat", null, contentValues);
    }

    public final synchronized List<com.mbridge.msdk.foundation.entity.h> a(int i) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Cursor cursor = null;
        arrayList2 = null;
        arrayList2 = null;
        cursor = null;
        try {
            try {
                Cursor cursorRawQuery = getReadableDatabase().rawQuery("select * from load_stat LIMIT " + i, null);
                if (cursorRawQuery != null) {
                    try {
                        try {
                            if (cursorRawQuery.getCount() > 0) {
                                arrayList = new ArrayList();
                                int i2 = 0;
                                while (cursorRawQuery.moveToNext() && i2 < i) {
                                    try {
                                        i2++;
                                        int i3 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_AD_SOURCE_ID));
                                        String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("time"));
                                        int i4 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("adNum"));
                                        String string2 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(CampaignEx.JSON_KEY_CAMPAIGN_UNITID));
                                        int i5 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("fb"));
                                        int i6 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("timeout"));
                                        int i7 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("network_type"));
                                        String string3 = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("network_type_str"));
                                        int i8 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("hb"));
                                        com.mbridge.msdk.foundation.entity.h hVar = new com.mbridge.msdk.foundation.entity.h(i3, string, i4, string2, i5, i6, i7);
                                        hVar.c(string3);
                                        hVar.c(i8);
                                        arrayList.add(hVar);
                                        int i9 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("id"));
                                        if (getWritableDatabase() != null) {
                                            getWritableDatabase().delete("load_stat", "id = ?", new String[]{i9 + ""});
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        cursor = cursorRawQuery;
                                        e.printStackTrace();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        arrayList2 = arrayList;
                                        return arrayList2;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            arrayList = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
        }
        return arrayList2;
    }
}
