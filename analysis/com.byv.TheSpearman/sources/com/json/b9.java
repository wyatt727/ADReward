package com.json;

import com.google.android.gms.ads.RequestConfiguration;
import com.json.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0007\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007J'\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\n¨\u0006\r"}, d2 = {"Lcom/ironsource/b9;", "", "reference", "", "errorMessage", "", "shouldThrowException", "a", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class b9 {

    /* renamed from: a, reason: collision with root package name */
    public static final b9 f1710a = new b9();

    private b9() {
    }

    @JvmStatic
    public static final <T> T a(T reference, T defaultValue) {
        return reference == null ? defaultValue : reference;
    }

    @JvmStatic
    public static final boolean a(Object obj) {
        return a(obj, null, false, 6, null);
    }

    @JvmStatic
    public static final boolean a(Object obj, String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        return a(obj, errorMessage, false, 4, null);
    }

    @JvmStatic
    public static final boolean a(Object reference, String errorMessage, boolean shouldThrowException) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        if (reference != null) {
            return true;
        }
        if (shouldThrowException) {
            throw new NullPointerException(errorMessage);
        }
        if (shouldThrowException) {
            throw new NoWhenBranchMatchedException();
        }
        IronLog.API.error(errorMessage);
        return false;
    }

    public static /* synthetic */ boolean a(Object obj, String str, boolean z, int i, Object obj2) {
        if ((i & 2) != 0) {
            str = "reference is null";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return a(obj, str, z);
    }
}
