package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.b6;
import com.applovin.impl.g5;

/* loaded from: classes.dex */
public final class u5 implements g5.a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1056a;
    private final yo b;
    private final g5.a c;

    public u5(Context context, yo yoVar, g5.a aVar) {
        this.f1056a = context.getApplicationContext();
        this.b = yoVar;
        this.c = aVar;
    }

    @Override // com.applovin.impl.g5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public t5 a() {
        t5 t5Var = new t5(this.f1056a, this.c.a());
        yo yoVar = this.b;
        if (yoVar != null) {
            t5Var.a(yoVar);
        }
        return t5Var;
    }

    public u5(Context context, String str) {
        this(context, str, (yo) null);
    }

    public u5(Context context, String str, yo yoVar) {
        this(context, yoVar, new b6.b().a(str));
    }
}
