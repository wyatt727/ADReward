package com.json;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/m3;", "Lcom/ironsource/m2;", "", "url", "Ljava/io/InputStream;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
final class m3 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    public static final m3 f1888a = new m3();

    private m3() {
    }

    @Override // com.json.m2
    public InputStream a(String url) throws IOException {
        Intrinsics.checkNotNullParameter(url, "url");
        InputStream inputStreamOpenStream = new URL(url).openStream();
        Intrinsics.checkNotNullExpressionValue(inputStreamOpenStream, "URL(url).openStream()");
        return inputStreamOpenStream;
    }
}
