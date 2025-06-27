package com.json;

import android.os.CountDownTimer;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lcom/ironsource/pd;", "", "Lcom/ironsource/pd$a;", "callback", "", "a", "cancel", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface pd {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lcom/ironsource/pd$a;", "", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/pd$b;", "Lcom/ironsource/pd;", "Lcom/ironsource/pd$a;", "callback", "", "a", "cancel", "", "J", "millisInFuture", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "countDownInterval", "Landroid/os/CountDownTimer;", "c", "Landroid/os/CountDownTimer;", "timer", "<init>", "(JJ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements pd {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long millisInFuture;

        /* renamed from: b, reason: from kotlin metadata */
        private final long countDownInterval;

        /* renamed from: c, reason: from kotlin metadata */
        private CountDownTimer timer;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"com/ironsource/pd$b$a", "Landroid/os/CountDownTimer;", "", "millisUntilFinished", "", "onTick", "onFinish", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        public static final class a extends CountDownTimer {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ a f2066a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(a aVar, long j, long j2) {
                super(j, j2);
                this.f2066a = aVar;
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                this.f2066a.a();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
            }
        }

        public b(long j, long j2) {
            this.millisInFuture = j;
            this.countDownInterval = j2;
        }

        @Override // com.json.pd
        public synchronized void a(a callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            CountDownTimer countDownTimer = this.timer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            a aVar = new a(callback, this.millisInFuture, this.countDownInterval);
            this.timer = aVar;
            aVar.start();
        }

        @Override // com.json.pd
        public synchronized void cancel() {
            CountDownTimer countDownTimer = this.timer;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
        }
    }

    void a(a callback);

    void cancel();
}
