package com.apm.insight;

import android.text.TextUtils;
import com.apm.insight.l.l;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class b implements ICrashCallback, IOOMCallback {

    /* renamed from: a, reason: collision with root package name */
    private IOOMCallback f10a;
    private ICrashCallback b;
    private String c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.c = str;
        this.b = iCrashCallback;
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.c = str;
        this.f10a = iOOMCallback;
    }

    public void a(CrashType crashType, String str, String str2, String str3) {
        h hVarA;
        if (this.b == null || (hVarA = h.a(this.c)) == null || !hVarA.a(str3, str2)) {
            return;
        }
        this.b.onCrash(crashType, str, null);
    }

    public void a(CrashType crashType, String str, Thread thread, JSONArray jSONArray) {
        if (this.b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(l.b(jSONArray.optJSONObject(i), "header", "aid"), this.c)) {
                this.b.onCrash(crashType, str, thread);
            }
        }
    }

    public void a(CrashType crashType, Throwable th, Thread thread, long j, JSONArray jSONArray) {
        if (this.f10a == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(l.b(jSONArray.optJSONObject(i), "header", "aid"), this.c)) {
                this.f10a.onCrash(crashType, th, thread, j);
            }
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public void onCrash(CrashType crashType, String str, Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public void onCrash(CrashType crashType, Throwable th, Thread thread, long j) {
    }
}
