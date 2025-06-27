package com.json;

import com.json.lifecycle.b;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/e5;", "Lcom/ironsource/j9;", "", "f", "", "e", "c", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "d", "Lcom/ironsource/pc;", "Lcom/ironsource/pc;", "task", "J", "sessionStartTime", "<init>", "(Lcom/ironsource/pc;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class e5 implements j9 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pc task;

    /* renamed from: b, reason: from kotlin metadata */
    private long sessionStartTime;

    public e5(pc task) {
        Intrinsics.checkNotNullParameter(task, "task");
        this.task = task;
        b.d().a(this);
        f();
    }

    private final long e() {
        return System.currentTimeMillis() - this.sessionStartTime;
    }

    private final void f() {
        this.sessionStartTime = System.currentTimeMillis();
    }

    @Override // com.json.j9
    public void a() {
    }

    @Override // com.json.j9
    public void b() {
        this.task.a(Long.valueOf(e()));
        this.task.run();
    }

    @Override // com.json.j9
    public void c() {
        f();
    }

    @Override // com.json.j9
    public void d() {
    }
}
