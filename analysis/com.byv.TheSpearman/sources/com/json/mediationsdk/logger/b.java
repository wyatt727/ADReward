package com.json.mediationsdk.logger;

import com.json.environment.thread.IronSourceThreadManager;
import com.json.mediationsdk.logger.IronSourceLogger;

/* loaded from: classes4.dex */
public class b extends IronSourceLogger {
    private static final String e = "publisher";
    private LogListener c;
    private boolean d;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1967a;
        final /* synthetic */ IronSourceLogger.IronSourceTag b;
        final /* synthetic */ int c;

        a(String str, IronSourceLogger.IronSourceTag ironSourceTag, int i) {
            this.f1967a = str;
            this.b = ironSourceTag;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.c == null || this.f1967a == null) {
                return;
            }
            b.this.c.onLog(this.b, this.f1967a, this.c);
        }
    }

    private b() {
        super(e);
    }

    public b(LogListener logListener, int i) {
        super(e, i);
        this.c = logListener;
        this.d = false;
    }

    public void a(LogListener logListener) {
        this.c = logListener;
    }

    public void a(boolean z) {
        this.d = z;
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        a aVar = new a(str, ironSourceTag, i);
        if (this.d) {
            IronSourceThreadManager.INSTANCE.postOnUiThreadTask(aVar);
        } else {
            IronSourceThreadManager.INSTANCE.postPublisherCallback(aVar);
        }
    }

    @Override // com.json.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        if (th != null) {
            log(ironSourceTag, th.getMessage(), 3);
        }
    }
}
