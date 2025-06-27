package com.apm.insight.nativecrash;

import android.text.TextUtils;
import com.apm.insight.l.o;
import com.json.t2;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, String> f108a;

    public a(File file) {
        String strA;
        File fileC = o.c(file);
        if (!fileC.exists() || fileC.length() == 0 || (strA = NativeImpl.a(fileC.getAbsolutePath())) == null) {
            return;
        }
        String[] strArrSplit = strA.split("\n");
        this.f108a = new HashMap();
        for (String str : strArrSplit) {
            String[] strArrSplit2 = str.split(t2.i.b);
            if (strArrSplit2.length == 2) {
                this.f108a.put(strArrSplit2[0], strArrSplit2[1]);
            }
        }
    }

    public boolean a() {
        Map<String, String> map = this.f108a;
        return (map == null || map.isEmpty() || TextUtils.isEmpty(this.f108a.get("process_name")) || TextUtils.isEmpty(this.f108a.get("crash_thread_name")) || TextUtils.isEmpty(this.f108a.get("pid")) || TextUtils.isEmpty(this.f108a.get(ScarConstants.TOKEN_ID_KEY)) || TextUtils.isEmpty(this.f108a.get("start_time")) || TextUtils.isEmpty(this.f108a.get("crash_time")) || TextUtils.isEmpty(this.f108a.get("signal_line"))) ? false : true;
    }

    public String b() {
        return this.f108a.get("signal_line");
    }

    public Map<String, String> c() {
        return this.f108a;
    }
}
