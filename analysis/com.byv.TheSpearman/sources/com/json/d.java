package com.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/d;", "Lcom/ironsource/c5;", "", "value", "Lcom/ironsource/kb;", "a", "Lcom/ironsource/kb;", "folderRootUrl", "<init>", "(Lcom/ironsource/kb;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class d implements c5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kb folderRootUrl;

    public d(kb folderRootUrl) {
        Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.folderRootUrl = folderRootUrl;
    }

    @Override // com.json.c5
    public String value() {
        return this.folderRootUrl.a() + "/abTestMap.json";
    }
}
