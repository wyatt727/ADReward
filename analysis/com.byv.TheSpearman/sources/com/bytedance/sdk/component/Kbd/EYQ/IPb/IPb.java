package com.bytedance.sdk.component.Kbd.EYQ.IPb;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.json.unity.androidbridge.AndroidBridgeConstants;
import java.util.LinkedList;
import java.util.List;

/* compiled from: TrackRetryRepertoryImpl.java */
/* loaded from: classes2.dex */
public class IPb implements Kbd {
    private Context EYQ;

    public static String mZx() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0)";
    }

    public IPb(Context context) {
        this.EYQ = context;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.Kbd
    public List<Pm> EYQ() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorEYQ = com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(this.EYQ, "trackurl", null, null, null, null, null, null);
        if (cursorEYQ != null) {
            while (cursorEYQ.moveToNext()) {
                try {
                    String string = cursorEYQ.getString(cursorEYQ.getColumnIndex("id"));
                    String string2 = cursorEYQ.getString(cursorEYQ.getColumnIndex("url"));
                    boolean z = cursorEYQ.getInt(cursorEYQ.getColumnIndex("replaceholder")) > 0;
                    int i = cursorEYQ.getInt(cursorEYQ.getColumnIndex("retry"));
                    int i2 = cursorEYQ.getInt(cursorEYQ.getColumnIndex("url_type"));
                    String string3 = cursorEYQ.getString(cursorEYQ.getColumnIndex("ad_id"));
                    String string4 = cursorEYQ.getString(cursorEYQ.getColumnIndex(AndroidBridgeConstants.ERROR_CODE));
                    String string5 = cursorEYQ.getString(cursorEYQ.getColumnIndex("error_msg"));
                    Pm pm = new Pm(string, string2, z, i2, string3);
                    pm.EYQ(i);
                    if (!TextUtils.isEmpty(string4)) {
                        pm.EYQ(string4);
                    }
                    if (!TextUtils.isEmpty(string5)) {
                        pm.mZx(string5);
                    }
                    linkedList.add(pm);
                } catch (Throwable unused) {
                    if (cursorEYQ != null) {
                        try {
                            cursorEYQ.close();
                            cursorEYQ = null;
                        } finally {
                            if (cursorEYQ != null) {
                                cursorEYQ.close();
                            }
                        }
                    }
                    if (cursorEYQ != null) {
                    }
                }
            }
        }
        return linkedList;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.Kbd
    public Pm EYQ(String str) {
        Cursor cursorEYQ = com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(this.EYQ, "trackurl", null, "id=?", new String[]{str}, null, null, null);
        if (cursorEYQ != null && cursorEYQ.moveToFirst()) {
            try {
                String string = cursorEYQ.getString(cursorEYQ.getColumnIndex("id"));
                String string2 = cursorEYQ.getString(cursorEYQ.getColumnIndex("url"));
                boolean z = cursorEYQ.getInt(cursorEYQ.getColumnIndex("replaceholder")) > 0;
                int i = cursorEYQ.getInt(cursorEYQ.getColumnIndex("retry"));
                int i2 = cursorEYQ.getInt(cursorEYQ.getColumnIndex("url_type"));
                String string3 = cursorEYQ.getString(cursorEYQ.getColumnIndex("ad_id"));
                String string4 = cursorEYQ.getString(cursorEYQ.getColumnIndex(AndroidBridgeConstants.ERROR_CODE));
                String string5 = cursorEYQ.getString(cursorEYQ.getColumnIndex("error_msg"));
                Pm pm = new Pm(string, string2, z, i2, string3);
                pm.EYQ(i);
                if (!TextUtils.isEmpty(string4)) {
                    pm.EYQ(string4);
                }
                if (!TextUtils.isEmpty(string5)) {
                    pm.mZx(string5);
                }
                return pm;
            } catch (Throwable th) {
                try {
                    th.getMessage();
                    cursorEYQ.close();
                    cursorEYQ = null;
                } finally {
                    cursorEYQ.close();
                }
            }
        }
        if (cursorEYQ != null) {
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.Kbd
    public void EYQ(Pm pm) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", pm.EYQ());
        contentValues.put("url", pm.mZx());
        contentValues.put("replaceholder", Integer.valueOf(pm.Td() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(pm.Pm()));
        contentValues.put("url_type", Integer.valueOf(pm.Kbd()));
        contentValues.put("ad_id", pm.IPb());
        contentValues.put(AndroidBridgeConstants.ERROR_CODE, pm.VwS());
        contentValues.put("error_msg", pm.HX());
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(this.EYQ, "trackurl", contentValues);
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.Kbd
    public void mZx(Pm pm) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", pm.EYQ());
        contentValues.put("url", pm.mZx());
        contentValues.put("replaceholder", Integer.valueOf(pm.Td() ? 1 : 0));
        contentValues.put("retry", Integer.valueOf(pm.Pm()));
        contentValues.put(AndroidBridgeConstants.ERROR_CODE, pm.VwS());
        contentValues.put("error_msg", pm.HX());
        contentValues.put("url_type", Integer.valueOf(pm.Kbd()));
        contentValues.put("ad_id", pm.IPb());
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(this.EYQ, "trackurl", contentValues, "id=?", new String[]{pm.EYQ()});
    }

    @Override // com.bytedance.sdk.component.Kbd.EYQ.IPb.Kbd
    public void Td(Pm pm) {
        com.bytedance.sdk.component.Kbd.EYQ.EYQ.EYQ.Td.EYQ(this.EYQ, "trackurl", "id=?", new String[]{pm.EYQ()});
    }
}
