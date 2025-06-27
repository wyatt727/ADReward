package com.json;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class l implements he {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f1864a;

    public l(Activity activity) {
        this.f1864a = new WeakReference<>(activity);
    }

    @Override // com.json.he
    public void a() {
        Activity activity = this.f1864a.get();
        if (activity != null) {
            activity.requestWindowFeature(1);
        }
    }
}
