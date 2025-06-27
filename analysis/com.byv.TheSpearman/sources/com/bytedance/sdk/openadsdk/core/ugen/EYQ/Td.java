package com.bytedance.sdk.openadsdk.core.ugen.EYQ;

import android.content.ContentValues;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.openadsdk.core.hu;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: UGenTmplDbHelper.java */
/* loaded from: classes2.dex */
public class Td {
    public static int EYQ = 20;
    private static volatile Td mZx;
    private final Object Td = new Object();
    private final LruCache<String, EYQ> Pm = new LruCache<String, EYQ>(EYQ) { // from class: com.bytedance.sdk.openadsdk.core.ugen.EYQ.Td.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, EYQ eyq) {
            return 1;
        }
    };

    public static String Pm() {
        return "ALTER TABLE ugen_template ADD COLUMN rit TEXT ";
    }

    private Td() {
    }

    public static Td EYQ() {
        if (mZx == null) {
            synchronized (Td.class) {
                if (mZx == null) {
                    mZx = new Td();
                }
            }
        }
        return mZx;
    }

    EYQ EYQ(String str, String str2) {
        EYQ eyq;
        EYQ EYQ2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.Td) {
            eyq = this.Pm.get(str);
        }
        if (eyq != null) {
            if (TextUtils.equals(str2, eyq.mZx())) {
                return eyq;
            }
            mZx(str2);
            return null;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.Td td = new com.bytedance.sdk.openadsdk.multipro.aidl.Td(com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ(), "ugen_template", null, "id=? AND md5=?", new String[]{str, str2}, null, null, null));
        try {
            if (td.moveToFirst()) {
                do {
                    int columnIndex = td.getColumnIndex("id");
                    int columnIndex2 = td.getColumnIndex("md5");
                    int columnIndex3 = td.getColumnIndex("url");
                    int columnIndex4 = td.getColumnIndex("data");
                    int columnIndex5 = td.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = td.getColumnIndex("rit");
                        String string = td.getString(columnIndex);
                        String string2 = td.getString(columnIndex2);
                        EYQ2 = new EYQ().EYQ(string).mZx(string2).Pm(td.getString(columnIndex4)).Td(td.getString(columnIndex3)).Kbd(columnIndex6 != -1 ? td.getString(columnIndex6) : null).EYQ(Long.valueOf(td.getLong(columnIndex5)));
                        synchronized (this.Td) {
                            this.Pm.put(string, EYQ2);
                        }
                    }
                    return null;
                } while (td.moveToNext());
                return EYQ2;
            }
        } finally {
            try {
                return null;
            } finally {
            }
        }
        return null;
    }

    void EYQ(EYQ eyq) {
        if (eyq == null || TextUtils.isEmpty(eyq.EYQ())) {
            return;
        }
        com.bytedance.sdk.openadsdk.multipro.aidl.Td td = new com.bytedance.sdk.openadsdk.multipro.aidl.Td(com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ(), "ugen_template", null, "id=?", new String[]{eyq.EYQ()}, null, null, null));
        boolean z = td.getCount() > 0;
        try {
            td.close();
        } catch (Throwable unused) {
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", eyq.EYQ());
        contentValues.put("md5", eyq.mZx());
        contentValues.put("url", eyq.Td());
        contentValues.put("data", eyq.Kbd());
        contentValues.put("rit", eyq.IPb());
        contentValues.put("update_time", eyq.Pm());
        if (z) {
            com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ(), "ugen_template", contentValues, "id=?", new String[]{eyq.EYQ()});
        } else {
            com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ(), "ugen_template", contentValues);
        }
        synchronized (this.Td) {
            this.Pm.put(eyq.EYQ(), eyq);
        }
    }

    List<EYQ> mZx() {
        ArrayList arrayList = new ArrayList();
        com.bytedance.sdk.openadsdk.multipro.aidl.Td td = new com.bytedance.sdk.openadsdk.multipro.aidl.Td(com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ(), "ugen_template", null, null, null, null, null, null));
        try {
            if (td.moveToFirst()) {
                do {
                    int columnIndex = td.getColumnIndex("id");
                    int columnIndex2 = td.getColumnIndex("md5");
                    int columnIndex3 = td.getColumnIndex("url");
                    int columnIndex4 = td.getColumnIndex("data");
                    int columnIndex5 = td.getColumnIndex("update_time");
                    if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex5 != -1 && columnIndex4 != -1) {
                        int columnIndex6 = td.getColumnIndex("rit");
                        String string = columnIndex6 != -1 ? td.getString(columnIndex6) : null;
                        String string2 = td.getString(columnIndex);
                        String string3 = td.getString(columnIndex2);
                        String string4 = td.getString(columnIndex3);
                        EYQ EYQ2 = new EYQ().EYQ(string2).mZx(string3).Td(string4).Pm(td.getString(columnIndex4)).Kbd(string).EYQ(Long.valueOf(td.getLong(columnIndex5)));
                        arrayList.add(EYQ2);
                        synchronized (this.Td) {
                            this.Pm.put(string2, EYQ2);
                        }
                    }
                } while (td.moveToNext());
            }
        } finally {
            try {
                return arrayList;
            } finally {
            }
        }
        return arrayList;
    }

    Set<EYQ> EYQ(String str) {
        EYQ eyq;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        HashSet hashSet = new HashSet();
        com.bytedance.sdk.openadsdk.multipro.aidl.Td td = new com.bytedance.sdk.openadsdk.multipro.aidl.Td(com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ(), "ugen_template", null, "rit=?", new String[]{str}, null, null, null));
        try {
            if (td.moveToFirst()) {
                do {
                    int columnIndex = td.getColumnIndex("id");
                    if (columnIndex != -1) {
                        String string = td.getString(columnIndex);
                        if (!TextUtils.isEmpty(string)) {
                            synchronized (this.Td) {
                                eyq = this.Pm.get(string);
                            }
                            if (eyq != null) {
                                hashSet.add(eyq);
                            } else {
                                EYQ eyq2 = new EYQ();
                                int columnIndex2 = td.getColumnIndex("data");
                                if (columnIndex2 != -1) {
                                    String string2 = td.getString(columnIndex2);
                                    if (!TextUtils.isEmpty(string2)) {
                                        eyq2.Pm(string2);
                                        eyq2.EYQ(string);
                                        eyq2.Kbd(str);
                                        int columnIndex3 = td.getColumnIndex("md5");
                                        int columnIndex4 = td.getColumnIndex("url");
                                        int columnIndex5 = td.getColumnIndex("update_time");
                                        if (columnIndex3 != -1) {
                                            eyq2.mZx(td.getString(columnIndex3));
                                        }
                                        if (columnIndex4 != -1) {
                                            eyq2.Td(td.getString(columnIndex4));
                                        }
                                        if (columnIndex5 != -1) {
                                            eyq2.EYQ(Long.valueOf(td.getLong(columnIndex5)));
                                        }
                                        hashSet.add(eyq2);
                                        synchronized (this.Td) {
                                            this.Pm.put(string, eyq2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } while (td.moveToNext());
            }
        } finally {
            try {
                return hashSet;
            } finally {
            }
        }
        return hashSet;
    }

    void EYQ(Set<String> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (String str : strArr) {
                mZx(str);
                com.bytedance.sdk.openadsdk.multipro.EYQ.EYQ.EYQ(hu.EYQ(), "ugen_template", "id=?", new String[]{str});
            }
        }
    }

    private void mZx(String str) {
        if (!TextUtils.isEmpty(str) && this.Pm.size() > 0) {
            synchronized (this.Td) {
                this.Pm.remove(str);
            }
        }
    }

    public static String Td() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS ugen_template (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , rit TEXT , update_time TEXT)").toString();
    }
}
