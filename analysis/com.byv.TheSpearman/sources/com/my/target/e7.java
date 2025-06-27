package com.my.target;

import android.content.Context;
import com.my.target.common.models.VideoData;

/* loaded from: classes4.dex */
public final class e7 {

    /* renamed from: a, reason: collision with root package name */
    public final k7 f3960a;
    public final Context b;
    public boolean c = true;

    public e7(k7 k7Var, Context context) {
        this.f3960a = k7Var;
        this.b = context;
    }

    public static e7 a(k7 k7Var, Context context) {
        return new e7(k7Var, context);
    }

    public o7 a(b5<VideoData> b5Var) {
        return o7.a(b5Var, this.f3960a, this.b);
    }

    public w a() {
        return d5.a(this.c, this.b);
    }

    public void a(boolean z) {
        this.c = z;
    }
}
