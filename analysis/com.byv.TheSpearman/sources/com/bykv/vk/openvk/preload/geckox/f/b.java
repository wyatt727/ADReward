package com.bykv.vk.openvk.preload.geckox.f;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: VersionedResLoader.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, a> f1412a = new HashMap();
    public AtomicBoolean b = new AtomicBoolean(false);
    public String c;
    private String d;

    public b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        this.d = str;
        if (file == null) {
            this.c = new File(context.getFilesDir(), "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
            return;
        }
        this.c = new File(file, str).getAbsolutePath();
    }

    public final a a(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(String.valueOf(str)));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f1412a) {
            aVar = this.f1412a.get(strSubstring);
            if (aVar == null) {
                aVar = new a(this.c, strSubstring);
                this.f1412a.put(strSubstring, aVar);
            }
        }
        return aVar;
    }

    public final Map<String, Long> a() {
        HashMap map = new HashMap();
        synchronized (this.f1412a) {
            Collection<a> collectionValues = this.f1412a.values();
            if (collectionValues == null) {
                return map;
            }
            for (a aVar : collectionValues) {
                map.put(aVar.b, aVar.d);
            }
            return map;
        }
    }
}
