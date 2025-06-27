package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.af;

/* compiled from: MBridgeRefactor.java */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f2825a;
    private Boolean b = null;
    private Boolean c = null;

    private b() {
    }

    public static b a() {
        if (f2825a == null) {
            synchronized (b.class) {
                if (f2825a == null) {
                    f2825a = new b();
                }
            }
        }
        return f2825a;
    }

    public final Boolean b() {
        return this.b;
    }

    public final Boolean c() {
        return this.c;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equals("new_bridge_reward_video")) {
            if (!str.equals("new_bridge_new_interstitial_video")) {
                return false;
            }
            Boolean boolValueOf = Boolean.valueOf(af.a().a("new_bridge_new_interstitial_video", false, false));
            this.c = boolValueOf;
            return boolValueOf.booleanValue();
        }
        Boolean boolValueOf2 = Boolean.valueOf(af.a().a("new_bridge_reward_video", false, false));
        this.b = boolValueOf2;
        return boolValueOf2.booleanValue();
    }
}
