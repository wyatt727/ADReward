package com.applovin.impl;

import android.net.Uri;
import com.applovin.impl.m8;
import java.util.Map;

/* loaded from: classes.dex */
public interface m8 {

    /* renamed from: a, reason: collision with root package name */
    public static final m8 f639a = new m8() { // from class: com.applovin.impl.m8$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.m8
        public final i8[] a() {
            return m8.CC.b();
        }

        @Override // com.applovin.impl.m8
        public /* synthetic */ i8[] a(Uri uri, Map map) {
            return a();
        }
    };

    i8[] a();

    i8[] a(Uri uri, Map map);

    /* renamed from: com.applovin.impl.m8$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            m8 m8Var = m8.f639a;
        }

        public static /* synthetic */ i8[] b() {
            return new i8[0];
        }
    }
}
