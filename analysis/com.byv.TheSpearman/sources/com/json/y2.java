package com.json;

import com.json.pd;
import com.json.q5;
import com.json.t5;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00052\u00020\u0001:\u0004\u0005\u0006\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t"}, d2 = {"Lcom/ironsource/y2;", "", "Lcom/ironsource/y2$d;", "callback", "", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface y2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f2456a;

    /* renamed from: com.ironsource.y2$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        static {
            Companion companion = y2.INSTANCE;
        }

        @JvmStatic
        public static y2 a(r5 r5Var) {
            return y2.INSTANCE.a(r5Var);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/y2$a;", "Lcom/ironsource/y2;", "Lcom/ironsource/y2$d;", "callback", "", "a", "Lcom/ironsource/p5;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/ironsource/p5;", "config", "Lcom/ironsource/pd;", "c", "Lcom/ironsource/pd;", "timer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isProcessing", "<init>", "(Lcom/ironsource/p5;Lcom/ironsource/pd;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements y2 {

        /* renamed from: b, reason: from kotlin metadata */
        private final p5 config;

        /* renamed from: c, reason: from kotlin metadata */
        private final pd timer;

        /* renamed from: d, reason: from kotlin metadata */
        private final AtomicBoolean isProcessing;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/y2$a$a", "Lcom/ironsource/pd$a;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: com.ironsource.y2$a$a, reason: collision with other inner class name */
        public static final class C0254a implements pd.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f2455a;
            final /* synthetic */ a b;

            C0254a(d dVar, a aVar) {
                this.f2455a = dVar;
                this.b = aVar;
            }

            @Override // com.ironsource.pd.a
            public void a() {
                this.f2455a.a(new t5.Failure(new q5.a(this.b.config.getRecoveryStrategy())));
                this.b.isProcessing.set(false);
            }
        }

        public a(p5 config, pd timer) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(timer, "timer");
            this.config = config;
            this.timer = timer;
            this.isProcessing = new AtomicBoolean(false);
        }

        @Override // com.json.y2
        public synchronized void a() {
            this.timer.cancel();
            this.isProcessing.set(false);
        }

        @Override // com.json.y2
        public synchronized void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (this.isProcessing.compareAndSet(false, true)) {
                this.timer.a(new C0254a(callback, this));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"Lcom/ironsource/y2$b;", "Lcom/ironsource/y2;", "Lcom/ironsource/y2$d;", "callback", "", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements y2 {
        public static final b b = new b();

        private b() {
        }

        @Override // com.json.y2
        public void a() {
        }

        @Override // com.json.y2
        public void a(d callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/y2$c;", "", "Lcom/ironsource/r5;", "featureFlag", "Lcom/ironsource/y2;", "a", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: com.ironsource.y2$c, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f2456a = new Companion();

        private Companion() {
        }

        public final y2 a() {
            return b.b;
        }

        @JvmStatic
        public final y2 a(r5 featureFlag) {
            Intrinsics.checkNotNullParameter(featureFlag, "featureFlag");
            if (!featureFlag.c()) {
                return b.b;
            }
            o5 o5Var = new o5(featureFlag);
            return new a(o5Var, new pd.b(o5Var.getTimeoutInMills(), o5Var.getTimeoutInMills()));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/ironsource/y2$d;", "", "Lcom/ironsource/t5;", "result", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface d {
        void a(t5 result);
    }

    void a();

    void a(d callback);
}
