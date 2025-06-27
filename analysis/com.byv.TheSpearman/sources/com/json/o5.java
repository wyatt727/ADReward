package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/o5;", "Lcom/ironsource/p5;", "", "a", "Lcom/ironsource/s5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "J", "timeoutInMills", "Lcom/ironsource/s5;", "recoveryStrategy", "<init>", "(JLcom/ironsource/s5;)V", "Lcom/ironsource/r5;", "feature", "(Lcom/ironsource/r5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class o5 implements p5 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timeoutInMills;

    /* renamed from: b, reason: from kotlin metadata */
    private final s5 recoveryStrategy;

    public o5(long j, s5 recoveryStrategy) {
        Intrinsics.checkNotNullParameter(recoveryStrategy, "recoveryStrategy");
        this.timeoutInMills = j;
        this.recoveryStrategy = recoveryStrategy;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o5(r5 feature) {
        this(feature.a(), feature.b());
        Intrinsics.checkNotNullParameter(feature, "feature");
    }

    @Override // com.json.p5
    /* renamed from: a, reason: from getter */
    public long getTimeoutInMills() {
        return this.timeoutInMills;
    }

    @Override // com.json.p5
    /* renamed from: b, reason: from getter */
    public s5 getRecoveryStrategy() {
        return this.recoveryStrategy;
    }
}
