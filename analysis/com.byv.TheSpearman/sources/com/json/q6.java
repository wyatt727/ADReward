package com.json;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.json.environment.thread.IronSourceThreadManager;
import com.json.mediationsdk.logger.IronLog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/ironsource/q6;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public interface q6 {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\bB\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tR$\u0010\u000f\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\b\u0010\r\"\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/q6$a;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Ljava/lang/Runnable;", "runnable", "", "predicate", "", "a", "", "instanceId", "message", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static class a<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private T listener;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/ironsource/q6$a$a;", "Ljava/lang/Runnable;", "", "run", "a", "Ljava/lang/Runnable;", "runnable", "<init>", "(Ljava/lang/Runnable;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: com.ironsource.q6$a$a, reason: collision with other inner class name */
        public static final class RunnableC0241a implements Runnable {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final Runnable runnable;

            public RunnableC0241a(Runnable runnable) {
                Intrinsics.checkNotNullParameter(runnable, "runnable");
                this.runnable = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.runnable.run();
                } catch (Throwable th) {
                    IronLog.INTERNAL.error("ISDemandOnlyBaseListenerWrapper: " + th.getMessage());
                }
            }
        }

        public static /* synthetic */ void a(a aVar, Runnable runnable, boolean z, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: executeOnUIThreadIfConditionMet");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            aVar.a(runnable, z);
        }

        public final T a() {
            return this.listener;
        }

        public final void a(T t) {
            this.listener = t;
        }

        public final void a(Runnable runnable, boolean predicate) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (predicate) {
                IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, new RunnableC0241a(runnable), 0L, 2, null);
            }
        }

        public final void a(String instanceId, String message) {
            Intrinsics.checkNotNullParameter(instanceId, "instanceId");
            Intrinsics.checkNotNullParameter(message, "message");
            IronLog.CALLBACK.info(message + " instanceId=" + instanceId);
        }
    }
}
