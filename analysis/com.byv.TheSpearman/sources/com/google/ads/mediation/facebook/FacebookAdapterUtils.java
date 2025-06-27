package com.google.ads.mediation.facebook;

import com.json.bd;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: FacebookAdapterUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/ads/mediation/facebook/FacebookAdapterUtils;", "", "()V", bd.c, "", "getAdapterVersion$annotations", "getAdapterVersion", "()Ljava/lang/String;", "meta_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FacebookAdapterUtils {
    public static final FacebookAdapterUtils INSTANCE = new FacebookAdapterUtils();

    public static final String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    @JvmStatic
    public static /* synthetic */ void getAdapterVersion$annotations() {
    }

    private FacebookAdapterUtils() {
    }
}
