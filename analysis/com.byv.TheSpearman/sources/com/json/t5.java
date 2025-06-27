package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ironsource/t5;", "", "Lcom/ironsource/u5;", "handler", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface t5 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public static void a(t5 t5Var, u5 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0006HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/ironsource/t5$b;", "Lcom/ironsource/t5;", "Lcom/ironsource/u5;", "handler", "", "a", "Lcom/ironsource/q5;", "failure", "", "toString", "", "hashCode", "", "other", "", "equals", "Lcom/ironsource/q5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "()Lcom/ironsource/q5;", "<init>", "(Lcom/ironsource/q5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.t5$b, reason: from toString */
    public static final /* data */ class Failure implements t5 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final q5 failure;

        public Failure(q5 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            this.failure = failure;
        }

        public static /* synthetic */ Failure a(Failure failure, q5 q5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                q5Var = failure.failure;
            }
            return failure.a(q5Var);
        }

        /* renamed from: a, reason: from getter */
        public final q5 getFailure() {
            return this.failure;
        }

        public final Failure a(q5 failure) {
            Intrinsics.checkNotNullParameter(failure, "failure");
            return new Failure(failure);
        }

        @Override // com.json.t5
        public void a(u5 handler) {
            Intrinsics.checkNotNullParameter(handler, "handler");
            handler.a(this.failure);
        }

        public final q5 b() {
            return this.failure;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Failure) && Intrinsics.areEqual(this.failure, ((Failure) other).failure);
        }

        public int hashCode() {
            return this.failure.hashCode();
        }

        public String toString() {
            return "Failure(failure=" + this.failure + ')';
        }
    }

    void a(u5 handler);
}
