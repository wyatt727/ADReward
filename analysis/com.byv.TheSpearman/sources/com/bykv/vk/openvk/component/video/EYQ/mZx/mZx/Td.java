package com.bykv.vk.openvk.component.video.EYQ.mZx.mZx;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.sdk.component.VwS.HX;
import com.json.t2;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: VideoProxyDB.java */
/* loaded from: classes.dex */
public class Td {
    private static volatile Td mZx;
    private final SparseArray<Map<String, EYQ>> EYQ;
    private volatile SQLiteStatement Kbd;
    private final Executor Pm;
    private final Pm Td;

    private Td(Context context) {
        SparseArray<Map<String, EYQ>> sparseArray = new SparseArray<>(2);
        this.EYQ = sparseArray;
        this.Pm = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new HX(5, "video_proxy_db"));
        this.Td = new Pm(context.getApplicationContext());
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    public static Td EYQ(Context context) {
        if (mZx == null) {
            synchronized (Td.class) {
                if (mZx == null) {
                    mZx = new Td(context);
                }
            }
        }
        return mZx;
    }

    public EYQ EYQ(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map<String, EYQ> map = this.EYQ.get(i);
        EYQ eyq = map == null ? null : map.get(str);
        if (eyq != null) {
            return eyq;
        }
        try {
            Cursor cursorQuery = this.Td.getReadableDatabase().query("video_http_header_t", null, "key=? AND flag=?", new String[]{str, String.valueOf(i)}, null, null, null, "1");
            if (cursorQuery != null) {
                if (cursorQuery.getCount() > 0 && cursorQuery.moveToNext()) {
                    eyq = new EYQ(cursorQuery.getString(cursorQuery.getColumnIndex(t2.h.W)), cursorQuery.getString(cursorQuery.getColumnIndex("mime")), cursorQuery.getInt(cursorQuery.getColumnIndex("contentLength")), i, cursorQuery.getString(cursorQuery.getColumnIndex("extra")));
                }
                cursorQuery.close();
            }
            if (eyq != null && map != null) {
                map.put(str, eyq);
            }
            return eyq;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void EYQ(final EYQ eyq) {
        if (eyq != null) {
            Map<String, EYQ> map = this.EYQ.get(eyq.Pm);
            if (map != null) {
                map.put(eyq.EYQ, eyq);
            }
            this.Pm.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (Td.this.Kbd != null) {
                            Td.this.Kbd.clearBindings();
                        } else {
                            Td td = Td.this;
                            td.Kbd = td.Td.getWritableDatabase().compileStatement("INSERT INTO video_http_header_t (key,mime,contentLength,flag,extra) VALUES(?,?,?,?,?)");
                        }
                        Td.this.Kbd.bindString(1, eyq.EYQ);
                        Td.this.Kbd.bindString(2, eyq.mZx);
                        Td.this.Kbd.bindLong(3, eyq.Td);
                        Td.this.Kbd.bindLong(4, eyq.Pm);
                        Td.this.Kbd.bindString(5, eyq.Kbd);
                        Td.this.Kbd.executeInsert();
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public void EYQ(Collection<String> collection, int i) {
        if (collection == null || collection.isEmpty()) {
            return;
        }
        int size = collection.size() + 1;
        String[] strArr = new String[size];
        int i2 = -1;
        Map<String, EYQ> map = this.EYQ.get(i);
        for (String str : collection) {
            if (map != null) {
                map.remove(str);
            }
            i2++;
            strArr[i2] = str;
        }
        strArr[i2 + 1] = String.valueOf(i);
        try {
            this.Td.getWritableDatabase().delete("video_http_header_t", "key IN(" + mZx(size) + ") AND flag=?", strArr);
        } catch (Throwable unused) {
        }
    }

    private String mZx(int i) {
        if (i <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(i << 1);
        sb.append("?");
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(",?");
        }
        return sb.toString();
    }

    public void EYQ(final int i) {
        Map<String, EYQ> map = this.EYQ.get(i);
        if (map != null) {
            map.clear();
        }
        this.Pm.execute(new Runnable() { // from class: com.bykv.vk.openvk.component.video.EYQ.mZx.mZx.Td.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    Td.this.Td.getWritableDatabase().delete("video_http_header_t", "flag=?", new String[]{String.valueOf(i)});
                } catch (Throwable unused) {
                }
            }
        });
    }
}
