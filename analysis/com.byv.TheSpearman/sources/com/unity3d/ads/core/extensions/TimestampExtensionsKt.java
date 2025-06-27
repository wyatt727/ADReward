package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimestampExtensions.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0003*\u00020\u0003¨\u0006\u0005"}, d2 = {"fromMillis", "Lcom/google/protobuf/Timestamp;", "millis", "", "duration", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimestampExtensionsKt {
    public static final Timestamp fromMillis(long j) {
        long j2 = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(j / j2).setNanos((int) ((j % j2) * 1000000)).build();
        Intrinsics.checkNotNullExpressionValue(timestampBuild, "newBuilder().setSeconds(…000000).toInt())).build()");
        return timestampBuild;
    }

    public static final long duration(long j) {
        return System.nanoTime() - j;
    }
}
