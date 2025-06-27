package com.json.environment.thread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.json.lc;
import com.json.t2;
import com.json.v8;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b9\u0010:J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J$\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nJ\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017R\"\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0017\u0010(\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010-\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010/\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010*R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0005\u00103R\u001b\u00108\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b5\u00102\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/ironsource/environment/thread/IronSourceThreadManager;", "", "Ljava/lang/Runnable;", t2.h.h, "", "a", "Ljava/util/concurrent/ThreadPoolExecutor;", "getThreadPoolExecutor", "shouldExecuteAsync", "shouldWaitUntilAllOperationsCompleted", "", "tasks", "", "executeTasks", "", "delay", "postOnUiThreadTask", "removeUiThreadTask", "postMediationBackgroundTask", "removeMediationBackgroundTask", "postAdapterBackgroundTask", "removeAdapterBackgroundTask", "postPublisherCallback", "", "name", "Lcom/ironsource/v8;", "createAndStartThread", "Z", "getUseSharedExecutorService", "()Z", "setUseSharedExecutorService", "(Z)V", "useSharedExecutorService", "Landroid/os/Handler;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/os/Handler;", "uiHandler", "c", "getInitHandler", "()Landroid/os/Handler;", "initHandler", "d", "Lcom/ironsource/v8;", "mediationBackgroundHandler", "e", "adapterBackgroundHandler", "f", "publisherCallbackHandler", "Lcom/ironsource/lc;", "g", "Lkotlin/Lazy;", "()Lcom/ironsource/lc;", "executorService", CmcdHeadersFactory.STREAMING_FORMAT_HLS, "getSharedManagersThread", "()Lcom/ironsource/v8;", "sharedManagersThread", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class IronSourceThreadManager {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static boolean useSharedExecutorService;

    /* renamed from: c, reason: from kotlin metadata */
    private static final Handler initHandler;

    /* renamed from: d, reason: from kotlin metadata */
    private static final v8 mediationBackgroundHandler;

    /* renamed from: e, reason: from kotlin metadata */
    private static final v8 adapterBackgroundHandler;

    /* renamed from: f, reason: from kotlin metadata */
    private static final v8 publisherCallbackHandler;

    /* renamed from: g, reason: from kotlin metadata */
    private static final Lazy executorService;

    /* renamed from: h, reason: from kotlin metadata */
    private static final Lazy sharedManagersThread;
    public static final IronSourceThreadManager INSTANCE = new IronSourceThreadManager();

    /* renamed from: b, reason: from kotlin metadata */
    private static final Handler uiHandler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/lc;", "a", "()Lcom/ironsource/lc;"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function0<lc> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1763a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lc invoke() {
            return new lc(0, null, null, 7, null);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/v8;", "a", "()Lcom/ironsource/v8;"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements Function0<v8> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1764a = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final v8 invoke() {
            v8 v8Var = new v8("managersThread");
            v8Var.start();
            v8Var.a();
            return v8Var;
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        initHandler = new Handler(handlerThread.getLooper());
        v8 v8Var = new v8("mediationBackground");
        v8Var.start();
        v8Var.a();
        mediationBackgroundHandler = v8Var;
        v8 v8Var2 = new v8("adapterBackground");
        v8Var2.start();
        v8Var2.a();
        adapterBackgroundHandler = v8Var2;
        v8 v8Var3 = new v8("publisher-callbacks");
        v8Var3.start();
        v8Var3.a();
        publisherCallbackHandler = v8Var3;
        executorService = LazyKt.lazy(a.f1763a);
        sharedManagersThread = LazyKt.lazy(b.f1764a);
    }

    private IronSourceThreadManager() {
    }

    private final lc a() {
        return (lc) executorService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Runnable it, final CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(latch, "$latch");
        it.run();
        new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                IronSourceThreadManager.a(latch);
            }
        }.run();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CountDownLatch latch) {
        Intrinsics.checkNotNullParameter(latch, "$latch");
        latch.countDown();
    }

    private final boolean a(Runnable action) {
        return useSharedExecutorService && a().getQueue().contains(action);
    }

    public static /* synthetic */ void postAdapterBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postAdapterBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postMediationBackgroundTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postMediationBackgroundTask(runnable, j);
    }

    public static /* synthetic */ void postOnUiThreadTask$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postOnUiThreadTask(runnable, j);
    }

    public static /* synthetic */ void postPublisherCallback$default(IronSourceThreadManager ironSourceThreadManager, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        ironSourceThreadManager.postPublisherCallback(runnable, j);
    }

    public final v8 createAndStartThread(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        v8 v8Var = new v8(name);
        v8Var.start();
        v8Var.a();
        return v8Var;
    }

    public final void executeTasks(boolean shouldExecuteAsync, boolean shouldWaitUntilAllOperationsCompleted, List<? extends Runnable> tasks) throws InterruptedException {
        Intrinsics.checkNotNullParameter(tasks, "tasks");
        if (!shouldExecuteAsync) {
            Iterator<T> it = tasks.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } else {
            if (!shouldWaitUntilAllOperationsCompleted) {
                Iterator<T> it2 = tasks.iterator();
                while (it2.hasNext()) {
                    postMediationBackgroundTask$default(INSTANCE, (Runnable) it2.next(), 0L, 2, null);
                }
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(tasks.size());
            for (final Runnable runnable : tasks) {
                postMediationBackgroundTask$default(INSTANCE, new Runnable() { // from class: com.ironsource.environment.thread.IronSourceThreadManager$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        IronSourceThreadManager.a(runnable, countDownLatch);
                    }
                }, 0L, 2, null);
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public final Handler getInitHandler() {
        return initHandler;
    }

    public final v8 getSharedManagersThread() {
        return (v8) sharedManagersThread.getValue();
    }

    public final ThreadPoolExecutor getThreadPoolExecutor() {
        return new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(), Runtime.getRuntime().availableProcessors(), Long.MAX_VALUE, TimeUnit.NANOSECONDS, new LinkedBlockingQueue());
    }

    public final boolean getUseSharedExecutorService() {
        return useSharedExecutorService;
    }

    public final void postAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postAdapterBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postAdapterBackgroundTask(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (useSharedExecutorService) {
            a().schedule(action, delay, TimeUnit.MILLISECONDS);
        } else {
            adapterBackgroundHandler.a(action, delay);
        }
    }

    public final void postMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postMediationBackgroundTask$default(this, action, 0L, 2, null);
    }

    public final void postMediationBackgroundTask(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (useSharedExecutorService) {
            a().schedule(action, delay, TimeUnit.MILLISECONDS);
        } else {
            mediationBackgroundHandler.a(action, delay);
        }
    }

    public final void postOnUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postOnUiThreadTask$default(this, action, 0L, 2, null);
    }

    public final void postOnUiThreadTask(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        uiHandler.postDelayed(action, delay);
    }

    public final void postPublisherCallback(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        postPublisherCallback$default(this, action, 0L, 2, null);
    }

    public final void postPublisherCallback(Runnable action, long delay) {
        Intrinsics.checkNotNullParameter(action, "action");
        publisherCallbackHandler.a(action, delay);
    }

    public final void removeAdapterBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            adapterBackgroundHandler.b(action);
        }
    }

    public final void removeMediationBackgroundTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (a(action)) {
            a().remove(action);
        } else {
            mediationBackgroundHandler.b(action);
        }
    }

    public final void removeUiThreadTask(Runnable action) {
        Intrinsics.checkNotNullParameter(action, "action");
        uiHandler.removeCallbacks(action);
    }

    public final void setUseSharedExecutorService(boolean z) {
        useSharedExecutorService = z;
    }
}
