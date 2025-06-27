package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0003\u0004J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0005"}, d2 = {"Lcom/ironsource/a3;", "", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface a3 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ironsource/a3$a;", "Lcom/ironsource/a3;", "", "a", "", "Z", "versionedFlow", "<init>", "(Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements a3 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean versionedFlow;

        public a(boolean z) {
            this.versionedFlow = z;
        }

        @Override // com.json.a3
        public void a() {
            m7.a(hc.x, new h7().a(m4.x, Boolean.valueOf(this.versionedFlow)).a());
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/a3$b;", "Lcom/ironsource/a3;", "", "a", "", "Z", "versionedFlow", "", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "J", "controllerLoadStartTime", "Lcom/ironsource/od;", "c", "Lcom/ironsource/od;", "()Lcom/ironsource/od;", "time", "<init>", "(ZJLcom/ironsource/od;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements a3 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean versionedFlow;

        /* renamed from: b, reason: from kotlin metadata */
        private final long controllerLoadStartTime;

        /* renamed from: c, reason: from kotlin metadata */
        private final od time;

        public b(boolean z, long j, od time) {
            Intrinsics.checkNotNullParameter(time, "time");
            this.versionedFlow = z;
            this.controllerLoadStartTime = j;
            this.time = time;
        }

        @Override // com.json.a3
        public void a() {
            h7 h7VarA = new h7().a(m4.x, Boolean.valueOf(this.versionedFlow));
            if (this.controllerLoadStartTime > 0) {
                h7VarA.a(m4.A, Long.valueOf(this.time.a() - this.controllerLoadStartTime));
            }
            m7.a(hc.w, h7VarA.a());
        }

        /* renamed from: b, reason: from getter */
        public final od getTime() {
            return this.time;
        }
    }

    void a();
}
