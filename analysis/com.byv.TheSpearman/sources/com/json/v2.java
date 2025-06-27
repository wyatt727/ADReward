package com.json;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* loaded from: classes4.dex */
public class v2 {

    /* renamed from: a, reason: collision with root package name */
    MutableContextWrapper f2344a;

    public Activity a() {
        return (Activity) this.f2344a.getBaseContext();
    }

    public synchronized void a(Activity activity) {
        if (this.f2344a == null) {
            this.f2344a = new MutableContextWrapper(activity);
        }
        this.f2344a.setBaseContext(activity);
    }

    public synchronized void b() {
        this.f2344a = null;
    }
}
