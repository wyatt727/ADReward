package com.bytedance.sdk.component.adexpress.EYQ.mZx;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import android.util.LruCache;
import com.bytedance.sdk.component.utils.pi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: TmplDbHelper.java */
/* loaded from: classes2.dex */
public class IPb {
    public static int EYQ = 20;
    private static volatile IPb mZx;
    private volatile ConcurrentHashMap<String, com.bytedance.sdk.component.adexpress.EYQ.Td.Td> Kbd;
    private final Object Pm = new Object();
    private AtomicBoolean IPb = new AtomicBoolean(false);
    private LruCache<String, com.bytedance.sdk.component.adexpress.EYQ.Td.mZx> VwS = new LruCache<String, com.bytedance.sdk.component.adexpress.EYQ.Td.mZx>(EYQ) { // from class: com.bytedance.sdk.component.adexpress.EYQ.mZx.IPb.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        /* renamed from: EYQ, reason: merged with bridge method [inline-methods] */
        public int sizeOf(String str, com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzx) {
            return 1;
        }
    };
    private Set<String> Td = Collections.synchronizedSet(new HashSet());

    public static void EYQ(int i) {
        EYQ = i;
    }

    public static IPb EYQ() {
        if (mZx == null) {
            synchronized (IPb.class) {
                if (mZx == null) {
                    mZx = new IPb();
                }
            }
        }
        return mZx;
    }

    private IPb() {
    }

    com.bytedance.sdk.component.adexpress.EYQ.Td.mZx EYQ(String str) {
        com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzx;
        com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzxEYQ;
        if (TextUtils.isEmpty(str) || com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx() == null) {
            return null;
        }
        synchronized (this.Pm) {
            mzx = this.VwS.get(String.valueOf(str));
        }
        if (mzx != null) {
            return mzx;
        }
        Cursor cursorEYQ = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx().EYQ("template_diff_new", null, "id=?", new String[]{str}, null, null, null);
        if (cursorEYQ != null) {
            try {
                if (cursorEYQ.moveToFirst()) {
                    do {
                        String string = cursorEYQ.getString(cursorEYQ.getColumnIndex("rit"));
                        String string2 = cursorEYQ.getString(cursorEYQ.getColumnIndex("id"));
                        String string3 = cursorEYQ.getString(cursorEYQ.getColumnIndex("md5"));
                        String string4 = cursorEYQ.getString(cursorEYQ.getColumnIndex("url"));
                        String string5 = cursorEYQ.getString(cursorEYQ.getColumnIndex("data"));
                        mzxEYQ = new com.bytedance.sdk.component.adexpress.EYQ.Td.mZx().EYQ(string).mZx(string2).Td(string3).Pm(string4).Kbd(string5).IPb(cursorEYQ.getString(cursorEYQ.getColumnIndex("version"))).EYQ(Long.valueOf(cursorEYQ.getLong(cursorEYQ.getColumnIndex("update_time"))));
                        synchronized (this.Pm) {
                            this.VwS.put(string2, mzxEYQ);
                        }
                        this.Td.add(string2);
                    } while (cursorEYQ.moveToNext());
                    return mzxEYQ;
                }
            } finally {
                try {
                } finally {
                }
            }
        }
        return null;
    }

    Set<String> mZx(String str) {
        if (!TextUtils.isEmpty(str) && com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx() != null) {
            HashSet hashSet = new HashSet();
            Cursor cursorEYQ = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx().EYQ("template_diff_new", null, "rit=?", new String[]{str}, null, null, null);
            try {
                if (cursorEYQ != null) {
                    try {
                        if (cursorEYQ.moveToFirst()) {
                            do {
                                hashSet.add(cursorEYQ.getString(cursorEYQ.getColumnIndex("id")));
                            } while (cursorEYQ.moveToNext());
                            return hashSet;
                        }
                    } catch (Exception e) {
                        Log.e("TmplDbHelper", "", e);
                    }
                }
            } finally {
                cursorEYQ.close();
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    List<com.bytedance.sdk.component.adexpress.EYQ.Td.mZx> mZx() {
        if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx() == null) {
            return null;
        }
        boolean z = this.IPb.get();
        this.IPb.set(true);
        ArrayList arrayList = new ArrayList();
        Cursor cursorEYQ = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx().EYQ("template_diff_new", null, null, null, null, null, null);
        if (cursorEYQ != null) {
            while (cursorEYQ.moveToNext()) {
                try {
                    String string = cursorEYQ.getString(cursorEYQ.getColumnIndex("rit"));
                    String string2 = cursorEYQ.getString(cursorEYQ.getColumnIndex("id"));
                    String string3 = cursorEYQ.getString(cursorEYQ.getColumnIndex("md5"));
                    String string4 = cursorEYQ.getString(cursorEYQ.getColumnIndex("url"));
                    String string5 = cursorEYQ.getString(cursorEYQ.getColumnIndex("data"));
                    String string6 = cursorEYQ.getString(cursorEYQ.getColumnIndex("version"));
                    arrayList.add(new com.bytedance.sdk.component.adexpress.EYQ.Td.mZx().EYQ(string).mZx(string2).Td(string3).Pm(string4).Kbd(string5).IPb(string6).EYQ(Long.valueOf(cursorEYQ.getLong(cursorEYQ.getColumnIndex("update_time")))));
                    synchronized (this.Pm) {
                        this.VwS.put(string2, arrayList.get(arrayList.size() - 1));
                    }
                    this.Td.add(string2);
                    if (!z && com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().IPb() != null) {
                        if (this.Kbd == null) {
                            this.Kbd = new ConcurrentHashMap<>();
                        }
                        if (string2 != null && !this.Kbd.contains(string2)) {
                            this.Kbd.put(string2, new com.bytedance.sdk.component.adexpress.EYQ.Td.Td(string, string2, string3));
                        }
                    }
                } catch (Throwable th) {
                    try {
                        pi.EYQ("TmplDbHelper", "getTemplate error", th);
                        if (cursorEYQ != null) {
                        }
                    } finally {
                        if (cursorEYQ != null) {
                            cursorEYQ.close();
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    void EYQ(com.bytedance.sdk.component.adexpress.EYQ.Td.mZx mzx, boolean z) {
        if (mzx == null || com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx() == null || TextUtils.isEmpty(mzx.mZx())) {
            return;
        }
        Cursor cursorEYQ = com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx().EYQ("template_diff_new", null, "id=?", new String[]{mzx.mZx()}, null, null, null);
        boolean z2 = cursorEYQ != null && cursorEYQ.getCount() > 0;
        if (cursorEYQ != null) {
            try {
                string = cursorEYQ.moveToFirst() ? cursorEYQ.getString(cursorEYQ.getColumnIndex("rit")) : null;
                cursorEYQ.close();
            } catch (Throwable unused) {
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("rit", mzx.EYQ());
        contentValues.put("id", mzx.mZx());
        contentValues.put("md5", mzx.Td());
        contentValues.put("url", mzx.Pm());
        contentValues.put("data", mzx.Kbd());
        contentValues.put("version", mzx.IPb());
        contentValues.put("update_time", mzx.VwS());
        if (z2) {
            com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx().EYQ("template_diff_new", contentValues, "id=?", new String[]{mzx.mZx()});
        } else {
            com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx().EYQ("template_diff_new", contentValues);
        }
        synchronized (this.Pm) {
            this.VwS.put(mzx.mZx(), mzx);
        }
        this.Td.add(mzx.mZx());
        if (z) {
            return;
        }
        try {
            if (com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().IPb() == null) {
                return;
            }
            if (this.Kbd == null) {
                this.Kbd = new ConcurrentHashMap<>();
            }
            com.bytedance.sdk.component.adexpress.EYQ.Td.Td td = new com.bytedance.sdk.component.adexpress.EYQ.Td.Td(mzx.EYQ(), mzx.mZx(), mzx.Td());
            this.Kbd.put(mzx.mZx(), td);
            if (string != null) {
                com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().IPb();
                td.mZx();
            }
            com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().IPb();
            mzx.EYQ();
        } catch (Throwable unused2) {
        }
    }

    void EYQ(Set<String> set) {
        if (set == null || set.isEmpty() || com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx() == null) {
            return;
        }
        String[] strArr = (String[]) set.toArray(new String[set.size()]);
        if (strArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                Pm(strArr[i]);
                com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().mZx().EYQ("template_diff_new", "id=?", new String[]{strArr[i]});
                Td(strArr[i]);
            }
        }
    }

    void Td(String str) {
        com.bytedance.sdk.component.adexpress.EYQ.Td.Td td;
        try {
            if (this.Kbd == null || this.Kbd.isEmpty() || (td = this.Kbd.get(str)) == null) {
                return;
            }
            if (!TextUtils.isEmpty(td.EYQ()) && com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().IPb() != null) {
                com.bytedance.sdk.component.adexpress.EYQ.EYQ.EYQ.EYQ().IPb();
            }
            this.Kbd.remove(str);
        } catch (Throwable unused) {
        }
    }

    private void Pm(String str) {
        LruCache<String, com.bytedance.sdk.component.adexpress.EYQ.Td.mZx> lruCache;
        if (TextUtils.isEmpty(str) || (lruCache = this.VwS) == null || lruCache.size() <= 0) {
            return;
        }
        synchronized (this.Pm) {
            this.VwS.remove(str);
        }
    }

    public static String Td() {
        return new StringBuilder("CREATE TABLE IF NOT EXISTS template_diff_new (_id INTEGER PRIMARY KEY AUTOINCREMENT,rit TEXT ,id TEXT UNIQUE,md5 TEXT ,url TEXT , data TEXT , version TEXT , update_time TEXT)").toString();
    }
}
