package com.json;

import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lcom/ironsource/q5;", "", "Lcom/ironsource/s5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface q5 {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ironsource/q5$a;", "Lcom/ironsource/q5;", "Lcom/ironsource/s5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "", "a", "Lcom/ironsource/s5;", "c", "()Lcom/ironsource/s5;", "strategy", "<init>", "(Lcom/ironsource/s5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements q5 {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final s5 strategy;

        public a(s5 strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            this.strategy = strategy;
        }

        @Override // com.json.q5
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.json.q5
        /* renamed from: b, reason: from getter */
        public s5 getStrategy() {
            return this.strategy;
        }

        public final s5 c() {
            return this.strategy;
        }
    }

    String a();

    /* renamed from: b */
    s5 getStrategy();
}
