package com.my.target;

import android.content.Context;
import com.my.target.common.models.VideoData;

/* loaded from: classes4.dex */
public class b8 {

    /* renamed from: a, reason: collision with root package name */
    public final k7 f3929a;
    public final Context b;
    public boolean c = true;

    public b8(k7 k7Var, Context context) {
        this.f3929a = k7Var;
        this.b = context;
    }

    public static b8 a(k7 k7Var, Context context) {
        return new b8(k7Var, context);
    }

    public d8 a(ca caVar, boolean z) {
        return new d8(this.b, caVar, z, this.c);
    }

    public o7 a(b5<VideoData> b5Var) {
        return o7.a(b5Var, this.f3929a, this.b);
    }

    public w0 a() {
        return new w0(this.b);
    }

    public void a(boolean z) {
        this.c = z;
    }

    public ha b(ca caVar, boolean z) {
        return new ha(this.b, caVar, z);
    }

    public t4 b() {
        return new a8(this.b, this);
    }

    public t4 c() {
        return new i8(this.b, this.c);
    }
}
