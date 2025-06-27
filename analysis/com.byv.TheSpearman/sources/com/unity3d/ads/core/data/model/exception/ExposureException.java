package com.unity3d.ads.core.data.model.exception;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExposureException.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0010\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0002\u0010\bR\u001d\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/ExposureException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "parameters", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "getParameters", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposureException(String message, Object[] parameters) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.parameters = parameters;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
